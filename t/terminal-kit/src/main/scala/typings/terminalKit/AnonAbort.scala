package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbort extends js.Object {
  var promise: js.UndefOr[js.Promise[Boolean]] = js.undefined
  def abort(): Unit
}

object AnonAbort {
  @scala.inline
  def apply(abort: () => Unit, promise: js.Promise[Boolean] = null): AnonAbort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbort]
  }
}

