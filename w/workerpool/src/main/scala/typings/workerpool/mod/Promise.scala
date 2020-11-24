package typings.workerpool.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workerpool", "Promise")
@js.native
class Promise[T, E] () extends js.Object {
  
  def always[TT](handler: js.Function0[Promise[TT, Error]]): Promise[TT, Error] = js.native
  
  def cancel(): this.type = js.native
  
  def `catch`[TT](err: js.Function1[/* error */ E, TT]): Promise[T | TT, Error] = js.native
  
  val pending: Boolean = js.native
  
  val rejected: Boolean = js.native
  
  val resolved: Boolean = js.native
  
  def `then`[TT, TE](result: js.Function1[/* r */ T, TT]): Promise[TT | TE, _] = js.native
  def `then`[TT, TE](result: js.Function1[/* r */ T, TT], err: js.Function1[/* r */ E, TE]): Promise[TT | TE, _] = js.native
  
  def timeout(delay: Double): this.type = js.native
}
/* static members */
@JSImport("workerpool", "Promise")
@js.native
object Promise extends js.Object {
  
  def all(promises: js.Array[Promise[_, _]]): Promise[js.Array[_], _] = js.native
  
  @js.native
  class CancellationError () extends Error {
    
    @JSName("name")
    var name_CancellationError: typings.workerpool.workerpoolStrings.CancellationError = js.native
  }
  
  @js.native
  class TimeoutError () extends Error {
    
    @JSName("name")
    var name_TimeoutError: typings.workerpool.workerpoolStrings.TimeoutError = js.native
  }
}
