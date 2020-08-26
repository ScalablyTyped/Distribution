package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bank extends js.Object {
  var bank: String = js.native
}

object Bank {
  @scala.inline
  def apply(bank: String): Bank = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bank]
  }
  @scala.inline
  implicit class BankOps[Self <: Bank] (val x: Self) extends AnyVal {
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
    def setBank(value: String): Self = this.set("bank", value.asInstanceOf[js.Any])
  }
  
}

