package typings.stripejs.sourceMod

import typings.stripejs.stripejsStrings.accepted
import typings.stripejs.stripejsStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acceptance extends js.Object {
  /**
    * The unix timestamp the mandate was accepted or refused at by the customer.
    */
  var date: Double = js.native
  /**
    * The unix timestamp the mandate was accepted or refused at by the customer.
    */
  var ip: String = js.native
  /**
    * The status of the mandate acceptance
    */
  var status: accepted | refused = js.native
  /**
    * The user agent of the browser from which the mandate was accepted or refused by the customer
    * NOTE: This can be unset by updating the value to `null` and then saving
    */
  var user_agent: String = js.native
}

object Acceptance {
  @scala.inline
  def apply(date: Double, ip: String, status: accepted | refused, user_agent: String): Acceptance = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceptance]
  }
  @scala.inline
  implicit class AcceptanceOps[Self <: Acceptance] (val x: Self) extends AnyVal {
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: accepted | refused): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_agent(value: String): Self = this.set("user_agent", value.asInstanceOf[js.Any])
  }
  
}

