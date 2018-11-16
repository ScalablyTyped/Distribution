package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReportAction extends js.Object

/**
     * Constant Enum: Report Open Action options for Xrm.Url.ReportOpenParameters.actions.
     * @see {@link Xrm.Url.ReportAction}
     */
@JSGlobal("XrmEnum.ReportAction")
@js.native
object ReportAction extends js.Object {
  @js.native
  sealed trait Filter
    extends xrmLib.XrmEnumNs.ReportAction
  
  @js.native
  sealed trait Run
    extends xrmLib.XrmEnumNs.ReportAction
  
  /* "filter" */ val Filter: Filter with java.lang.String = js.native
  /* "run" */ val Run: Run with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.ReportAction with java.lang.String] = js.native
}

