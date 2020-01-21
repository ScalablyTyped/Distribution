package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShareTicket extends js.Object {
  var shareTicket: String
  var timeout: Double
}

object AnonShareTicket {
  @scala.inline
  def apply(shareTicket: String, timeout: Double): AnonShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShareTicket]
  }
}

