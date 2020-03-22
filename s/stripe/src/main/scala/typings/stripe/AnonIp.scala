package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIp extends js.Object {
  var date: Double
  var ip: String
  var user_agent: String
}

object AnonIp {
  @scala.inline
  def apply(date: Double, ip: String, user_agent: String): AnonIp = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIp]
  }
}

