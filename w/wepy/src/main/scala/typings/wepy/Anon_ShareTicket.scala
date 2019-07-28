package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShareTicket extends js.Object {
  var shareTicket: String
  var timeout: Double
}

object Anon_ShareTicket {
  @scala.inline
  def apply(shareTicket: String, timeout: Double): Anon_ShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket, timeout = timeout)
  
    __obj.asInstanceOf[Anon_ShareTicket]
  }
}

