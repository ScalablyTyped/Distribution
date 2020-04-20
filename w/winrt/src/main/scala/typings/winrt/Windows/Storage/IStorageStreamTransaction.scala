package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IClosable
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageStreamTransaction extends IClosable {
  var stream: IRandomAccessStream
  def commitAsync(): IAsyncAction
}

object IStorageStreamTransaction {
  @scala.inline
  def apply(close: () => Unit, commitAsync: () => IAsyncAction, stream: IRandomAccessStream): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
}

