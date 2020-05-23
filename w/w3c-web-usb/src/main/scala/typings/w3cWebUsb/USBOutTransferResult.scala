package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBOutTransferResult extends js.Object {
  val bytesWritten: Double
  val status: USBTransferStatus
}

object USBOutTransferResult {
  @scala.inline
  def apply(bytesWritten: Double, status: USBTransferStatus): USBOutTransferResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBOutTransferResult]
  }
}

