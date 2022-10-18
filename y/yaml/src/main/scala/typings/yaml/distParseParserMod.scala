package typings.yaml

import typings.std.Generator
import typings.yaml.distParseCstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseParserMod {
  
  @JSImport("yaml/dist/parse/parser", "Parser")
  @js.native
  /**
    * @param onNewLine - If defined, called separately with the start position of
    *   each new line (in `parse()`, including the start of input).
    */
  open class Parser () extends StObject {
    def this(onNewLine: js.Function1[/* offset */ Double, Unit]) = this()
    
    /* private */ var atIndentedComment: Any = js.native
    
    /** If true, space and sequence indicators count as indentation */
    /* private */ var atNewLine: Any = js.native
    
    /** If true, next token is a scalar value */
    /* private */ var atScalar: Any = js.native
    
    /* private */ var blockMap: Any = js.native
    
    /* private */ var blockScalar: Any = js.native
    
    /* private */ var blockSequence: Any = js.native
    
    /* private */ var document: Any = js.native
    
    /* private */ var documentEnd: Any = js.native
    
    /** Call at end of input to push out any remaining constructions */
    def end(): Generator[Token, Unit, Any] = js.native
    
    /* private */ var flowCollection: Any = js.native
    
    /* private */ var flowScalar: Any = js.native
    
    /** Current indentation level */
    /* private */ var indent: Any = js.native
    
    /* private */ var lexer: Any = js.native
    
    /* private */ var lineEnd: Any = js.native
    
    /**
      * Advance the parser by the `source` of one lexical token.
      */
    def next(source: String): Generator[Token, Unit, Any] = js.native
    
    /** Current offset since the start of parsing */
    var offset: Double = js.native
    
    /** On the same line with a block map key */
    /* private */ var onKeyLine: Any = js.native
    
    /* private */ var onNewLine: Any = js.native
    
    /**
      * Parse `source` as a YAML stream.
      * If `incomplete`, a part of the last line may be left as a buffer for the next call.
      *
      * Errors are not thrown, but yielded as `{ type: 'error', message }` tokens.
      *
      * @returns A generator of tokens representing each directive, document, and other structure.
      */
    def parse(source: String): Generator[Token, Unit, Any] = js.native
    def parse(source: String, incomplete: Boolean): Generator[Token, Unit, Any] = js.native
    
    /* private */ var peek: Any = js.native
    
    /* private */ var pop: Any = js.native
    
    /* private */ var scalar: Any = js.native
    
    /** The source of the current token, set in parse() */
    /* private */ var source: Any = js.native
    
    /* private */ def sourceToken: Any = js.native
    
    /** Top indicates the node that's currently being built */
    var stack: js.Array[Token] = js.native
    
    /* private */ var startBlockValue: Any = js.native
    
    /* private */ var step: Any = js.native
    
    /* private */ var stream: Any = js.native
    
    /** The type of the current token, set in parse() */
    /* private */ var `type`: Any = js.native
  }
}
