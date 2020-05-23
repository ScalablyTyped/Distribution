package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareTicket extends js.Object {
  var shareTicket: String
  var timeout: Double
}

object ShareTicket {
  @scala.inline
  def apply(shareTicket: String, timeout: Double): ShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTicket]
  }
}

