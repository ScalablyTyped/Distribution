package typings.xrm.XrmEnumNs

import typings.xrm.xrmStrings.filter
import typings.xrm.xrmStrings.run
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Report Open Action options for Xrm.Url.ReportOpenParameters.actions.
  * @see {@link Xrm.Url.ReportAction}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.filter
  - typings.xrm.xrmStrings.run
*/
trait ReportAction extends js.Object

object ReportAction {
  @scala.inline
  def Filter: filter = this.cast("filter")
  @scala.inline
  def Run: run = this.cast("run")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

