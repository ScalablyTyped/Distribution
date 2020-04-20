package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x1161`
import typings.webcl.webclNumbers.`0x1162`
import typings.webcl.webclNumbers.`0x1163`
import typings.webcl.webclNumbers.`0x1164`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_map_flags - bitfield */
//MAP_READ                                  = 0x1, // disallowed
//MAP_WRITE                                 = 0x2, // disallowed
/* cl_prograinfo */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1161`
  - typings.webcl.webclNumbers.`0x1162`
  - typings.webcl.webclNumbers.`0x1163`
  - typings.webcl.webclNumbers.`0x1164`
*/
trait ProgramInfo extends js.Object

object ProgramInfo {
  //PROGRAM_REFERENCE_COUNT                   = 0x1160, // disallowed
  @scala.inline
  def PROGRAM_CONTEXT: `0x1161` = 0x1161.asInstanceOf[`0x1161`]
  @scala.inline
  def PROGRAM_DEVICES: `0x1163` = 0x1163.asInstanceOf[`0x1163`]
  @scala.inline
  def PROGRAM_NUM_DEVICES: `0x1162` = 0x1162.asInstanceOf[`0x1162`]
  @scala.inline
  def PROGRAM_SOURCE: `0x1164` = 0x1164.asInstanceOf[`0x1164`]
}

