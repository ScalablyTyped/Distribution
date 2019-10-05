package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x1`
import typings.webcl.webclNumbers.`0x2`
import typings.webcl.webclNumbers.`0x4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_mem_flags - bitfield */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1`
  - typings.webcl.webclNumbers.`0x2`
  - typings.webcl.webclNumbers.`0x4`
*/
trait MemFlagsBits extends js.Object

object MemFlagsBits {
  @scala.inline
  def MEM_READ_ONLY: `0x4` = this.cast(0x4)
  @scala.inline
  def MEM_READ_WRITE: `0x1` = this.cast(0x1)
  @scala.inline
  def MEM_WRITE_ONLY: `0x2` = this.cast(0x2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

