package typings.webcl.WEBCLNs

import typings.webcl.webclNumbers.`-1`
import typings.webcl.webclNumbers.`-2`
import typings.webcl.webclNumbers.`-3`
import typings.webcl.webclNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_build_status */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0`
  - typings.webcl.webclNumbers.`-1`
  - typings.webcl.webclNumbers.`-2`
  - typings.webcl.webclNumbers.`-3`
*/
trait BuildStatus extends js.Object

object BuildStatus {
  @scala.inline
  def BUILD_ERROR: `-2` = this.cast(-2)
  @scala.inline
  def BUILD_IN_PROGRESS: `-3` = this.cast(-3)
  @scala.inline
  def BUILD_NONE: `-1` = this.cast(-1)
  @scala.inline
  def BUILD_SUCCESS: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

