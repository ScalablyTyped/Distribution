package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncOperationWithProgress[TResult, TProgress] extends IPromise[TResult] {
  var operation: winrtLib.Anon_ProgressCompleted[TResult, TProgress] = js.native
}

