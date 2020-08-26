package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentAuthorInformation extends js.Object {
  /**
    * The optional icon path for the author
    */
  var iconPath: js.UndefOr[Uri] = js.native
  /**
    * The display name of the author of the comment
    */
  var name: String = js.native
}

object CommentAuthorInformation {
  @scala.inline
  def apply(name: String): CommentAuthorInformation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentAuthorInformation]
  }
  @scala.inline
  implicit class CommentAuthorInformationOps[Self <: CommentAuthorInformation] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconPath(value: Uri): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
  }
  
}

