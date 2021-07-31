package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncInfo
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataWriterStoreOperation
  extends StObject
     with IAsyncOperation[Double]
     with IAsyncInfo {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
  
  def getResults(): Double = js.native
  
  @JSName("operation")
  var operation_DataWriterStoreOperation: `7` = js.native
}
