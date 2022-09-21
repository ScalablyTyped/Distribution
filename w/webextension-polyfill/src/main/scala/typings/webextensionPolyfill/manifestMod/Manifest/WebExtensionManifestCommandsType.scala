package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestCommandsType extends StObject {
  
  /**
    * Optional.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var suggested_key: js.UndefOr[WebExtensionManifestCommandsSuggestedKeyType] = js.undefined
}
object WebExtensionManifestCommandsType {
  
  inline def apply(): WebExtensionManifestCommandsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestCommandsType]
  }
  
  extension [Self <: WebExtensionManifestCommandsType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSuggested_key(value: WebExtensionManifestCommandsSuggestedKeyType): Self = StObject.set(x, "suggested_key", value.asInstanceOf[js.Any])
    
    inline def setSuggested_keyUndefined: Self = StObject.set(x, "suggested_key", js.undefined)
  }
}
