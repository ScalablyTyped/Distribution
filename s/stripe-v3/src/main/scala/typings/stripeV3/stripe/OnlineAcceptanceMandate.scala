package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlineAcceptanceMandate extends js.Object {
  var date: Double
  var ip: String
  var user_agent: String
}

object OnlineAcceptanceMandate {
  @scala.inline
  def apply(date: Double, ip: String, user_agent: String): OnlineAcceptanceMandate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineAcceptanceMandate]
  }
}

