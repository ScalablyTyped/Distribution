package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typings.vscodeLanguageserverProtocol.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFoldersServerCapabilities extends js.Object {
  /**
    * The workspace server capabilities
    */
  var workspace: js.UndefOr[`4`] = js.native
}

object WorkspaceFoldersServerCapabilities {
  @scala.inline
  def apply(): WorkspaceFoldersServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
  }
  @scala.inline
  implicit class WorkspaceFoldersServerCapabilitiesOps[Self <: WorkspaceFoldersServerCapabilities] (val x: Self) extends AnyVal {
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
    def setWorkspace(value: `4`): Self = this.set("workspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
  
}

