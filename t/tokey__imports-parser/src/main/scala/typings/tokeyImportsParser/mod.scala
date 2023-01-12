package typings.tokeyImportsParser

import typings.std.Record
import typings.tokeyCore.distTypesMod.Descriptors
import typings.tokeyCore.distTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tokey/imports-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseImports(source: String): js.Array[ImportValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(source: String, blockStart: String): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(source: String, blockStart: String, blockEnd: String): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(source: String, blockStart: String, blockEnd: String, taggedImportSupport: Boolean): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: String,
    blockEnd: String,
    taggedImportSupport: Boolean,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: String,
    blockEnd: String,
    taggedImportSupport: Unit,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(source: String, blockStart: String, blockEnd: Unit, taggedImportSupport: Boolean): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: String,
    blockEnd: Unit,
    taggedImportSupport: Boolean,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: String,
    blockEnd: Unit,
    taggedImportSupport: Unit,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(source: String, blockStart: Unit, blockEnd: String): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(source: String, blockStart: Unit, blockEnd: String, taggedImportSupport: Boolean): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: Unit,
    blockEnd: String,
    taggedImportSupport: Boolean,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: Unit,
    blockEnd: String,
    taggedImportSupport: Unit,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(source: String, blockStart: Unit, blockEnd: Unit, taggedImportSupport: Boolean): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: Unit,
    blockEnd: Unit,
    taggedImportSupport: Boolean,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  inline def parseImports(
    source: String,
    blockStart: Unit,
    blockEnd: Unit,
    taggedImportSupport: Unit,
    strictSemiColon: Boolean
  ): js.Array[ImportValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseImports")(source.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], taggedImportSupport.asInstanceOf[js.Any], strictSemiColon.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportValue]]
  
  type CodeToken = Token[Descriptors | Delimiters]
  
  object Delimiters {
    
    inline def Asterisk: typings.tokeyImportsParser.tokeyImportsParserStrings.Asterisk = "*".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.Asterisk]
    
    inline def Colon: typings.tokeyImportsParser.tokeyImportsParserStrings.Colon = ":".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.Colon]
    
    inline def Comma: typings.tokeyImportsParser.tokeyImportsParserStrings.Comma = ",".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.Comma]
    
    inline def Leftcurlybracket: typings.tokeyImportsParser.tokeyImportsParserStrings.Leftcurlybracket = "{".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.Leftcurlybracket]
    
    inline def Leftparenthesis: /* ( */ String = "(".asInstanceOf[/* ( */ String]
    
    inline def Rightcurlybracket: typings.tokeyImportsParser.tokeyImportsParserStrings.Rightcurlybracket = "}".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.Rightcurlybracket]
    
    inline def Rightparenthesis: /* ) */ String = ")".asInstanceOf[/* ) */ String]
    
    inline def Semicolon: typings.tokeyImportsParser.tokeyImportsParserStrings.Semicolon = ";".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.Semicolon]
    
    inline def `[`: typings.tokeyImportsParser.tokeyImportsParserStrings.`[` = "[".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.`[`]
    
    inline def `]`: typings.tokeyImportsParser.tokeyImportsParserStrings.`]` = "]".asInstanceOf[typings.tokeyImportsParser.tokeyImportsParserStrings.`]`]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.tokeyImportsParser.tokeyImportsParserStrings.Comma
    - typings.tokeyImportsParser.tokeyImportsParserStrings.Semicolon
    - typings.tokeyImportsParser.tokeyImportsParserStrings.Colon
    - typings.tokeyImportsParser.tokeyImportsParserStrings.Leftcurlybracket
    - typings.tokeyImportsParser.tokeyImportsParserStrings.Rightcurlybracket
    - typings.tokeyImportsParser.tokeyImportsParserStrings.`[`
    - typings.tokeyImportsParser.tokeyImportsParserStrings.`]`
    - / * ( * / java.lang.String
    - typings.tokeyImportsParser.tokeyImportsParserStrings.Asterisk
  */
  type Delimiters = _Delimiters | (/* ( */ String)
  
  trait ImportValue extends StObject {
    
    var defaultName: js.UndefOr[String] = js.undefined
    
    var end: Double
    
    var errors: js.Array[String]
    
    var from: js.UndefOr[String] = js.undefined
    
    var named: js.UndefOr[Record[String, String]] = js.undefined
    
    var star: Boolean
    
    var start: Double
    
    var tagged: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
  }
  object ImportValue {
    
    inline def apply(end: Double, errors: js.Array[String], star: Boolean, start: Double): ImportValue = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportValue] (val x: Self) extends AnyVal {
      
      inline def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
      
      inline def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setNamed(value: Record[String, String]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
      
      inline def setStar(value: Boolean): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTagged(value: Record[String, Record[String, String]]): Self = StObject.set(x, "tagged", value.asInstanceOf[js.Any])
      
      inline def setTaggedUndefined: Self = StObject.set(x, "tagged", js.undefined)
    }
  }
  
  trait _Delimiters extends StObject
}
