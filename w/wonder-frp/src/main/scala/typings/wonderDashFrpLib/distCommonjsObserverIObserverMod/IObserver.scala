package typings
package wonderDashFrpLib.distCommonjsObserverIObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserver
  extends wonderDashFrpLib.distCommonjsDisposableIDisposableMod.IDisposable {
  def completed(): js.Any
  def error(error: js.Any): js.Any
  def next(value: js.Any): js.Any
}

object IObserver {
  @scala.inline
  def apply(
    completed: js.Function0[js.Any],
    dispose: js.Function0[scala.Unit],
    error: js.Function1[js.Any, js.Any],
    next: js.Function1[js.Any, js.Any]
  ): IObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completed")(completed)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[IObserver]
  }
}

