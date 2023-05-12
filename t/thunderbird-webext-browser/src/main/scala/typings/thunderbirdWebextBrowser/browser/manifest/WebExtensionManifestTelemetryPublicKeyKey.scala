package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestTelemetryPublicKeyKey extends StObject {
  
  var crv: js.UndefOr[String] = js.undefined
  
  var kty: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[String] = js.undefined
  
  var y: js.UndefOr[String] = js.undefined
}
object WebExtensionManifestTelemetryPublicKeyKey {
  
  inline def apply(): WebExtensionManifestTelemetryPublicKeyKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestTelemetryPublicKeyKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestTelemetryPublicKeyKey] (val x: Self) extends AnyVal {
    
    inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
