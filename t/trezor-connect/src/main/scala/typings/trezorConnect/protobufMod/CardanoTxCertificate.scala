package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxCertificate extends StObject {
  
  var key_hash: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[js.Array[Double]] = js.undefined
  
  var pool: js.UndefOr[String] = js.undefined
  
  var pool_parameters: js.UndefOr[CardanoPoolParametersType] = js.undefined
  
  var script_hash: js.UndefOr[String] = js.undefined
  
  var `type`: CardanoCertificateType
}
object CardanoTxCertificate {
  
  inline def apply(`type`: CardanoCertificateType): CardanoTxCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxCertificate]
  }
  
  extension [Self <: CardanoTxCertificate](x: Self) {
    
    inline def setKey_hash(value: String): Self = StObject.set(x, "key_hash", value.asInstanceOf[js.Any])
    
    inline def setKey_hashUndefined: Self = StObject.set(x, "key_hash", js.undefined)
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setPool_parameters(value: CardanoPoolParametersType): Self = StObject.set(x, "pool_parameters", value.asInstanceOf[js.Any])
    
    inline def setPool_parametersUndefined: Self = StObject.set(x, "pool_parameters", js.undefined)
    
    inline def setScript_hash(value: String): Self = StObject.set(x, "script_hash", value.asInstanceOf[js.Any])
    
    inline def setScript_hashUndefined: Self = StObject.set(x, "script_hash", js.undefined)
    
    inline def setType(value: CardanoCertificateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
