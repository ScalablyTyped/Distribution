package typings.winrt

import typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDevice
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompletedGetResultsAsyncOperationCompletedHandlerSmsDevice extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): SmsDevice = js.native
}

