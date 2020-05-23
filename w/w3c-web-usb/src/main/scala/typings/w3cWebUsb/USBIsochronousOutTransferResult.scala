package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBIsochronousOutTransferResult extends js.Object {
  val packets: js.Array[USBIsochronousOutTransferPacket]
}

object USBIsochronousOutTransferResult {
  @scala.inline
  def apply(packets: js.Array[USBIsochronousOutTransferPacket]): USBIsochronousOutTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousOutTransferResult]
  }
}

