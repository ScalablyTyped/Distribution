package typings.urlVariables

import typings.urlVariables.dictionaryMod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlvariablesMod {
  
  @JSImport("url-variables/lib/URLVariables", "URLVariables")
  @js.native
  /**
    * Default Constructor.
    */
  class URLVariables () extends Dictionary[String] {
    /**
      * Construct from a URL-encoded string.
      *
      * The {@link decode decode()} method is automatically called to convert the string to properties of the {@link URLVariables} object.
      *
      * @param str A URL-encoded string containing name/value pairs.
      */
    def this(str: String) = this()
    
    /**
      * @hidden
      */
    var _Parse: js.Any = js.native
  }
  object URLVariables {
    
    @JSImport("url-variables/lib/URLVariables", "URLVariables.parse")
    @js.native
    def parse[T](str: String): T = js.native
    @JSImport("url-variables/lib/URLVariables", "URLVariables.parse")
    @js.native
    def parse[T](str: String, autoCase: Boolean): T = js.native
    
    @JSImport("url-variables/lib/URLVariables", "URLVariables.stringify")
    @js.native
    def stringify[T](obj: T): String = js.native
    
    type Iterator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<string, string> */ js.Any
    
    type ReverseIterator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.ReverseIterator<string, string> */ js.Any
  }
}
