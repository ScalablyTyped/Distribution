package typings.w3cWebUsb

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBInTransferResult extends js.Object {
  val data: js.UndefOr[DataView] = js.undefined
  val status: js.UndefOr[USBTransferStatus] = js.undefined
}

object USBInTransferResult {
  @scala.inline
  def apply(data: DataView = null, status: USBTransferStatus = null): USBInTransferResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBInTransferResult]
  }
}

