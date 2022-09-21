package typings.webextensionPolyfill

import typings.webextensionPolyfill.manifestMod.Manifest.HttpURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod {
  
  object Identity {
    
    /**
      * An object encapsulating an OAuth account id.
      */
    trait AccountInfo extends StObject {
      
      /**
        * A unique identifier for the account. This ID will not change for the lifetime of the account.
        */
      var id: String
    }
    object AccountInfo {
      
      inline def apply(id: String): AccountInfo = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[AccountInfo]
      }
      
      extension [Self <: AccountInfo](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    trait LaunchWebAuthFlowDetailsType extends StObject {
      
      /**
        * Optional.
        */
      var interactive: js.UndefOr[Boolean] = js.undefined
      
      var url: HttpURL
    }
    object LaunchWebAuthFlowDetailsType {
      
      inline def apply(url: HttpURL): LaunchWebAuthFlowDetailsType = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[LaunchWebAuthFlowDetailsType]
      }
      
      extension [Self <: LaunchWebAuthFlowDetailsType](x: Self) {
        
        inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
        
        inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
        
        inline def setUrl(value: HttpURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Generates a redirect URL to be used in |launchWebAuthFlow|.
        *
        * @param path Optional. The path appended to the end of the generated URL.
        */
      def getRedirectURL(): String = js.native
      def getRedirectURL(path: String): String = js.native
      
      /**
        * Starts an auth flow at the specified URL.
        *
        * @param details
        */
      def launchWebAuthFlow(details: LaunchWebAuthFlowDetailsType): js.Promise[String] = js.native
    }
  }
}
