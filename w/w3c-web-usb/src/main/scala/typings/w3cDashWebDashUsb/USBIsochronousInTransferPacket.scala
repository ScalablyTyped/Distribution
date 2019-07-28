package typings.w3cDashWebDashUsb

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBIsochronousInTransferPacket")
@js.native
class USBIsochronousInTransferPacket protected () extends js.Object {
  def this(status: USBTransferStatus) = this()
  def this(status: USBTransferStatus, data: DataView) = this()
  val data: js.UndefOr[DataView] = js.native
  val status: js.UndefOr[USBTransferStatus] = js.native
}

