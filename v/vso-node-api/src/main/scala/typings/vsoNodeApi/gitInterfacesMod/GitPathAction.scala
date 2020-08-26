package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPathAction extends js.Object {
  var action: GitPathActions = js.native
  var base64Content: String = js.native
  var path: String = js.native
  var rawTextContent: String = js.native
  var targetPath: String = js.native
}

object GitPathAction {
  @scala.inline
  def apply(
    action: GitPathActions,
    base64Content: String,
    path: String,
    rawTextContent: String,
    targetPath: String
  ): GitPathAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], base64Content = base64Content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rawTextContent = rawTextContent.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPathAction]
  }
  @scala.inline
  implicit class GitPathActionOps[Self <: GitPathAction] (val x: Self) extends AnyVal {
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
    def setAction(value: GitPathActions): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase64Content(value: String): Self = this.set("base64Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawTextContent(value: String): Self = this.set("rawTextContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetPath(value: String): Self = this.set("targetPath", value.asInstanceOf[js.Any])
  }
  
}

