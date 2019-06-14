package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Report Open Action options for Xrm.Url.ReportOpenParameters.actions.
  * @see {@link Xrm.Url.ReportAction}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.filter
  - xrmLib.xrmLibStrings.run
*/
trait ReportAction extends js.Object

object ReportAction {
  @scala.inline
  def Filter: xrmLib.xrmLibStrings.filter = this.cast("filter")
  @scala.inline
  def Run: xrmLib.xrmLibStrings.run = this.cast("run")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

