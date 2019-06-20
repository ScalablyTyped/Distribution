package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_bool */
/* Rewritten from type alias, can be one of: 
  - webclLib.webclLibNumbers.`0`
  - webclLib.webclLibNumbers.`1`
*/
trait Bool extends js.Object

object Bool {
  @scala.inline
  def FALSE: webclLib.webclLibNumbers.`0` = this.cast(0)
  @scala.inline
  def TRUE: webclLib.webclLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

