package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var address_n: js.Array[Double]
  
  var amount: String
  
  var prev_hash: String
  
  var prev_index: Double
  
  var script_type: String
}
object Input {
  
  @scala.inline
  def apply(
    address_n: js.Array[Double],
    amount: String,
    prev_hash: String,
    prev_index: Double,
    script_type: String
  ): Input = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any], script_type = script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value :_*))
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_hash(value: String): Self = StObject.set(x, "prev_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_index(value: Double): Self = StObject.set(x, "prev_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_type(value: String): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
  }
}
