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
    close: js.Function0[scala.Unit],
    commitAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncAction],
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): IStorageStreamTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("commitAsync")(commitAsync)
    __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[IStorageStreamTransaction]
  }
}

