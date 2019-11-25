package typings.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigation Bar Display options for Xrm.Url.FormOpenParameters.navbar, Xrm.Url.ViewOpenParameters.navbar, and Xrm.Utility.FormOpenParameters.navbar.
  * @see {@link XrmEnum.NavBarDisplay}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.entity
  - typings.xrm.xrmStrings.off
  - typings.xrm.xrmStrings.on
*/
trait NavBarDisplay extends js.Object

object NavBarDisplay {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def entity: typings.xrm.xrmStrings.entity = this.cast("entity")
  @scala.inline
  def off: typings.xrm.xrmStrings.off = this.cast("off")
  @scala.inline
  def on: typings.xrm.xrmStrings.on = this.cast("on")
}

