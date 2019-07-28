package typings.winrt

import typings.winrt.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompletedGetResultsAsyncOperationCompletedHandlerNumber extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): Double = js.native
}

