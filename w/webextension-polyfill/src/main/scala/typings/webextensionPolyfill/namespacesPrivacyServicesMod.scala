package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesTypesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesPrivacyServicesMod {
  
  object PrivacyServices {
    
    trait Static extends StObject {
      
      /**
        * If enabled, the password manager will ask if you want to save passwords. This preference's value is a boolean,
        * defaulting to <code>true</code>.
        */
      var passwordSavingEnabled: Setting
    }
    object Static {
      
      inline def apply(passwordSavingEnabled: Setting): Static = {
        val __obj = js.Dynamic.literal(passwordSavingEnabled = passwordSavingEnabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setPasswordSavingEnabled(value: Setting): Self = StObject.set(x, "passwordSavingEnabled", value.asInstanceOf[js.Any])
      }
    }
  }
}
