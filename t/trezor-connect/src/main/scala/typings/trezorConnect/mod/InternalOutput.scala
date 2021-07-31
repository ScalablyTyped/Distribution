package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalOutput
  extends StObject
     with Output {
  
  var address_n: js.Array[Double]
  
  var amount: String
  
  var script_type: js.UndefOr[String] = js.undefined
}
object InternalOutput {
  
  @scala.inline
  def apply(address_n: js.Array[Double], amount: String): InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOutput]
  }
  
  @scala.inline
  implicit class InternalOutputMutableBuilder[Self <: InternalOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value :_*))
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_type(value: String): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
  }
}
