package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMTransactionCommon extends StObject {
  
  var address_n: js.UndefOr[js.Array[Double]] = js.undefined
  
  var deadline: Double
  
  var fee: UintType
  
  var network: js.UndefOr[Double] = js.undefined
  
  var signer: js.UndefOr[String] = js.undefined
  
  var timestamp: Double
}
object NEMTransactionCommon {
  
  inline def apply(deadline: Double, fee: UintType, timestamp: Double): NEMTransactionCommon = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMTransactionCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMTransactionCommon] (val x: Self) extends AnyVal {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nUndefined: Self = StObject.set(x, "address_n", js.undefined)
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: Double): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSigner(value: String): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
