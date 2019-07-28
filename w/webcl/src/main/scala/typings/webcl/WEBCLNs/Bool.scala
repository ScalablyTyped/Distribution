package typings.webcl.WEBCLNs

import typings.webcl.webclNumbers.`0`
import typings.webcl.webclNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_bool */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0`
  - typings.webcl.webclNumbers.`1`
*/
trait Bool extends js.Object

object Bool {
  @scala.inline
  def FALSE: `0` = this.cast(0)
  @scala.inline
  def TRUE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

