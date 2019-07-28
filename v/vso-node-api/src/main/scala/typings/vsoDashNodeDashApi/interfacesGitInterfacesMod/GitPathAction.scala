package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(action = action, base64Content = base64Content, path = path, rawTextContent = rawTextContent, targetPath = targetPath)
  
    __obj.asInstanceOf[GitPathAction]
  }
}

