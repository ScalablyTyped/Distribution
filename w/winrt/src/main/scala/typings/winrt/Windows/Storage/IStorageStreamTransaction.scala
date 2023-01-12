package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IClosable
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageStreamTransaction
  extends StObject
     with IClosable {
  
  def commitAsync(): IAsyncAction
  
  var stream: IRandomAccessStream
}
object IStorageStreamTransaction {
  
  inline def apply(close: () => Unit, commitAsync: () => IAsyncAction, stream: IRandomAccessStream): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStorageStreamTransaction] (val x: Self) extends AnyVal {
    
    inline def setCommitAsync(value: () => IAsyncAction): Self = StObject.set(x, "commitAsync", js.Any.fromFunction0(value))
    
    inline def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
