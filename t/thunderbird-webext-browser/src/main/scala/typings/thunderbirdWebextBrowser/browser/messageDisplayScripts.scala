package typings.thunderbirdWebextBrowser.browser

import typings.thunderbirdWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDisplayScripts {
  
  trait RegisteredMessageDisplayScript extends StObject {
    
    /** Unregister a message display script registered programmatically */
    def unregister(): js.Promise[Any]
  }
  object RegisteredMessageDisplayScript {
    
    inline def apply(unregister: () => js.Promise[Any]): RegisteredMessageDisplayScript = {
      val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[RegisteredMessageDisplayScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredMessageDisplayScript] (val x: Self) extends AnyVal {
      
      inline def setUnregister(value: () => js.Promise[Any]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
  
  trait RegisteredMessageDisplayScriptOptions extends StObject {
    
    /** The list of CSS files to inject */
    var css: js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
    
    /** The list of JavaScript files to inject */
    @JSName("js")
    var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
  }
  object RegisteredMessageDisplayScriptOptions {
    
    inline def apply(): RegisteredMessageDisplayScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisteredMessageDisplayScriptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredMessageDisplayScriptOptions] (val x: Self) extends AnyVal {
      
      inline def setCss(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setJs_(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setJs_Varargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "js", js.Array(value*))
    }
  }
}
