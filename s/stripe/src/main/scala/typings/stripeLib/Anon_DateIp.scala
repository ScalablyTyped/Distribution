package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateIp extends js.Object {
  var date: scala.Double
  var ip: java.lang.String
  var user_agent: java.lang.String
}

object Anon_DateIp {
  @scala.inline
  def apply(date: scala.Double, ip: java.lang.String, user_agent: java.lang.String): Anon_DateIp = {
    val __obj = js.Dynamic.literal(date = date, ip = ip, user_agent = user_agent)
  
    __obj.asInstanceOf[Anon_DateIp]
  }
}

