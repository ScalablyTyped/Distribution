package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOutputStream
  extends StObject
     with IClosable {
  
  def flushAsync(): IAsyncOperation[Boolean]
  
  def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double]
}
object IOutputStream {
  
  inline def apply(
    close: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[IOutputStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOutputStream] (val x: Self) extends AnyVal {
    
    inline def setFlushAsync(value: () => IAsyncOperation[Boolean]): Self = StObject.set(x, "flushAsync", js.Any.fromFunction0(value))
    
    inline def setWriteAsync(value: IBuffer => IAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
  }
}
