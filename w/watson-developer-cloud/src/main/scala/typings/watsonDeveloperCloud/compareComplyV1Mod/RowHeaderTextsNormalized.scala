package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** If you provide customization input, the normalized version of the row header texts according to the customization; otherwise, the same value as `row_header_texts`. */
@js.native
trait RowHeaderTextsNormalized extends js.Object {
  /** The normalized version of a row header text. */
  var text_normalized: js.UndefOr[String] = js.native
}

object RowHeaderTextsNormalized {
  @scala.inline
  def apply(): RowHeaderTextsNormalized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderTextsNormalized]
  }
  @scala.inline
  implicit class RowHeaderTextsNormalizedOps[Self <: RowHeaderTextsNormalized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText_normalized(value: String): Self = this.set("text_normalized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText_normalized: Self = this.set("text_normalized", js.undefined)
  }
  
}

