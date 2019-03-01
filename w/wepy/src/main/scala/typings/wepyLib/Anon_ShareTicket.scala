package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShareTicket extends js.Object {
  var shareTicket: java.lang.String
  var timeout: scala.Double
}

object Anon_ShareTicket {
  @scala.inline
  def apply(shareTicket: java.lang.String, timeout: scala.Double): Anon_ShareTicket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shareTicket")(shareTicket)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Anon_ShareTicket]
  }
}

