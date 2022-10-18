package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeSettingsOverridesType extends StObject {
  
  /**
    * Optional.
    */
  var homepage: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var search_provider: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderType] = js.undefined
}
object WebExtensionManifestChromeSettingsOverridesType {
  
  inline def apply(): WebExtensionManifestChromeSettingsOverridesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverridesType]
  }
  
  extension [Self <: WebExtensionManifestChromeSettingsOverridesType](x: Self) {
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setSearch_provider(value: WebExtensionManifestChromeSettingsOverridesSearchProviderType): Self = StObject.set(x, "search_provider", value.asInstanceOf[js.Any])
    
    inline def setSearch_providerUndefined: Self = StObject.set(x, "search_provider", js.undefined)
  }
}
