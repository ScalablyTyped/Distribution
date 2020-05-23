package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageStreamTransaction extends IStorageStreamTransaction {
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
}

