package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_event_info  */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x11D0`
  - webclLib.webclLibNumbers.`0x11D1`
  - webclLib.webclLibNumbers.`0x11D3`
  - webclLib.webclLibNumbers.`0x11D4`
*/
trait EventInfo extends js.Object

object EventInfo {
  //EVENT_REFERENCE_COUNT                     = 0x11D2, // disallowed
  @scala.inline
  def EVENT_COMMAND_EXECUTION_STATUS: webclLib.webclLibNumbers.`0x11D3` = this.cast(0x11D3)
  @scala.inline
  def EVENT_COMMAND_QUEUE: webclLib.webclLibNumbers.`0x11D0` = this.cast(0x11D0)
  @scala.inline
  def EVENT_COMMAND_TYPE: webclLib.webclLibNumbers.`0x11D1` = this.cast(0x11D1)
  @scala.inline
  def EVENT_CONTEXT: webclLib.webclLibNumbers.`0x11D4` = this.cast(0x11D4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

