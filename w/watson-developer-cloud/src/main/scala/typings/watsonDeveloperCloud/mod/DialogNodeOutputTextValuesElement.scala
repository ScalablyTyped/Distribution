package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeOutputTextValuesElement. */
@js.native
trait DialogNodeOutputTextValuesElement extends js.Object {
  /** The text of a response. This string can include newline characters (`\\n`), Markdown tagging, or other special characters, if supported by the channel. It must be no longer than 4096 characters. */
  var text: js.UndefOr[String] = js.native
}

object DialogNodeOutputTextValuesElement {
  @scala.inline
  def apply(): DialogNodeOutputTextValuesElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutputTextValuesElement]
  }
  @scala.inline
  implicit class DialogNodeOutputTextValuesElementOps[Self <: DialogNodeOutputTextValuesElement] (val x: Self) extends AnyVal {
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

