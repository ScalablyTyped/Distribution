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
    completed: () => js.Any,
    dispose: () => scala.Unit,
    error: js.Any => js.Any,
    next: js.Any => js.Any
  ): IObserver = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction0(completed), dispose = js.Any.fromFunction0(dispose), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[IObserver]
  }
}

