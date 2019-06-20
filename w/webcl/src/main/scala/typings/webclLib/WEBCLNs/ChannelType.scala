package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_channel_type */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x10D0`
  - webclLib.webclLibNumbers.`0x10D1`
  - webclLib.webclLibNumbers.`0x10D2`
  - webclLib.webclLibNumbers.`0x10D3`
  - webclLib.webclLibNumbers.`0x10D4`
  - webclLib.webclLibNumbers.`0x10D5`
  - webclLib.webclLibNumbers.`0x10D6`
  - webclLib.webclLibNumbers.`0x10D7`
  - webclLib.webclLibNumbers.`0x10D8`
  - webclLib.webclLibNumbers.`0x10D9`
  - webclLib.webclLibNumbers.`0x10DA`
  - webclLib.webclLibNumbers.`0x10DB`
  - webclLib.webclLibNumbers.`0x10DC`
  - webclLib.webclLibNumbers.`0x10DD`
  - webclLib.webclLibNumbers.`0x10DE`
*/
trait ChannelType extends js.Object

object ChannelType {
  @scala.inline
  def FLOAT: webclLib.webclLibNumbers.`0x10DE` = this.cast(0x10DE)
  @scala.inline
  def HALF_FLOAT: webclLib.webclLibNumbers.`0x10DD` = this.cast(0x10DD)
  @scala.inline
  def SIGNED_INT16: webclLib.webclLibNumbers.`0x10D8` = this.cast(0x10D8)
  @scala.inline
  def SIGNED_INT32: webclLib.webclLibNumbers.`0x10D9` = this.cast(0x10D9)
  @scala.inline
  def SIGNED_INT8: webclLib.webclLibNumbers.`0x10D7` = this.cast(0x10D7)
  @scala.inline
  def SNORM_INT16: webclLib.webclLibNumbers.`0x10D1` = this.cast(0x10D1)
  @scala.inline
  def SNORM_INT8: webclLib.webclLibNumbers.`0x10D0` = this.cast(0x10D0)
  @scala.inline
  def UNORM_INT16: webclLib.webclLibNumbers.`0x10D3` = this.cast(0x10D3)
  @scala.inline
  def UNORM_INT8: webclLib.webclLibNumbers.`0x10D2` = this.cast(0x10D2)
  @scala.inline
  def UNORM_INT_101010: webclLib.webclLibNumbers.`0x10D6` = this.cast(0x10D6)
  @scala.inline
  def UNORM_SHORT_555: webclLib.webclLibNumbers.`0x10D5` = this.cast(0x10D5)
  @scala.inline
  def UNORM_SHORT_565: webclLib.webclLibNumbers.`0x10D4` = this.cast(0x10D4)
  @scala.inline
  def UNSIGNED_INT16: webclLib.webclLibNumbers.`0x10DB` = this.cast(0x10DB)
  @scala.inline
  def UNSIGNED_INT32: webclLib.webclLibNumbers.`0x10DC` = this.cast(0x10DC)
  @scala.inline
  def UNSIGNED_INT8: webclLib.webclLibNumbers.`0x10DA` = this.cast(0x10DA)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

