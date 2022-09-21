package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosDelegationOp extends StObject {
  
  var counter: Double
  
  var delegate: js.typedarray.Uint8Array
  
  var fee: UintType
  
  var gas_limit: Double
  
  var source: js.typedarray.Uint8Array
  
  var storage_limit: Double
}
object TezosDelegationOp {
  
  inline def apply(
    counter: Double,
    delegate: js.typedarray.Uint8Array,
    fee: UintType,
    gas_limit: Double,
    source: js.typedarray.Uint8Array,
    storage_limit: Double
  ): TezosDelegationOp = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosDelegationOp]
  }
  
  extension [Self <: TezosDelegationOp](x: Self) {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setDelegate(value: js.typedarray.Uint8Array): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
  }
}
