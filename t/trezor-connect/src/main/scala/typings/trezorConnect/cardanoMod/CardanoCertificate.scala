package typings.trezorConnect.cardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoCertificate extends StObject {
  
  var keyHash: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var pool: js.UndefOr[String] = js.undefined
  
  var poolParameters: js.UndefOr[CardanoPoolParameters] = js.undefined
  
  var scriptHash: js.UndefOr[String] = js.undefined
  
  var `type`: typings.trezorConnect.protobufMod.CardanoCertificateType
}
object CardanoCertificate {
  
  inline def apply(`type`: typings.trezorConnect.protobufMod.CardanoCertificateType): CardanoCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoCertificate]
  }
  
  extension [Self <: CardanoCertificate](x: Self) {
    
    inline def setKeyHash(value: String): Self = StObject.set(x, "keyHash", value.asInstanceOf[js.Any])
    
    inline def setKeyHashUndefined: Self = StObject.set(x, "keyHash", js.undefined)
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolParameters(value: CardanoPoolParameters): Self = StObject.set(x, "poolParameters", value.asInstanceOf[js.Any])
    
    inline def setPoolParametersUndefined: Self = StObject.set(x, "poolParameters", js.undefined)
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setScriptHash(value: String): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
    
    inline def setScriptHashUndefined: Self = StObject.set(x, "scriptHash", js.undefined)
    
    inline def setType(value: typings.trezorConnect.protobufMod.CardanoCertificateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
