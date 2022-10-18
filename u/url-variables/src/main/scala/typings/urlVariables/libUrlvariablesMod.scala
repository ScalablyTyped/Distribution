package typings.urlVariables

import typings.urlVariables.libInternalDictionaryMod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUrlvariablesMod {
  
  @JSImport("url-variables/lib/URLVariables", "URLVariables")
  @js.native
  /**
    * Default Constructor.
    */
  open class URLVariables () extends Dictionary[String] {
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
    /* private */ var _Parse: Any = js.native
  }
  object URLVariables {
    
    @JSImport("url-variables/lib/URLVariables", "URLVariables")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse[T](str: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def parse[T](str: String, autoCase: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], autoCase.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def stringify[T](obj: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    
    type Iterator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<string, string> */ Any
    
    type ReverseIterator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.ReverseIterator<string, string> */ Any
  }
}
