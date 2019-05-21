package typings
package workerpoolLib.workerpoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workerpool", "Promise")
@js.native
class Promise[T, E] () extends js.Object {
  val pending: scala.Boolean = js.native
  val rejected: scala.Boolean = js.native
  val resolved: scala.Boolean = js.native
  def always[TT](handler: js.Function0[Promise[TT, stdLib.Error]]): Promise[TT, stdLib.Error] = js.native
  def cancel(): this.type = js.native
  def `catch`[TT](err: js.Function1[/* error */ E, TT]): Promise[TT, stdLib.Error] = js.native
  def `then`[TT, EE](result: js.Function1[/* r */ T, TT]): Promise[TT, EE] = js.native
  def `then`[TT, EE](result: js.Function1[/* r */ T, TT], err: js.Function1[/* r */ E, EE]): Promise[TT, EE] = js.native
  def timeout(delay: scala.Double): this.type = js.native
}

/* static members */
@JSImport("workerpool", "Promise")
@js.native
object Promise extends js.Object {
  def all(promises: js.Array[workerpoolLib.workerpoolMod.Promise[_, _]]): workerpoolLib.workerpoolMod.Promise[js.Array[_], _] = js.native
}

