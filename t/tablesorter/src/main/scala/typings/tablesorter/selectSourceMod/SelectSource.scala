package typings.tablesorter.selectSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectSource extends js.Object {
  /**
    * Classes to add to the dropdown-entries.
    */
  var `data-class`: js.UndefOr[String] = js.native
  /**
    * The display-name of the filter source.
    */
  var text: String = js.native
  /**
    * The filter-value.
    */
  var value: js.UndefOr[String] = js.native
}

object SelectSource {
  @scala.inline
  def apply(text: String): SelectSource = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectSource]
  }
  @scala.inline
  implicit class SelectSourceOps[Self <: SelectSource] (val x: Self) extends AnyVal {
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
    def `setData-class`(value: String): Self = this.set("data-class", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-class`: Self = this.set("data-class", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

