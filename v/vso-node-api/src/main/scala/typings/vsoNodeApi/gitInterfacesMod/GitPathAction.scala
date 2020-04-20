package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPathAction extends js.Object {
  var action: GitPathActions
  var base64Content: String
  var path: String
  var rawTextContent: String
  var targetPath: String
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
}

