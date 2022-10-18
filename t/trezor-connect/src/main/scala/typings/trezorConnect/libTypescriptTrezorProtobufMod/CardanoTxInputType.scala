package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxInputType extends StObject {
  
  var address_n: js.UndefOr[js.Array[Double]] = js.undefined
  
  var prev_hash: String
  
  var prev_index: Double
}
object CardanoTxInputType {
  
  inline def apply(prev_hash: String, prev_index: Double): CardanoTxInputType = {
    val __obj = js.Dynamic.literal(prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxInputType]
  }
  
  extension [Self <: CardanoTxInputType](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nUndefined: Self = StObject.set(x, "address_n", js.undefined)
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setPrev_hash(value: String): Self = StObject.set(x, "prev_hash", value.asInstanceOf[js.Any])
    
    inline def setPrev_index(value: Double): Self = StObject.set(x, "prev_index", value.asInstanceOf[js.Any])
  }
}
