package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** If you provide customization input, the normalized version of the row header texts according to the customization; otherwise, the same value as `row_header_texts`. */
trait RowHeaderTextsNormalized extends js.Object {
  /** The normalized version of a row header text. */
  var text_normalized: js.UndefOr[String] = js.undefined
}

object RowHeaderTextsNormalized {
  @scala.inline
  def apply(text_normalized: String = null): RowHeaderTextsNormalized = {
    val __obj = js.Dynamic.literal()
    if (text_normalized != null) __obj.updateDynamic("text_normalized")(text_normalized)
    __obj.asInstanceOf[RowHeaderTextsNormalized]
  }
}

