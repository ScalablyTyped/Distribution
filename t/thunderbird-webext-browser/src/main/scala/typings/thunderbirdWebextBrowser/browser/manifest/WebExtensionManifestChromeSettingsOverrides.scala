package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeSettingsOverrides extends StObject {
  
  var search_provider: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProvider] = js.undefined
}
object WebExtensionManifestChromeSettingsOverrides {
  
  inline def apply(): WebExtensionManifestChromeSettingsOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestChromeSettingsOverrides] (val x: Self) extends AnyVal {
    
    inline def setSearch_provider(value: WebExtensionManifestChromeSettingsOverridesSearchProvider): Self = StObject.set(x, "search_provider", value.asInstanceOf[js.Any])
    
    inline def setSearch_providerUndefined: Self = StObject.set(x, "search_provider", js.undefined)
  }
}
