package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IClosable
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageStreamTransaction extends IClosable {
  
  def commitAsync(): IAsyncAction = js.native
  
  var stream: IRandomAccessStream = js.native
}
object IStorageStreamTransaction {
  
  @scala.inline
  def apply(close: () => Unit, commitAsync: () => IAsyncAction, stream: IRandomAccessStream): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
  
  @scala.inline
  implicit class IStorageStreamTransactionOps[Self <: IStorageStreamTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitAsync(value: () => IAsyncAction): Self = this.set("commitAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStream(value: IRandomAccessStream): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
}
