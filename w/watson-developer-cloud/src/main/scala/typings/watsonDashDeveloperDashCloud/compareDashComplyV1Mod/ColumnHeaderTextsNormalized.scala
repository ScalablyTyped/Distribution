package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** If you provide customization input, the normalized version of the column header texts according to the customization; otherwise, the same value as `column_header_texts`. */
trait ColumnHeaderTextsNormalized extends js.Object {
  /** The normalized version of a column header text. */
  var text_normalized: js.UndefOr[String] = js.undefined
}

object ColumnHeaderTextsNormalized {
  @scala.inline
  def apply(text_normalized: String = null): ColumnHeaderTextsNormalized = {
    val __obj = js.Dynamic.literal()
    if (text_normalized != null) __obj.updateDynamic("text_normalized")(text_normalized.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnHeaderTextsNormalized]
  }
}

