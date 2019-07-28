package typings.webcl.WEBCLNs

import typings.webcl.webclNumbers.`0x1`
import typings.webcl.webclNumbers.`0x2`
import typings.webcl.webclNumbers.`0x4`
import typings.webcl.webclNumbers.`0x8`
import typings.webcl.webclNumbers.`0xFFFFFFFF`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_type - bitfield */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1`
  - typings.webcl.webclNumbers.`0x2`
  - typings.webcl.webclNumbers.`0x4`
  - typings.webcl.webclNumbers.`0x8`
  - typings.webcl.webclNumbers.`0xFFFFFFFF`
*/
trait DeviceTypeBits extends js.Object

object DeviceTypeBits {
  @scala.inline
  def DEVICE_TYPE_ACCELERATOR: `0x8` = this.cast(0x8)
  @scala.inline
  def DEVICE_TYPE_ALL: `0xFFFFFFFF` = this.cast(0xFFFFFFFF)
  @scala.inline
  def DEVICE_TYPE_CPU: `0x2` = this.cast(0x2)
  @scala.inline
  def DEVICE_TYPE_DEFAULT: `0x1` = this.cast(0x1)
  @scala.inline
  def DEVICE_TYPE_GPU: `0x4` = this.cast(0x4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

