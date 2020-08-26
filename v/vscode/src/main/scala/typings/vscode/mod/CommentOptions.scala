package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentOptions extends js.Object {
  /**
    * An optional string to show as placeholder in the comment input box when it's focused.
    */
  var placeHolder: js.UndefOr[String] = js.native
  /**
    * An optional string to show on the comment input box when it's collapsed.
    */
  var prompt: js.UndefOr[String] = js.native
}

object CommentOptions {
  @scala.inline
  def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  @scala.inline
  implicit class CommentOptionsOps[Self <: CommentOptions] (val x: Self) extends AnyVal {
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
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
  }
  
}

