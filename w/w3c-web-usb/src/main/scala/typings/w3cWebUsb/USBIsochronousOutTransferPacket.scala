package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBIsochronousOutTransferPacket")
@js.native
class USBIsochronousOutTransferPacket protected () extends js.Object {
  def this(status: USBTransferStatus) = this()
  def this(status: USBTransferStatus, bytesWritten: Double) = this()
  val bytesWritten: Double = js.native
  val status: USBTransferStatus = js.native
}

