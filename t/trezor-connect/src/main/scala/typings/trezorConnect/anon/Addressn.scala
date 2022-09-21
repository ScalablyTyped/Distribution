package typings.trezorConnect.anon

import typings.trezorConnect.protobufMod.MultisigRedeemScriptType
import typings.trezorConnect.protobufMod.TxOutputType
import typings.trezorConnect.protobufMod.UintType
import typings.trezorConnect.trezorConnectStrings.PAYTOADDRESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addressn
  extends StObject
     with TxOutputType {
  
  var address: String
  
  var address_n: scala.Unit
  
  var amount: UintType
  
  var multisig: js.UndefOr[MultisigRedeemScriptType] = js.undefined
  
  var orig_hash: js.UndefOr[String] = js.undefined
  
  var orig_index: js.UndefOr[Double] = js.undefined
  
  var payment_req_index: js.UndefOr[Double] = js.undefined
  
  var script_type: PAYTOADDRESS
}
object Addressn {
  
  inline def apply(address: String, address_n: scala.Unit, amount: UintType): Addressn = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], script_type = "PAYTOADDRESS")
    __obj.asInstanceOf[Addressn]
  }
  
  extension [Self <: Addressn](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddress_n(value: scala.Unit): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setMultisig(value: MultisigRedeemScriptType): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
    
    inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
    
    inline def setOrig_hash(value: String): Self = StObject.set(x, "orig_hash", value.asInstanceOf[js.Any])
    
    inline def setOrig_hashUndefined: Self = StObject.set(x, "orig_hash", js.undefined)
    
    inline def setOrig_index(value: Double): Self = StObject.set(x, "orig_index", value.asInstanceOf[js.Any])
    
    inline def setOrig_indexUndefined: Self = StObject.set(x, "orig_index", js.undefined)
    
    inline def setPayment_req_index(value: Double): Self = StObject.set(x, "payment_req_index", value.asInstanceOf[js.Any])
    
    inline def setPayment_req_indexUndefined: Self = StObject.set(x, "payment_req_index", js.undefined)
    
    inline def setScript_type(value: PAYTOADDRESS): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
  }
}
