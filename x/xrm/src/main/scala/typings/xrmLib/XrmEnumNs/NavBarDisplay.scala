package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Navigation Bar Display options for Xrm.Url.FormOpenParameters.navbar, Xrm.Url.ViewOpenParameters.navbar, and Xrm.Utility.FormOpenParameters.navbar.
  * @see {@link Xrm.Url.NavBarDisplay}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.entity
  - xrmLib.xrmLibStrings.on
  - xrmLib.xrmLibStrings.off
*/
trait NavBarDisplay extends js.Object

object NavBarDisplay {
  @scala.inline
  def Entity: xrmLib.xrmLibStrings.entity = this.cast("entity")
  @scala.inline
  def Off: xrmLib.xrmLibStrings.off = this.cast("off")
  @scala.inline
  def On: xrmLib.xrmLibStrings.on = this.cast("on")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

