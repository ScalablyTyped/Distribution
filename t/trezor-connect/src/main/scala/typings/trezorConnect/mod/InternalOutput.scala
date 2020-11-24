package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalOutput extends Output {
  
  var address_n: js.Array[Double] = js.native
  
  var amount: String = js.native
  
  var script_type: js.UndefOr[String] = js.native
}
object InternalOutput {
  
  @scala.inline
  def apply(address_n: js.Array[Double], amount: String): InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOutput]
  }
  
  @scala.inline
  implicit class InternalOutputOps[Self <: InternalOutput] (val x: Self) extends AnyVal {
    
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
    def setScript_type(value: String): Self = this.set("script_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript_type: Self = this.set("script_type", js.undefined)
  }
}
