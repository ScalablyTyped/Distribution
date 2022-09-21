package typings.trezorConnect.accountMod

import typings.trezorConnect.trezorConnectStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalOutput
  extends StObject
     with ComposeOutput {
  
  var address_n: js.Array[Double]
  
  var amount: String
  
  var script_type: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[internal] = js.undefined
}
object InternalOutput {
  
  inline def apply(address_n: js.Array[Double], amount: String): InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOutput]
  }
  
  extension [Self <: InternalOutput](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setScript_type(value: String): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    inline def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
    
    inline def setType(value: internal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
