package typings.yaml

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lexerMod {
  
  @JSImport("yaml/dist/parse/lexer", "Lexer")
  @js.native
  open class Lexer () extends StObject {
    
    /**
      * Flag indicating whether the end of the current buffer marks the end of
      * all input
      */
    /* private */ var atEnd: Any = js.native
    
    /* private */ var atLineEnd: Any = js.native
    
    /**
      * Explicit indent set in block scalar header, as an offset from the current
      * minimum indent, so e.g. set to 1 from a header `|2+`. Set to -1 if not
      * explicitly set.
      */
    /* private */ var blockScalarIndent: Any = js.native
    
    /**
      * Block scalars that include a + (keep) chomping indicator in their header
      * include trailing empty lines, which are otherwise excluded from the
      * scalar's contents.
      */
    /* private */ var blockScalarKeep: Any = js.native
    
    /** Current input */
    /* private */ var buffer: Any = js.native
    
    /* private */ var charAt: Any = js.native
    
    /* private */ var continueScalar: Any = js.native
    
    /**
      * Flag noting whether the map value indicator : can immediately follow this
      * node within a flow context.
      */
    /* private */ var flowKey: Any = js.native
    
    /** Count of surrounding flow collection levels. */
    /* private */ var flowLevel: Any = js.native
    
    /* private */ var getLine: Any = js.native
    
    /* private */ var hasChars: Any = js.native
    
    /**
      * Minimum level of indentation required for next lines to be parsed as a
      * part of the current scalar value.
      */
    /* private */ var indentNext: Any = js.native
    
    /** Indentation level of the current line. */
    /* private */ var indentValue: Any = js.native
    
    /**
      * Generate YAML tokens from the `source` string. If `incomplete`,
      * a part of the last line may be left as a buffer for the next call.
      *
      * @returns A generator of lexical tokens
      */
    def lex(source: String): Generator[String, Unit, Any] = js.native
    def lex(source: String, incomplete: Boolean): Generator[String, Unit, Any] = js.native
    
    /** Position of the next \n character. */
    /* private */ var lineEndPos: Any = js.native
    
    /** Stores the state of the lexer if reaching the end of incpomplete input */
    /* private */ var next: Any = js.native
    
    /* private */ var parseBlockScalar: Any = js.native
    
    /* private */ var parseBlockScalarHeader: Any = js.native
    
    /* private */ var parseBlockStart: Any = js.native
    
    /* private */ var parseDocument: Any = js.native
    
    /* private */ var parseFlowCollection: Any = js.native
    
    /* private */ var parseLineStart: Any = js.native
    
    /* private */ var parseNext: Any = js.native
    
    /* private */ var parsePlainScalar: Any = js.native
    
    /* private */ var parseQuotedScalar: Any = js.native
    
    /* private */ var parseStream: Any = js.native
    
    /* private */ var peek: Any = js.native
    
    /** A pointer to `buffer`; the current position of the lexer. */
    /* private */ var pos: Any = js.native
    
    /* private */ var pushCount: Any = js.native
    
    /* private */ var pushIndicators: Any = js.native
    
    /* private */ var pushNewline: Any = js.native
    
    /* private */ var pushSpaces: Any = js.native
    
    /* private */ var pushTag: Any = js.native
    
    /* private */ var pushToIndex: Any = js.native
    
    /* private */ var pushUntil: Any = js.native
    
    /* private */ var setNext: Any = js.native
  }
}
