package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Result value of AutoCompleteResultSet
  */
trait AutoCompleteResult extends js.Object {
  /**
    * Display value(s) for this auto-complete option
    */
  var fields: js.Array[String]
  /**
    * Url of the icon to display
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * The Identifier
    */
  var id: String | Double
}

object AutoCompleteResult {
  @scala.inline
  def apply(fields: js.Array[String], id: String | Double, icon: String = null): AutoCompleteResult = {
    val __obj = js.Dynamic.literal(fields = fields, id = id.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[AutoCompleteResult]
  }
}

