package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolder extends js.Object {
  /**
    * The name of the workspace folder. Defaults to the
    * uri's basename.
    */
  var name: java.lang.String
  /**
    * The associated URI for this workspace folder.
    */
  var uri: java.lang.String
}

object WorkspaceFolder {
  @scala.inline
  def apply(name: java.lang.String, uri: java.lang.String): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(name = name, uri = uri)
  
    __obj.asInstanceOf[WorkspaceFolder]
  }
}

