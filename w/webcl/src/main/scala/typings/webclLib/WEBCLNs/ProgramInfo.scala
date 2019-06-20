package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_map_flags - bitfield */
//MAP_READ                                  = 0x1, // disallowed
//MAP_WRITE                                 = 0x2, // disallowed
/* cl_prograinfo */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1161`
  - webclLib.webclLibNumbers.`0x1162`
  - webclLib.webclLibNumbers.`0x1163`
  - webclLib.webclLibNumbers.`0x1164`
*/
trait ProgramInfo extends js.Object

object ProgramInfo {
  //PROGRAM_REFERENCE_COUNT                   = 0x1160, // disallowed
  @scala.inline
  def PROGRAM_CONTEXT: webclLib.webclLibNumbers.`0x1161` = this.cast(0x1161)
  @scala.inline
  def PROGRAM_DEVICES: webclLib.webclLibNumbers.`0x1163` = this.cast(0x1163)
  @scala.inline
  def PROGRAM_NUM_DEVICES: webclLib.webclLibNumbers.`0x1162` = this.cast(0x1162)
  @scala.inline
  def PROGRAM_SOURCE: webclLib.webclLibNumbers.`0x1164` = this.cast(0x1164)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

