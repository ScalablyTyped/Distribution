package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncInfo
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.anon.CompletedAsyncOperationCompletedHandlerGetResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSmsDeviceOperation
  extends StObject
     with IAsyncOperation[SmsDevice]
     with IAsyncInfo {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  
  def getResults(): SmsDevice = js.native
  
  @JSName("operation")
  var operation_GetSmsDeviceOperation: CompletedAsyncOperationCompletedHandlerGetResults = js.native
}
