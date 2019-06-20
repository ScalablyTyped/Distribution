package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_device_local_mem_type */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1`
  - webclLib.webclLibNumbers.`0x2`
*/
trait DeviceLocalMemType extends js.Object

object DeviceLocalMemType {
  @scala.inline
  def GLOBAL: webclLib.webclLibNumbers.`0x2` = this.cast(0x2)
  @scala.inline
  def LOCAL: webclLib.webclLibNumbers.`0x1` = this.cast(0x1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

