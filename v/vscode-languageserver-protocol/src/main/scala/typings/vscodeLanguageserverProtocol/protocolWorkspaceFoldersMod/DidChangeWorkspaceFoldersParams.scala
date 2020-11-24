package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidChangeWorkspaceFoldersParams extends js.Object {
  
  /**
    * The actual workspace folder change event.
    */
  var event: WorkspaceFoldersChangeEvent = js.native
}
object DidChangeWorkspaceFoldersParams {
  
  @scala.inline
  def apply(event: WorkspaceFoldersChangeEvent): DidChangeWorkspaceFoldersParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeWorkspaceFoldersParams]
  }
  
  @scala.inline
  implicit class DidChangeWorkspaceFoldersParamsOps[Self <: DidChangeWorkspaceFoldersParams] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: WorkspaceFoldersChangeEvent): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
