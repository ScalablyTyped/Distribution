package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `text` value of a column header that is applicable to the current cell. */
trait ColumnHeaderTexts extends js.Object {
  /** The `text` value of a column header. */
  var text: js.UndefOr[String] = js.undefined
}

object ColumnHeaderTexts {
  @scala.inline
  def apply(text: String = null): ColumnHeaderTexts = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ColumnHeaderTexts]
  }
}

