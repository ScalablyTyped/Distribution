package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining the message input to be sent to the assistant if the user selects the corresponding option. */
@js.native
trait DialogNodeOutputOptionsElementValue extends js.Object {
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.native
}

object DialogNodeOutputOptionsElementValue {
  @scala.inline
  def apply(): DialogNodeOutputOptionsElementValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutputOptionsElementValue]
  }
  @scala.inline
  implicit class DialogNodeOutputOptionsElementValueOps[Self <: DialogNodeOutputOptionsElementValue] (val x: Self) extends AnyVal {
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
    def setInput(value: MessageInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
  }
  
}

