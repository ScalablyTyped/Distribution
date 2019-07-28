package typings.workerpool.workerpoolMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workerpool", "Promise")
@js.native
object PromiseNs extends js.Object {
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
  
}

