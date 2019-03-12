package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  var promise: js.UndefOr[js.Promise[scala.Boolean]] = js.undefined
  def abort(): scala.Unit
}

object Anon_Abort {
  @scala.inline
  def apply(abort: () => scala.Unit, promise: js.Promise[scala.Boolean] = null): Anon_Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[Anon_Abort]
  }
}

