package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompletedGetResults[TResult] extends js.Object {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[TResult] = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[TResult],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): TResult = js.native
}

