package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeUrlOverridesType extends StObject {
  
  /**
    * Optional.
    */
  var newtab: js.UndefOr[ExtensionURL] = js.undefined
}
object WebExtensionManifestChromeUrlOverridesType {
  
  inline def apply(): WebExtensionManifestChromeUrlOverridesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeUrlOverridesType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestChromeUrlOverridesType] (val x: Self) extends AnyVal {
    
    inline def setNewtab(value: ExtensionURL): Self = StObject.set(x, "newtab", value.asInstanceOf[js.Any])
    
    inline def setNewtabUndefined: Self = StObject.set(x, "newtab", js.undefined)
  }
}
