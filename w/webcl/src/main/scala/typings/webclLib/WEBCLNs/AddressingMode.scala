package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_addressing_mode */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1131`
  - webclLib.webclLibNumbers.`0x1132`
  - webclLib.webclLibNumbers.`0x1133`
  - webclLib.webclLibNumbers.`0x1134`
*/
trait AddressingMode extends js.Object

object AddressingMode {
  @scala.inline
  def ADDRESS_CLAMP: webclLib.webclLibNumbers.`0x1132` = this.cast(0x1132)
  //ADDRESS_NONE                              = 0x1130, // disallowed
  @scala.inline
  def ADDRESS_CLAMP_TO_EDGE: webclLib.webclLibNumbers.`0x1131` = this.cast(0x1131)
  @scala.inline
  def ADDRESS_MIRRORED_REPEAT: webclLib.webclLibNumbers.`0x1134` = this.cast(0x1134)
  @scala.inline
  def ADDRESS_REPEAT: webclLib.webclLibNumbers.`0x1133` = this.cast(0x1133)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

