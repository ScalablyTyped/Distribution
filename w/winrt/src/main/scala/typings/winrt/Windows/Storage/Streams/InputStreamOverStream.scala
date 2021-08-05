package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputStreamOverStream
  extends StObject
     with IInputStream {
  
  def dispose(): Unit
}
object InputStreamOverStream {
  
  inline def apply(
    close: () => Unit,
    dispose: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): InputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[InputStreamOverStream]
  }
  
  extension [Self <: InputStreamOverStream](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
