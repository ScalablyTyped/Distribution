package typings.trezorConnect.stellarMod

import typings.trezorConnect.protobufMod.StellarAssetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarAsset extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var `type`: StellarAssetType
}
object StellarAsset {
  
  inline def apply(`type`: StellarAssetType): StellarAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarAsset]
  }
  
  extension [Self <: StellarAsset](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setType(value: StellarAssetType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
