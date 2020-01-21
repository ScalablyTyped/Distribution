package typings.w3cWebUsb

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBInTransferResult")
@js.native
class USBInTransferResult protected () extends js.Object {
  def this(status: USBTransferStatus) = this()
  def this(status: USBTransferStatus, data: DataView) = this()
  val data: js.UndefOr[DataView] = js.native
  val status: js.UndefOr[USBTransferStatus] = js.native
}

