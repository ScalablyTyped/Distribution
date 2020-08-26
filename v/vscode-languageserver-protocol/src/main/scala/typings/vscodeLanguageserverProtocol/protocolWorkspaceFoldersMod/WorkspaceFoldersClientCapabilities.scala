package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typings.vscodeLanguageserverProtocol.anon.WorkspaceFolders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFoldersClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[WorkspaceFolders] = js.native
}

object WorkspaceFoldersClientCapabilities {
  @scala.inline
  def apply(): WorkspaceFoldersClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFoldersClientCapabilities]
  }
  @scala.inline
  implicit class WorkspaceFoldersClientCapabilitiesOps[Self <: WorkspaceFoldersClientCapabilities] (val x: Self) extends AnyVal {
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
    def setWorkspace(value: WorkspaceFolders): Self = this.set("workspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
  
}

