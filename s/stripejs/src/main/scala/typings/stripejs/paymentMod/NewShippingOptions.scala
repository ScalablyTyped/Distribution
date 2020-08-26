package typings.stripejs.paymentMod

import typings.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewShippingOptions extends js.Object {
  /**
    * The selected shipping option
    */
  var shippingOption: ShippingOption = js.native
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit = js.native
}

object NewShippingOptions {
  @scala.inline
  def apply(shippingOption: ShippingOption, updateWith: UpdateOptions => Unit): NewShippingOptions = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[NewShippingOptions]
  }
  @scala.inline
  implicit class NewShippingOptionsOps[Self <: NewShippingOptions] (val x: Self) extends AnyVal {
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
    def setShippingOption(value: ShippingOption): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateWith(value: UpdateOptions => Unit): Self = this.set("updateWith", js.Any.fromFunction1(value))
  }
  
}

