package typings
package wonderDashFrpLib.distEs2015ObserverIObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserver
  extends wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable {
  def completed(): js.Any
  def error(error: js.Any): js.Any
  def next(value: js.Any): js.Any
}

