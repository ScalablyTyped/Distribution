package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageStreamTransaction
  extends StObject
     with IStorageStreamTransaction {
  
  def dispose(): Unit
}
object StorageStreamTransaction {
  
  @scala.inline
  def apply(
    close: () => Unit,
    commitAsync: () => IAsyncAction,
    dispose: () => Unit,
    stream: IRandomAccessStream
  ): StorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), dispose = js.Any.fromFunction0(dispose), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStreamTransaction]
  }
  
  @scala.inline
  implicit class StorageStreamTransactionMutableBuilder[Self <: StorageStreamTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
