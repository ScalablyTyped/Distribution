package typings.structuredHeaders

import typings.std.Error
import typings.structuredHeaders.typesMod.Dictionary
import typings.structuredHeaders.typesMod.Item
import typings.structuredHeaders.typesMod.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("structured-headers/dist/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("structured-headers/dist/parser", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Parser {
    def this(input: String) = this()
  }
  
  @JSImport("structured-headers/dist/parser", "ParseError")
  @js.native
  open class ParseError protected ()
    extends StObject
       with Error {
    def this(position: Double, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def parseDictionary(input: String): Dictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDictionary")(input.asInstanceOf[js.Any]).asInstanceOf[Dictionary]
  
  inline def parseItem(input: String): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("parseItem")(input.asInstanceOf[js.Any]).asInstanceOf[Item]
  
  inline def parseList(input: String): List = ^.asInstanceOf[js.Dynamic].applyDynamic("parseList")(input.asInstanceOf[js.Any]).asInstanceOf[List]
  
  @js.native
  trait Parser extends StObject {
    
    /* private */ var checkTrail: Any = js.native
    
    /* private */ var eof: Any = js.native
    
    /**
      * Checks if the next character is 'char', and fail otherwise.
      */
    /* private */ var expectChar: Any = js.native
    
    /* private */ var getChar: Any = js.native
    
    var input: String = js.native
    
    /**
      * Looks at the next character without advancing the cursor.
      */
    /* private */ var lookChar: Any = js.native
    
    /* private */ var parseBareItem: Any = js.native
    
    /* private */ var parseBoolean: Any = js.native
    
    /* private */ var parseByteSequence: Any = js.native
    
    def parseDictionary(): Dictionary = js.native
    
    /* private */ var parseInnerList: Any = js.native
    
    /* private */ var parseIntegerOrDecimal: Any = js.native
    
    def parseItem(): Item = js.native
    def parseItem(standaloneItem: Boolean): Item = js.native
    
    /* private */ var parseItemOrInnerList: Any = js.native
    
    /* private */ var parseKey: Any = js.native
    
    def parseList(): List = js.native
    
    /* private */ var parseParameters: Any = js.native
    
    /* private */ var parseString: Any = js.native
    
    /* private */ var parseToken: Any = js.native
    
    var pos: Double = js.native
    
    /* private */ var skipOWS: Any = js.native
    
    /* private */ var skipWS: Any = js.native
  }
}
