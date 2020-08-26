package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFolder extends js.Object {
  /**
    * The name of the workspace folder. Used to refer to this
    * workspace folder in the user interface.
    */
  var name: String = js.native
  /**
    * The associated URI for this workspace folder.
    */
  var uri: String = js.native
}

object WorkspaceFolder {
  @scala.inline
  def apply(name: String, uri: String): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFolder]
  }
  @scala.inline
  implicit class WorkspaceFolderOps[Self <: WorkspaceFolder] (val x: Self) extends AnyVal {
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

