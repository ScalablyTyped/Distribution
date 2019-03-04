package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPathAction extends js.Object {
  var action: GitPathActions
  var base64Content: java.lang.String
  var path: java.lang.String
  var rawTextContent: java.lang.String
  var targetPath: java.lang.String
}

object GitPathAction {
  @scala.inline
  def apply(
    action: GitPathActions,
    base64Content: java.lang.String,
    path: java.lang.String,
    rawTextContent: java.lang.String,
    targetPath: java.lang.String
  ): GitPathAction = {
    val __obj = js.Dynamic.literal(action = action, base64Content = base64Content, path = path, rawTextContent = rawTextContent, targetPath = targetPath)
  
    __obj.asInstanceOf[GitPathAction]
  }
}

