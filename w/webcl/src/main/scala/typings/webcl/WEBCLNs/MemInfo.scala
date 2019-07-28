package typings.webcl.WEBCLNs

import typings.webcl.webclNumbers.`0x1100`
import typings.webcl.webclNumbers.`0x1101`
import typings.webcl.webclNumbers.`0x1102`
import typings.webcl.webclNumbers.`0x1106`
import typings.webcl.webclNumbers.`0x1107`
import typings.webcl.webclNumbers.`0x1108`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_meinfo */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1100`
  - typings.webcl.webclNumbers.`0x1101`
  - typings.webcl.webclNumbers.`0x1102`
  - typings.webcl.webclNumbers.`0x1106`
  - typings.webcl.webclNumbers.`0x1107`
  - typings.webcl.webclNumbers.`0x1108`
*/
trait MemInfo extends js.Object

object MemInfo {
  @scala.inline
  def MEM_ASSOCIATED_MEMOBJECT: `0x1107` = this.cast(0x1107)
  //MEM_HOST_PTR                              = 0x1103, // disallowed
  //MEM_MAP_COUNT                             = 0x1104, // disallowed
  //MEM_REFERENCE_COUNT                       = 0x1105, // disallowed
  @scala.inline
  def MEM_CONTEXT: `0x1106` = this.cast(0x1106)
  @scala.inline
  def MEM_FLAGS: `0x1101` = this.cast(0x1101)
  @scala.inline
  def MEM_OFFSET: `0x1108` = this.cast(0x1108)
  @scala.inline
  def MEM_SIZE: `0x1102` = this.cast(0x1102)
  @scala.inline
  def MEM_TYPE: `0x1100` = this.cast(0x1100)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

