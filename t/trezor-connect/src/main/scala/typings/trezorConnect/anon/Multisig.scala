package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.ChangeOutputScriptType
import typings.trezorConnect.libTypescriptTrezorProtobufMod.MultisigRedeemScriptType
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxOutputType
import typings.trezorConnect.libTypescriptTrezorProtobufMod.UintType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multisig
  extends StObject
     with TxOutputType {
  
  var address: scala.Unit
  
  var address_n: js.Array[Double]
  
  var amount: UintType
  
  var multisig: js.UndefOr[MultisigRedeemScriptType] = js.undefined
  
  var orig_hash: js.UndefOr[String] = js.undefined
  
  var orig_index: js.UndefOr[Double] = js.undefined
  
  var payment_req_index: js.UndefOr[Double] = js.undefined
  
  var script_type: ChangeOutputScriptType
}
object Multisig {
  
  inline def apply(
    address: scala.Unit,
    address_n: js.Array[Double],
    amount: UintType,
    script_type: ChangeOutputScriptType
  ): Multisig = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], script_type = script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multisig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Multisig] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: scala.Unit): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setMultisig(value: MultisigRedeemScriptType): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
    
    inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
    
    inline def setOrig_hash(value: String): Self = StObject.set(x, "orig_hash", value.asInstanceOf[js.Any])
    
    inline def setOrig_hashUndefined: Self = StObject.set(x, "orig_hash", js.undefined)
    
    inline def setOrig_index(value: Double): Self = StObject.set(x, "orig_index", value.asInstanceOf[js.Any])
    
    inline def setOrig_indexUndefined: Self = StObject.set(x, "orig_index", js.undefined)
    
    inline def setPayment_req_index(value: Double): Self = StObject.set(x, "payment_req_index", value.asInstanceOf[js.Any])
    
    inline def setPayment_req_indexUndefined: Self = StObject.set(x, "payment_req_index", js.undefined)
    
    inline def setScript_type(value: ChangeOutputScriptType): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
  }
}
