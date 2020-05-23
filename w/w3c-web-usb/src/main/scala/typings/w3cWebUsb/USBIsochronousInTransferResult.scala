package typings.w3cWebUsb

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBIsochronousInTransferResult extends js.Object {
  val data: js.UndefOr[DataView] = js.undefined
  val packets: js.Array[USBIsochronousInTransferPacket]
}

object USBIsochronousInTransferResult {
  @scala.inline
  def apply(packets: js.Array[USBIsochronousInTransferPacket], data: DataView = null): USBIsochronousInTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousInTransferResult]
  }
}

