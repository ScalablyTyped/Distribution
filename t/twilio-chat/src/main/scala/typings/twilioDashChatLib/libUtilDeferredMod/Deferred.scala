package typings
package twilioDashChatLib.libUtilDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/util/deferred", "Deferred")
@js.native
class Deferred[T] () extends js.Object {
  var _promise: js.Any = js.native
  var _reject: js.Any = js.native
  var _resolve: js.Any = js.native
  var current: T = js.native
  val promise: js.Promise[T] = js.native
  def fail(e: js.Any): scala.Unit = js.native
  def set(value: T): scala.Unit = js.native
  def update(value: T): scala.Unit = js.native
}

