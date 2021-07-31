package typings.winrt.anon

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[IVectorView[ISmsMessage]], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[IVectorView[ISmsMessage]]
  
  def getResults(): IVectorView[ISmsMessage]
  
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], progressInfo: Double): Unit
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[ISmsMessage], Double]
}
object Progress {
  
  @scala.inline
  def apply(
    completed: (/* asyncInfo */ IAsyncOperation[IVectorView[ISmsMessage]], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => IVectorView[ISmsMessage],
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], Double) => Unit
  ): Progress = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults), progress = js.Any.fromFunction2(progress))
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(
      value: (/* asyncInfo */ IAsyncOperation[IVectorView[ISmsMessage]], /* asyncStatus */ AsyncStatus) => Unit
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResults(value: () => IVectorView[ISmsMessage]): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgress(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], Double) => Unit
    ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
  }
}
