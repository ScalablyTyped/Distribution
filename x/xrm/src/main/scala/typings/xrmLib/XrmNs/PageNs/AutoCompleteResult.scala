package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Result value of AutoCompleteResultSet
  * @deprecated Use {@link Xrm.Controls.AutoCompleteResult} instead.
  */
trait AutoCompleteResult
  extends xrmLib.XrmNs.ControlsNs.AutoCompleteResult

object AutoCompleteResult {
  @scala.inline
  def apply(
    fields: js.Array[java.lang.String],
    id: java.lang.String | scala.Double,
    icon: java.lang.String = null
  ): AutoCompleteResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[AutoCompleteResult]
  }
}

