package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestBackgroundC2Type extends StObject {
  
  /**
    * Optional.
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var scripts: js.Array[ExtensionURL]
}
object WebExtensionManifestBackgroundC2Type {
  
  inline def apply(scripts: js.Array[ExtensionURL]): WebExtensionManifestBackgroundC2Type = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestBackgroundC2Type]
  }
  
  extension [Self <: WebExtensionManifestBackgroundC2Type](x: Self) {
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setScripts(value: js.Array[ExtensionURL]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: ExtensionURL*): Self = StObject.set(x, "scripts", js.Array(value*))
  }
}
