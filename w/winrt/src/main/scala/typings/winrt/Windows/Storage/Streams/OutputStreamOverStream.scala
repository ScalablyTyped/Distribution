package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputStreamOverStream
  extends StObject
     with IOutputStream {
  
  def dispose(): Unit
}
object OutputStreamOverStream {
  
  @scala.inline
  def apply(
    close: () => Unit,
    dispose: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): OutputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[OutputStreamOverStream]
  }
  
  @scala.inline
  implicit class OutputStreamOverStreamMutableBuilder[Self <: OutputStreamOverStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
