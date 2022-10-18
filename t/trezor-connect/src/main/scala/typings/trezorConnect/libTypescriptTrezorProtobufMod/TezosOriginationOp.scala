package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosOriginationOp extends StObject {
  
  var balance: Double
  
  var counter: Double
  
  var delegatable: js.UndefOr[Boolean] = js.undefined
  
  var delegate: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var fee: UintType
  
  var gas_limit: Double
  
  var manager_pubkey: js.UndefOr[String] = js.undefined
  
  var script: String | js.Array[Double]
  
  var source: js.typedarray.Uint8Array
  
  var spendable: js.UndefOr[Boolean] = js.undefined
  
  var storage_limit: Double
}
object TezosOriginationOp {
  
  inline def apply(
    balance: Double,
    counter: Double,
    fee: UintType,
    gas_limit: Double,
    script: String | js.Array[Double],
    source: js.typedarray.Uint8Array,
    storage_limit: Double
  ): TezosOriginationOp = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosOriginationOp]
  }
  
  extension [Self <: TezosOriginationOp](x: Self) {
    
    inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setDelegatable(value: Boolean): Self = StObject.set(x, "delegatable", value.asInstanceOf[js.Any])
    
    inline def setDelegatableUndefined: Self = StObject.set(x, "delegatable", js.undefined)
    
    inline def setDelegate(value: js.typedarray.Uint8Array): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
    
    inline def setManager_pubkey(value: String): Self = StObject.set(x, "manager_pubkey", value.asInstanceOf[js.Any])
    
    inline def setManager_pubkeyUndefined: Self = StObject.set(x, "manager_pubkey", js.undefined)
    
    inline def setScript(value: String | js.Array[Double]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptVarargs(value: Double*): Self = StObject.set(x, "script", js.Array(value*))
    
    inline def setSource(value: js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpendable(value: Boolean): Self = StObject.set(x, "spendable", value.asInstanceOf[js.Any])
    
    inline def setSpendableUndefined: Self = StObject.set(x, "spendable", js.undefined)
    
    inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
  }
}
