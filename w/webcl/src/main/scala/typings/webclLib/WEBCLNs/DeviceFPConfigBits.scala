package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_fp_config - bitfield */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1`
  - webclLib.webclLibNumbers.`0x2`
  - webclLib.webclLibNumbers.`0x4`
  - webclLib.webclLibNumbers.`0x8`
  - webclLib.webclLibNumbers.`0x10`
  - webclLib.webclLibNumbers.`0x20`
  - webclLib.webclLibNumbers.`0x40`
*/
trait DeviceFPConfigBits extends js.Object

object DeviceFPConfigBits {
  @scala.inline
  def FP_DENORM: webclLib.webclLibNumbers.`0x1` = this.cast(0x1)
  @scala.inline
  def FP_FMA: webclLib.webclLibNumbers.`0x20` = this.cast(0x20)
  @scala.inline
  def FP_INF_NAN: webclLib.webclLibNumbers.`0x2` = this.cast(0x2)
  @scala.inline
  def FP_ROUND_TO_INF: webclLib.webclLibNumbers.`0x10` = this.cast(0x10)
  @scala.inline
  def FP_ROUND_TO_NEAREST: webclLib.webclLibNumbers.`0x4` = this.cast(0x4)
  @scala.inline
  def FP_ROUND_TO_ZERO: webclLib.webclLibNumbers.`0x8` = this.cast(0x8)
  @scala.inline
  def FP_SOFT_FLOAT: webclLib.webclLibNumbers.`0x40` = this.cast(0x40)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

