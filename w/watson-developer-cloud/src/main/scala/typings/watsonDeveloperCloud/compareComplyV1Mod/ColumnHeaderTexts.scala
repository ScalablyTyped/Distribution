package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `text` value of a column header that is applicable to the current cell. */
@js.native
trait ColumnHeaderTexts extends js.Object {
  /** The `text` value of a column header. */
  var text: js.UndefOr[String] = js.native
}

object ColumnHeaderTexts {
  @scala.inline
  def apply(): ColumnHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderTexts]
  }
  @scala.inline
  implicit class ColumnHeaderTextsOps[Self <: ColumnHeaderTexts] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

