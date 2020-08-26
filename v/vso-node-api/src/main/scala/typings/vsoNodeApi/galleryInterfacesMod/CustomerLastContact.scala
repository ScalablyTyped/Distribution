package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerLastContact extends js.Object {
  /**
    * account for which customer was last contacted
    */
  var account: String = js.native
  /**
    * Date on which the custoemr was last contacted
    */
  var lastContactDate: Date = js.native
}

object CustomerLastContact {
  @scala.inline
  def apply(account: String, lastContactDate: Date): CustomerLastContact = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], lastContactDate = lastContactDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerLastContact]
  }
  @scala.inline
  implicit class CustomerLastContactOps[Self <: CustomerLastContact] (val x: Self) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastContactDate(value: Date): Self = this.set("lastContactDate", value.asInstanceOf[js.Any])
  }
  
}

