package typings.xrm.XrmEnumNs

import typings.xrm.xrmStrings.entity
import typings.xrm.xrmStrings.off
import typings.xrm.xrmStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Navigation Bar Display options for Xrm.Url.FormOpenParameters.navbar, Xrm.Url.ViewOpenParameters.navbar, and Xrm.Utility.FormOpenParameters.navbar.
  * @see {@link Xrm.Url.NavBarDisplay}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.entity
  - typings.xrm.xrmStrings.on
  - typings.xrm.xrmStrings.off
*/
trait NavBarDisplay extends js.Object

object NavBarDisplay {
  @scala.inline
  def Entity: entity = this.cast("entity")
  @scala.inline
  def Off: off = this.cast("off")
  @scala.inline
  def On: on = this.cast("on")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

