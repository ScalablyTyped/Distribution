package typings.w3cDashWebDashUsb

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBIsochronousInTransferResult")
@js.native
class USBIsochronousInTransferResult protected () extends js.Object {
  def this(packets: js.Array[USBIsochronousInTransferPacket]) = this()
  def this(packets: js.Array[USBIsochronousInTransferPacket], data: DataView) = this()
  val data: js.UndefOr[DataView] = js.native
  val packets: js.Array[USBIsochronousInTransferPacket] = js.native
}

