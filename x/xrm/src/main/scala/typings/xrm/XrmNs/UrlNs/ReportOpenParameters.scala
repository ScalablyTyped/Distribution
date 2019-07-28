package typings.xrm.XrmNs.UrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters of a request to open a report with viewer.apsx (as with
  * window.open).  Useful for parsing out the keys and values into a string of the format:
  * "&key=value"
  *
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  */
trait ReportOpenParameters extends js.Object {
  /**
    * The action to perform, as either "run" or "filter".
    * @remarks **Actions**:
    * * "run"       Executes the report with default filters.
    * * "filter"    Presents the user with the filter editor, and a "Run Report" button.
    */
  var action: ReportAction
  /**
    * The file name of the report.  For out-of-box reports, this parameter enables context-sensitive
    * help.
    */
  var helpID: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier, held in the report's 'reportid' attribute, in Guid format.
    */
  var id: String
}

object ReportOpenParameters {
  @scala.inline
  def apply(action: ReportAction, id: String, helpID: String = null): ReportOpenParameters = {
    val __obj = js.Dynamic.literal(action = action, id = id)
    if (helpID != null) __obj.updateDynamic("helpID")(helpID)
    __obj.asInstanceOf[ReportOpenParameters]
  }
}

