package typings.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloseEvent extends js.Object {
  var code: Double
  var reason: String
  var wasClean: Boolean
}

object ICloseEvent {
  @scala.inline
  def apply(code: Double, reason: String, wasClean: Boolean): ICloseEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICloseEvent]
  }
}

