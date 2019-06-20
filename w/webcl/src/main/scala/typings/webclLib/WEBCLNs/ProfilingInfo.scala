package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_profiling_info  */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1280`
  - webclLib.webclLibNumbers.`0x1281`
  - webclLib.webclLibNumbers.`0x1282`
  - webclLib.webclLibNumbers.`0x1283`
*/
trait ProfilingInfo extends js.Object

object ProfilingInfo {
  @scala.inline
  def PROFILING_COMMAND_END: webclLib.webclLibNumbers.`0x1283` = this.cast(0x1283)
  @scala.inline
  def PROFILING_COMMAND_QUEUED: webclLib.webclLibNumbers.`0x1280` = this.cast(0x1280)
  @scala.inline
  def PROFILING_COMMAND_START: webclLib.webclLibNumbers.`0x1282` = this.cast(0x1282)
  @scala.inline
  def PROFILING_COMMAND_SUBMIT: webclLib.webclLibNumbers.`0x1281` = this.cast(0x1281)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

