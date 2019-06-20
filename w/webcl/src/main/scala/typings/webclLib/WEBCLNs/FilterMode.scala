package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_filter_mode */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0x1140`
  - webclLib.webclLibNumbers.`0x1141`
*/
trait FilterMode extends js.Object

object FilterMode {
  @scala.inline
  def FILTER_LINEAR: webclLib.webclLibNumbers.`0x1141` = this.cast(0x1141)
  @scala.inline
  def FILTER_NEAREST: webclLib.webclLibNumbers.`0x1140` = this.cast(0x1140)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

