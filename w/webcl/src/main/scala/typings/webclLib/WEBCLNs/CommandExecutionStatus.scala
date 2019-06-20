package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* command execution status */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x0`
  - webclLib.webclLibNumbers.`0x1`
  - webclLib.webclLibNumbers.`0x2`
  - webclLib.webclLibNumbers.`0x3`
*/
trait CommandExecutionStatus extends js.Object

object CommandExecutionStatus {
  @scala.inline
  def COMPLETE: webclLib.webclLibNumbers.`0x0` = this.cast(0x0)
  @scala.inline
  def QUEUED: webclLib.webclLibNumbers.`0x3` = this.cast(0x3)
  @scala.inline
  def RUNNING: webclLib.webclLibNumbers.`0x1` = this.cast(0x1)
  @scala.inline
  def SUBMITTED: webclLib.webclLibNumbers.`0x2` = this.cast(0x2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

