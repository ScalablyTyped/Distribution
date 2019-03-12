package typings
package workerpoolLib.workerpoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workerpool", "Promise")
@js.native
object PromiseNs extends js.Object {
  @js.native
  class CancellationError ()
    extends stdLib.Error {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    @JSName("name")
    var name_CancellationError: workerpoolLib.workerpoolLibStrings.CancellationError = js.native
  }
  
  @js.native
  class TimeoutError ()
    extends stdLib.Error {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    @JSName("name")
    var name_TimeoutError: workerpoolLib.workerpoolLibStrings.TimeoutError = js.native
  }
  
}

