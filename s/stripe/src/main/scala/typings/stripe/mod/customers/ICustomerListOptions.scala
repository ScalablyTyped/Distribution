package typings.stripe.mod.customers

import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerListOptions extends IListOptionsCreated {
  /**
    * A filter on the list based on the customer’s email field. The value must be a string.
    */
  var email: js.UndefOr[String] = js.native
}

object ICustomerListOptions {
  @scala.inline
  def apply(): ICustomerListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerListOptions]
  }
  @scala.inline
  implicit class ICustomerListOptionsOps[Self <: ICustomerListOptions] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
  
}

