package typings.stripe.mod.accounts

import typings.stripe.mod.IListOptions
import typings.stripe.stripeStrings.bank_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountListOptions extends IListOptions {
  var `object`: bank_account = js.native
}

object IBankAccountListOptions {
  @scala.inline
  def apply(`object`: bank_account): IBankAccountListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountListOptions]
  }
  @scala.inline
  implicit class IBankAccountListOptionsOps[Self <: IBankAccountListOptions] (val x: Self) extends AnyVal {
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
    def setObject(value: bank_account): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

