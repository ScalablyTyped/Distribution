package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBIsochronousInTransferPacket")
@js.native
class USBIsochronousInTransferPacket protected () extends js.Object {
  def this(status: USBTransferStatus) = this()
  def this(status: USBTransferStatus, data: stdLib.DataView) = this()
  val data: js.UndefOr[stdLib.DataView] = js.native
  val status: js.UndefOr[USBTransferStatus] = js.native
}

