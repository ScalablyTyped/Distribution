package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_type - bitfield */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1`
  - webclLib.webclLibNumbers.`0x2`
  - webclLib.webclLibNumbers.`0x4`
  - webclLib.webclLibNumbers.`0x8`
  - webclLib.webclLibNumbers.`0xFFFFFFFF`
*/
trait DeviceTypeBits extends js.Object

object DeviceTypeBits {
  @scala.inline
  def DEVICE_TYPE_ACCELERATOR: webclLib.webclLibNumbers.`0x8` = this.cast(0x8)
  @scala.inline
  def DEVICE_TYPE_ALL: webclLib.webclLibNumbers.`0xFFFFFFFF` = this.cast(0xFFFFFFFF)
  @scala.inline
  def DEVICE_TYPE_CPU: webclLib.webclLibNumbers.`0x2` = this.cast(0x2)
  @scala.inline
  def DEVICE_TYPE_DEFAULT: webclLib.webclLibNumbers.`0x1` = this.cast(0x1)
  @scala.inline
  def DEVICE_TYPE_GPU: webclLib.webclLibNumbers.`0x4` = this.cast(0x4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

