package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cWebUsb.w3cWebUsbStrings.ok
  - typings.w3cWebUsb.w3cWebUsbStrings.stall
  - typings.w3cWebUsb.w3cWebUsbStrings.babble
*/
trait USBTransferStatus extends js.Object

object USBTransferStatus {
  @scala.inline
  def babble: typings.w3cWebUsb.w3cWebUsbStrings.babble = this.cast("babble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ok: typings.w3cWebUsb.w3cWebUsbStrings.ok = this.cast("ok")
  @scala.inline
  def stall: typings.w3cWebUsb.w3cWebUsbStrings.stall = this.cast("stall")
}

