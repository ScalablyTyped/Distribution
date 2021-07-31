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
  
  @scala.inline
  def apply(address: String, amount: String): RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularOutput]
  }
  
  @scala.inline
  implicit class RegularOutputMutableBuilder[Self <: RegularOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_type(value: String): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
  }
}
