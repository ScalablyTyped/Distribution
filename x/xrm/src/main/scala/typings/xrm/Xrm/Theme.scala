package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Themes for {@link GlobalContext.getCurrentTheme globalContext.getCurrentTheme()}.
  * @remarks getCurrentTheme() does not work with Dynamics CRM for tablets or in the unified interface.
  * @see {@link XrmEnum.Theme}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.default
  - typings.xrm.xrmStrings.Office12Blue
  - typings.xrm.xrmStrings.Office14Silver
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  def Office12Blue: typings.xrm.xrmStrings.Office12Blue = this.cast("Office12Blue")
  @scala.inline
  def Office14Silver: typings.xrm.xrmStrings.Office14Silver = this.cast("Office14Silver")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.xrm.xrmStrings.default = this.cast("default")
}

