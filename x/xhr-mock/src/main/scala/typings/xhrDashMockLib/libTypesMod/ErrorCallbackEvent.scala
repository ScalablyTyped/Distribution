package typings
package xhrDashMockLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCallbackEvent extends js.Object {
  var err: stdLib.Error
  var req: xhrDashMockLib.libMockRequestMod.default
}

object ErrorCallbackEvent {
  @scala.inline
  def apply(err: stdLib.Error, req: xhrDashMockLib.libMockRequestMod.default): ErrorCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err, req = req)
  
    __obj.asInstanceOf[ErrorCallbackEvent]
  }
}

