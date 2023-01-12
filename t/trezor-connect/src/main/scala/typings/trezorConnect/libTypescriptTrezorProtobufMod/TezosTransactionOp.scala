package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosTransactionOp extends StObject {
  
  var amount: UintType
  
  var counter: Double
  
  var destination: TezosContractID
  
  var fee: UintType
  
  var gas_limit: Double
  
  var parameters: js.UndefOr[js.Array[Double]] = js.undefined
  
  var parameters_manager: js.UndefOr[TezosParametersManager] = js.undefined
  
  var source: js.typedarray.Uint8Array
  
  var storage_limit: Double
}
object TezosTransactionOp {
  
  inline def apply(
    amount: UintType,
    counter: Double,
    destination: TezosContractID,
    fee: UintType,
    gas_limit: Double,
    source: js.typedarray.Uint8Array,
    storage_limit: Double
  ): TezosTransactionOp = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosTransactionOp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TezosTransactionOp] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: TezosContractID): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Double]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: Double*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setParameters_manager(value: TezosParametersManager): Self = StObject.set(x, "parameters_manager", value.asInstanceOf[js.Any])
    
    inline def setParameters_managerUndefined: Self = StObject.set(x, "parameters_manager", js.undefined)
    
    inline def setSource(value: js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
  }
}
