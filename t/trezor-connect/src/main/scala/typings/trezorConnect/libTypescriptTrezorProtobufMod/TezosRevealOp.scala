package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosRevealOp extends StObject {
  
  var counter: Double
  
  var fee: UintType
  
  var gas_limit: Double
  
  var public_key: js.typedarray.Uint8Array
  
  var source: js.typedarray.Uint8Array
  
  var storage_limit: Double
}
object TezosRevealOp {
  
  inline def apply(
    counter: Double,
    fee: UintType,
    gas_limit: Double,
    public_key: js.typedarray.Uint8Array,
    source: js.typedarray.Uint8Array,
    storage_limit: Double
  ): TezosRevealOp = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosRevealOp]
  }
  
  extension [Self <: TezosRevealOp](x: Self) {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
    
    inline def setPublic_key(value: js.typedarray.Uint8Array): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
  }
}
