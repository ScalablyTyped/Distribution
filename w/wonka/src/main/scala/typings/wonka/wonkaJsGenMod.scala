package typings.wonka

import typings.wonka.domShimMod.element
import typings.wonka.domShimMod.event
import typings.wonka.wonkaCallbagGenMod.callbagT
import typings.wonka.wonkaObservableGenMod.observableT
import typings.wonka.wonkaTypesGenMod.operatorT
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/web/WonkaJs.gen", JSImport.Namespace)
@js.native
object wonkaJsGenMod extends js.Object {
  def debounce[a](_1: js.Function1[/* _1 */ a, Double]): operatorT[a, a] = js.native
  def delay[a](_1: Double): operatorT[a, a] = js.native
  def fromCallbag[T1](_1: callbagT[T1]): sourceT[T1] = js.native
  def fromDomEvent(_1: element, _2: String): sourceT[event] = js.native
  def fromObservable[T1](_1: observableT[T1]): sourceT[T1] = js.native
  def fromPromise[a](_1: js.Promise[a]): sourceT[a] = js.native
  def interval(_1: Double): sourceT[Double] = js.native
  def throttle[a](_1: js.Function1[/* _1 */ a, Double]): operatorT[a, a] = js.native
  def toCallbag[T1](_1: sourceT[T1]): callbagT[T1] = js.native
  def toObservable[T1](_1: sourceT[T1]): observableT[T1] = js.native
  def toPromise[a](_1: sourceT[a]): js.Promise[a] = js.native
}

