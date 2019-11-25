package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolder extends js.Object {
  /**
    * The name of the workspace folder. Defaults to the
    * uri's basename.
    */
  var name: String
  /**
    * The associated URI for this workspace folder.
    */
  var uri: String
}

object WorkspaceFolder {
  @scala.inline
  def apply(name: String, uri: String): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkspaceFolder]
  }
}

