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
    extends nodeLib.Error {
    var name: workerpoolLib.workerpoolLibStrings.CancellationError = js.native
  }
  
  @js.native
  class TimeoutError ()
    extends nodeLib.Error {
    var name: workerpoolLib.workerpoolLibStrings.TimeoutError = js.native
  }
  
}

