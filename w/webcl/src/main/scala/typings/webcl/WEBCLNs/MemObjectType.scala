package typings.webcl.WEBCLNs

import typings.webcl.webclNumbers.`0x10F0`
import typings.webcl.webclNumbers.`0x10F1`
import typings.webcl.webclNumbers.`0x10F2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_meobject_type */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x10F0`
  - typings.webcl.webclNumbers.`0x10F1`
  - typings.webcl.webclNumbers.`0x10F2`
*/
trait MemObjectType extends js.Object

object MemObjectType {
  @scala.inline
  def MEM_OBJECT_BUFFER: `0x10F0` = this.cast(0x10F0)
  @scala.inline
  def MEM_OBJECT_IMAGE2D: `0x10F1` = this.cast(0x10F1)
  @scala.inline
  def MEM_OBJECT_IMAGE3D: `0x10F2` = this.cast(0x10F2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

