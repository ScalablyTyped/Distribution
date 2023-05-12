package typings.thunderbirdWebextBrowser.messenger.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestTelemetryPublicKey extends StObject {
  
  var id: String
  
  var key: WebExtensionManifestTelemetryPublicKeyKey
}
object WebExtensionManifestTelemetryPublicKey {
  
  inline def apply(id: String, key: WebExtensionManifestTelemetryPublicKeyKey): WebExtensionManifestTelemetryPublicKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestTelemetryPublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestTelemetryPublicKey] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: WebExtensionManifestTelemetryPublicKeyKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
