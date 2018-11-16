package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBOutTransferResult")
@js.native
class USBOutTransferResult protected () extends js.Object {
  def this(status: USBTransferStatus) = this()
  def this(status: USBTransferStatus, bytesWriten: scala.Double) = this()
  val bytesWritten: scala.Double = js.native
  val status: USBTransferStatus = js.native
}

