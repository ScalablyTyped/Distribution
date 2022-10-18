package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestUserScriptsType extends StObject {
  
  /**
    * Optional.
    */
  var api_script: js.UndefOr[ExtensionURL] = js.undefined
}
object WebExtensionManifestUserScriptsType {
  
  inline def apply(): WebExtensionManifestUserScriptsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestUserScriptsType]
  }
  
  extension [Self <: WebExtensionManifestUserScriptsType](x: Self) {
    
    inline def setApi_script(value: ExtensionURL): Self = StObject.set(x, "api_script", value.asInstanceOf[js.Any])
    
    inline def setApi_scriptUndefined: Self = StObject.set(x, "api_script", js.undefined)
  }
}
