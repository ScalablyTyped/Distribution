package typings.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Report Open Action options for Xrm.Url.ReportOpenParameters.actions.
  * @see {@link XrmEnum.ReportAction}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.filter
  - typings.xrm.xrmStrings.run
*/
trait ReportAction extends js.Object

object ReportAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def filter: typings.xrm.xrmStrings.filter = this.cast("filter")
  @scala.inline
  def run: typings.xrm.xrmStrings.run = this.cast("run")
}

