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

