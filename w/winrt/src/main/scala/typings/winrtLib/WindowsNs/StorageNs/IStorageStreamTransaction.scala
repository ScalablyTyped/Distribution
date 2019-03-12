package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageStreamTransaction
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  var stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  def commitAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IStorageStreamTransaction {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    commitAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream)
  
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
}

