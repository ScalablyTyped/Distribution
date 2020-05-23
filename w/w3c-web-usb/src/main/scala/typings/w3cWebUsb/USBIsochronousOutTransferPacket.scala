package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBIsochronousOutTransferPacket extends js.Object {
  val bytesWritten: Double
  val status: USBTransferStatus
}

object USBIsochronousOutTransferPacket {
  @scala.inline
  def apply(bytesWritten: Double, status: USBTransferStatus): USBIsochronousOutTransferPacket = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousOutTransferPacket]
  }
}

