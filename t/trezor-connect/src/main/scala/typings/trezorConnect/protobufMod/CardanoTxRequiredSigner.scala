package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxRequiredSigner extends StObject {
  
  var key_hash: js.UndefOr[String] = js.undefined
  
  var key_path: js.UndefOr[js.Array[Double]] = js.undefined
}
object CardanoTxRequiredSigner {
  
  inline def apply(): CardanoTxRequiredSigner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardanoTxRequiredSigner]
  }
  
  extension [Self <: CardanoTxRequiredSigner](x: Self) {
    
    inline def setKey_hash(value: String): Self = StObject.set(x, "key_hash", value.asInstanceOf[js.Any])
    
    inline def setKey_hashUndefined: Self = StObject.set(x, "key_hash", js.undefined)
    
    inline def setKey_path(value: js.Array[Double]): Self = StObject.set(x, "key_path", value.asInstanceOf[js.Any])
    
    inline def setKey_pathUndefined: Self = StObject.set(x, "key_path", js.undefined)
    
    inline def setKey_pathVarargs(value: Double*): Self = StObject.set(x, "key_path", js.Array(value*))
  }
}
