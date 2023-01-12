package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxOutputType
import typings.trezorConnect.trezorConnectStrings.PAYTOOPRETURN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opreturndata
  extends StObject
     with TxOutputType {
  
  var address: scala.Unit
  
  var address_n: scala.Unit
  
  var amount: typings.trezorConnect.trezorConnectStrings.`0`
  
  var op_return_data: String
  
  var orig_hash: js.UndefOr[String] = js.undefined
  
  var orig_index: js.UndefOr[Double] = js.undefined
  
  var payment_req_index: js.UndefOr[Double] = js.undefined
  
  var script_type: PAYTOOPRETURN
}
object Opreturndata {
  
  inline def apply(address: scala.Unit, address_n: scala.Unit, op_return_data: String): Opreturndata = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = "0", op_return_data = op_return_data.asInstanceOf[js.Any], script_type = "PAYTOOPRETURN")
    __obj.asInstanceOf[Opreturndata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Opreturndata] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: scala.Unit): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddress_n(value: scala.Unit): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: typings.trezorConnect.trezorConnectStrings.`0`): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setOp_return_data(value: String): Self = StObject.set(x, "op_return_data", value.asInstanceOf[js.Any])
    
    inline def setOrig_hash(value: String): Self = StObject.set(x, "orig_hash", value.asInstanceOf[js.Any])
    
    inline def setOrig_hashUndefined: Self = StObject.set(x, "orig_hash", js.undefined)
    
    inline def setOrig_index(value: Double): Self = StObject.set(x, "orig_index", value.asInstanceOf[js.Any])
    
    inline def setOrig_indexUndefined: Self = StObject.set(x, "orig_index", js.undefined)
    
    inline def setPayment_req_index(value: Double): Self = StObject.set(x, "payment_req_index", value.asInstanceOf[js.Any])
    
    inline def setPayment_req_indexUndefined: Self = StObject.set(x, "payment_req_index", js.undefined)
    
    inline def setScript_type(value: PAYTOOPRETURN): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
  }
}
