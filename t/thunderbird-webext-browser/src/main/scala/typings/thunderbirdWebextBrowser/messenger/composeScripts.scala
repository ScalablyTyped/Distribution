package typings.thunderbirdWebextBrowser.messenger

import typings.thunderbirdWebextBrowser.messenger.extensionTypes.ExtensionFileOrCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeScripts {
  
  trait RegisteredComposeScript extends StObject {
    
    /** Unregister a compose script registered programmatically */
    def unregister(): js.Promise[Any]
  }
  object RegisteredComposeScript {
    
    inline def apply(unregister: () => js.Promise[Any]): RegisteredComposeScript = {
      val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[RegisteredComposeScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredComposeScript] (val x: Self) extends AnyVal {
      
      inline def setUnregister(value: () => js.Promise[Any]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
  
  trait RegisteredComposeScriptOptions extends StObject {
    
    /** The list of CSS files to inject */
    var css: js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
    
    /** The list of JavaScript files to inject */
    @JSName("js")
    var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
  }
  object RegisteredComposeScriptOptions {
    
    inline def apply(): RegisteredComposeScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisteredComposeScriptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredComposeScriptOptions] (val x: Self) extends AnyVal {
      
      inline def setCss(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setJs_(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setJs_Varargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "js", js.Array(value*))
    }
  }
}
