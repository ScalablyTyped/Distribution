package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputStream
  extends StObject
     with IClosable {
  
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double]
}
object IInputStream {
  
  @scala.inline
  def apply(
    close: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[IInputStream]
  }
  
  @scala.inline
  implicit class IInputStreamMutableBuilder[Self <: IInputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadAsync(value: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
  }
}
