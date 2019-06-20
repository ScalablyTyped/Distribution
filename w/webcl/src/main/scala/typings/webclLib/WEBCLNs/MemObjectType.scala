package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_meobject_type */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x10F0`
  - webclLib.webclLibNumbers.`0x10F1`
  - webclLib.webclLibNumbers.`0x10F2`
*/
trait MemObjectType extends js.Object

object MemObjectType {
  @scala.inline
  def MEM_OBJECT_BUFFER: webclLib.webclLibNumbers.`0x10F0` = this.cast(0x10F0)
  @scala.inline
  def MEM_OBJECT_IMAGE2D: webclLib.webclLibNumbers.`0x10F1` = this.cast(0x10F1)
  @scala.inline
  def MEM_OBJECT_IMAGE3D: webclLib.webclLibNumbers.`0x10F2` = this.cast(0x10F2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

