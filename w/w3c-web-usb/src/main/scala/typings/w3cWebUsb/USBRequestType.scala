package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cWebUsb.w3cWebUsbStrings.standard
  - typings.w3cWebUsb.w3cWebUsbStrings.`class`
  - typings.w3cWebUsb.w3cWebUsbStrings.vendor
*/
trait USBRequestType extends js.Object

object USBRequestType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `class`: typings.w3cWebUsb.w3cWebUsbStrings.`class` = this.cast("class")
  @scala.inline
  def standard: typings.w3cWebUsb.w3cWebUsbStrings.standard = this.cast("standard")
  @scala.inline
  def vendor: typings.w3cWebUsb.w3cWebUsbStrings.vendor = this.cast("vendor")
}

