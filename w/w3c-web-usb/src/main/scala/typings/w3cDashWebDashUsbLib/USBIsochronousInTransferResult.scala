package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBIsochronousInTransferResult")
@js.native
class USBIsochronousInTransferResult protected () extends js.Object {
  def this(packets: js.Array[USBIsochronousInTransferPacket]) = this()
  def this(packets: js.Array[USBIsochronousInTransferPacket], data: stdLib.DataView) = this()
  val data: js.UndefOr[stdLib.DataView] = js.native
  val packets: js.Array[USBIsochronousInTransferPacket] = js.native
}

