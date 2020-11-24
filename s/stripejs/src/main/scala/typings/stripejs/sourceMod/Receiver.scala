package typings.stripejs.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Receiver extends js.Object {
  
  /**
    * The address of the receiver source
    * NOTE: This is the value that should be communicated to the customer to send their funds to
    */
  var address: String = js.native
  
  /**
    * The total amount that was charged by you
    * NOTE: The amount charged is expressed in the source’s currency
    */
  var amount_charged: Double = js.native
  
  /**
    * The total amount received by the receiver source
    */
  var amount_received: Double = js.native
  
  /**
    * The total amount that was returned to the customer
    * NOTE: The amount charged is expressed in the source’s currency
    */
  var amount_returned: Double = js.native
}
object Receiver {
  
  @scala.inline
  def apply(address: String, amount_charged: Double, amount_received: Double, amount_returned: Double): Receiver = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount_charged = amount_charged.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receiver]
  }
  
  @scala.inline
  implicit class ReceiverOps[Self <: Receiver] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_charged(value: Double): Self = this.set("amount_charged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_received(value: Double): Self = this.set("amount_received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_returned(value: Double): Self = this.set("amount_returned", value.asInstanceOf[js.Any])
  }
}
