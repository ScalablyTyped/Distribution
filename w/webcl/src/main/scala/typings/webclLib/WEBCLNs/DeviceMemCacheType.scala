package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_MEM_CACHE_type */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x0`
  - webclLib.webclLibNumbers.`0x1`
  - webclLib.webclLibNumbers.`0x2`
*/
trait DeviceMemCacheType extends js.Object

object DeviceMemCacheType {
  @scala.inline
  def NONE: webclLib.webclLibNumbers.`0x0` = this.cast(0x0)
  @scala.inline
  def READ_ONLY_CACHE: webclLib.webclLibNumbers.`0x1` = this.cast(0x1)
  @scala.inline
  def READ_WRITE_CACHE: webclLib.webclLibNumbers.`0x2` = this.cast(0x2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

