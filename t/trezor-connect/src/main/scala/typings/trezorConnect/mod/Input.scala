package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends js.Object {
  
  var address_n: js.Array[Double] = js.native
  
  var amount: String = js.native
  
  var prev_hash: String = js.native
  
  var prev_index: Double = js.native
  
  var script_type: String = js.native
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
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress_nVarargs(value: Double*): Self = this.set("address_n", js.Array(value :_*))
    
    @scala.inline
    def setAddress_n(value: js.Array[Double]): Self = this.set("address_n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_hash(value: String): Self = this.set("prev_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_index(value: Double): Self = this.set("prev_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_type(value: String): Self = this.set("script_type", value.asInstanceOf[js.Any])
  }
}
