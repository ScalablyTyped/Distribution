package typings.workerpool.workerpoolMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workerpool", "Promise")
@js.native
class Promise[T, E] () extends js.Object {
  val pending: Boolean = js.native
  val rejected: Boolean = js.native
  val resolved: Boolean = js.native
  def always[TT](handler: js.Function0[Promise[TT, Error]]): Promise[TT, Error] = js.native
  def cancel(): this.type = js.native
  def `catch`[TT](err: js.Function1[/* error */ E, TT]): Promise[TT, Error] = js.native
  def `then`[TT, EE](result: js.Function1[/* r */ T, TT]): Promise[TT, EE] = js.native
  def `then`[TT, EE](result: js.Function1[/* r */ T, TT], err: js.Function1[/* r */ E, EE]): Promise[TT, EE] = js.native
  def timeout(delay: Double): this.type = js.native
}

/* static members */
@JSImport("workerpool", "Promise")
@js.native
object Promise extends js.Object {
  @js.native
  class CancellationError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("name")
    var name_CancellationError: typings.workerpool.workerpoolStrings.CancellationError = js.native
  }
  
  @js.native
  class TimeoutError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("name")
    var name_TimeoutError: typings.workerpool.workerpoolStrings.TimeoutError = js.native
  }
  
  def all(promises: js.Array[Promise[_, _]]): Promise[js.Array[_], _] = js.native
}

