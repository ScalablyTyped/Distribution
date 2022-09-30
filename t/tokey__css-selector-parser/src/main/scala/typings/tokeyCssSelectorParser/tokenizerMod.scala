package typings.tokeyCssSelectorParser

import typings.tokeyCore.typesMod.Descriptors
import typings.tokeyCore.typesMod.Token
import typings.tokeyCssSelectorParser.anon.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("@tokey/css-selector-parser/dist/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenizeSelector(source: String): js.Array[CSSSelectorToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeSelector")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSSelectorToken]]
  inline def tokenizeSelector(source: String, options: Offset): js.Array[CSSSelectorToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeSelector")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CSSSelectorToken]]
  
  type CSSSelectorToken = Token[Descriptors | Delimiters]
  
  object Delimiters {
    
    inline def Ampersand: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Ampersand = "&".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Ampersand]
    
    inline def Asterisk: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Asterisk = "*".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Asterisk]
    
    inline def Colon: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Colon = ":".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Colon]
    
    inline def Comma: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Comma = ",".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Comma]
    
    inline def Dot: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Dot = ".".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Dot]
    
    inline def Greaterthansign: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign = ">".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign]
    
    inline def Leftcurlybracket: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Leftcurlybracket = "{".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Leftcurlybracket]
    
    inline def Leftparenthesis: String = String.asInstanceOf[String]
    
    inline def Numbersign: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Numbersign = "#".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Numbersign]
    
    inline def Plussign: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign = "+".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign]
    
    inline def Rightcurlybracket: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Rightcurlybracket = "}".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Rightcurlybracket]
    
    inline def Rightparenthesis: String = String.asInstanceOf[String]
    
    inline def Tilde: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde = "~".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde]
    
    inline def Verticalline: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Verticalline = "|".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Verticalline]
    
    inline def `[`: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`[` = "[".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`[`]
    
    inline def `]`: typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`]` = "]".asInstanceOf[typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`]`]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`[`
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`]`
    - java.lang.String
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Comma
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Asterisk
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Verticalline
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Colon
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Dot
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Numbersign
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Leftcurlybracket
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Rightcurlybracket
    - typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Ampersand
  */
  type Delimiters = _Delimiters | String
  
  trait _Delimiters extends StObject
}
