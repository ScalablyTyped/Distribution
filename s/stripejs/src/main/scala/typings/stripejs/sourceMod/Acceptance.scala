package typings.stripejs.sourceMod

import typings.stripejs.stripejsStrings.accepted
import typings.stripejs.stripejsStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acceptance extends js.Object {
  /**
    * The unix timestamp the mandate was accepted or refused at by the customer.
    */
  var date: Double
  /**
    * The unix timestamp the mandate was accepted or refused at by the customer.
    */
  var ip: String
  /**
    * The status of the mandate acceptance
    */
  var status: accepted | refused
  /**
    * The user agent of the browser from which the mandate was accepted or refused by the customer
    * NOTE: This can be unset by updating the value to `null` and then saving
    */
  var user_agent: String
}

object Acceptance {
  @scala.inline
  def apply(date: Double, ip: String, status: accepted | refused, user_agent: String): Acceptance = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceptance]
  }
}

