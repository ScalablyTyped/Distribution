package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_build_status */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0`
  - webclLib.webclLibNumbers.`-1`
  - webclLib.webclLibNumbers.`-2`
  - webclLib.webclLibNumbers.`-3`
*/
trait BuildStatus extends js.Object

object BuildStatus {
  @scala.inline
  def BUILD_ERROR: webclLib.webclLibNumbers.`-2` = this.cast(-2)
  @scala.inline
  def BUILD_IN_PROGRESS: webclLib.webclLibNumbers.`-3` = this.cast(-3)
  @scala.inline
  def BUILD_NONE: webclLib.webclLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  def BUILD_SUCCESS: webclLib.webclLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

