package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBOutTransferResult")
@js.native
class USBOutTransferResult protected () extends js.Object {
  def this(status: USBTransferStatus) = this()
  def this(status: USBTransferStatus, bytesWriten: Double) = this()
  val bytesWritten: Double = js.native
  val status: USBTransferStatus = js.native
}

