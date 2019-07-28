package typings.webcl.WEBCLNs

import typings.webcl.webclNumbers.`0x10`
import typings.webcl.webclNumbers.`0x1`
import typings.webcl.webclNumbers.`0x20`
import typings.webcl.webclNumbers.`0x2`
import typings.webcl.webclNumbers.`0x40`
import typings.webcl.webclNumbers.`0x4`
import typings.webcl.webclNumbers.`0x8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_fp_config - bitfield */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1`
  - typings.webcl.webclNumbers.`0x2`
  - typings.webcl.webclNumbers.`0x4`
  - typings.webcl.webclNumbers.`0x8`
  - typings.webcl.webclNumbers.`0x10`
  - typings.webcl.webclNumbers.`0x20`
  - typings.webcl.webclNumbers.`0x40`
*/
trait DeviceFPConfigBits extends js.Object

object DeviceFPConfigBits {
  @scala.inline
  def FP_DENORM: `0x1` = this.cast(0x1)
  @scala.inline
  def FP_FMA: `0x20` = this.cast(0x20)
  @scala.inline
  def FP_INF_NAN: `0x2` = this.cast(0x2)
  @scala.inline
  def FP_ROUND_TO_INF: `0x10` = this.cast(0x10)
  @scala.inline
  def FP_ROUND_TO_NEAREST: `0x4` = this.cast(0x4)
  @scala.inline
  def FP_ROUND_TO_ZERO: `0x8` = this.cast(0x8)
  @scala.inline
  def FP_SOFT_FLOAT: `0x40` = this.cast(0x40)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

