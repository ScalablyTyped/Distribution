package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IClosable
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
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
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream)
  
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
}

