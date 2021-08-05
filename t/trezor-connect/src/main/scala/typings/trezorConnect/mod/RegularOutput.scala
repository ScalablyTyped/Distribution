package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegularOutput
  extends StObject
     with Output {
  
  var address: String
  
  var amount: String
  
  var script_type: js.UndefOr[String] = js.undefined
}
object RegularOutput {
  
  inline def apply(address: String, amount: String): RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularOutput]
  }
  
  extension [Self <: RegularOutput](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setScript_type(value: String): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    inline def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
  }
}
