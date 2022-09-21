package typings.yaml

import typings.std.Generator
import typings.yaml.anon.Comment
import typings.yaml.anon.Offset
import typings.yaml.cstMod.Token
import typings.yaml.documentMod.Document.Parsed
import typings.yaml.errorsMod.ErrorCode
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.nodeMod.Range
import typings.yaml.optionsMod.DocumentOptions
import typings.yaml.optionsMod.ParseOptions
import typings.yaml.optionsMod.SchemaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composerMod {
  
  @JSImport("yaml/dist/compose/composer", "Composer")
  @js.native
  open class Composer () extends StObject {
    def this(options: ParseOptions & DocumentOptions & SchemaOptions) = this()
    
    /* private */ var atDirectives: Any = js.native
    
    /**
      * Compose tokens into documents.
      *
      * @param forceDoc - If the stream contains no document, still emit a final document including any comments and directives that would be applied to a subsequent document.
      * @param endOffset - Should be set if `forceDoc` is also set, to set the document range end and to indicate errors correctly.
      */
    def compose(tokens: js.Iterable[Token]): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    def compose(tokens: js.Iterable[Token], forceDoc: Boolean): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    def compose(tokens: js.Iterable[Token], forceDoc: Boolean, endOffset: Double): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    def compose(tokens: js.Iterable[Token], forceDoc: Unit, endOffset: Double): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    
    /* private */ var decorate: Any = js.native
    
    /* private */ var directives: Any = js.native
    
    /* private */ var doc: Any = js.native
    
    /**
      * Call at end of input to yield any remaining document.
      *
      * @param forceDoc - If the stream contains no document, still emit a final document including any comments and directives that would be applied to a subsequent document.
      * @param endOffset - Should be set if `forceDoc` is also set, to set the document range end and to indicate errors correctly.
      */
    def end(): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    def end(forceDoc: Boolean): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    def end(forceDoc: Boolean, endOffset: Double): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    def end(forceDoc: Unit, endOffset: Double): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    
    /* private */ var errors: Any = js.native
    
    /** Advance the composer by one CST token. */
    def next(token: Token): Generator[Parsed[ParsedNode], Unit, Any] = js.native
    
    /* private */ var onError: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var prelude: Any = js.native
    
    /**
      * Current stream status information.
      *
      * Mostly useful at the end of input for an empty stream.
      */
    def streamInfo(): Comment = js.native
    
    /* private */ var warnings: Any = js.native
  }
  
  type ComposeErrorHandler = js.Function4[
    /* source */ ErrorSource, 
    /* code */ ErrorCode, 
    /* message */ String, 
    /* warning */ js.UndefOr[Boolean], 
    Unit
  ]
  
  type ErrorSource = Double | (js.Tuple2[Double, Double]) | Range | Offset
}
