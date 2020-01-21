package typings.tablesorter.pagerClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerClasses extends js.Object {
  /**
    * A set of css-classes to apply to the container.
    */
  var container: js.UndefOr[String] = js.undefined
  /**
    * The css-class to apply to disabled pager-controls.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
    */
  var errorRow: js.UndefOr[String] = js.undefined
}

object PagerClasses {
  @scala.inline
  def apply(container: String = null, disabled: String = null, errorRow: String = null): PagerClasses = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorRow != null) __obj.updateDynamic("errorRow")(errorRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerClasses]
  }
}

