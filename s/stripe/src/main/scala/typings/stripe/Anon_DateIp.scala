package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateIp extends js.Object {
  var date: Double
  var ip: String
  var user_agent: String
}

object Anon_DateIp {
  @scala.inline
  def apply(date: Double, ip: String, user_agent: String): Anon_DateIp = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateIp]
  }
}

