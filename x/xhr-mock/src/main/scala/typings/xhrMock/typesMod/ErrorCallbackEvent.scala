package typings.xhrMock.typesMod

import typings.std.Error
import typings.xhrMock.mockRequestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCallbackEvent extends js.Object {
  var err: Error
  var req: default
}

object ErrorCallbackEvent {
  @scala.inline
  def apply(err: Error, req: default): ErrorCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCallbackEvent]
  }
}

