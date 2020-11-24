package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Workspace settings related to the Watson Assistant tool. */
@js.native
trait WorkspaceSystemSettingsTooling extends js.Object {
  
  /** Whether the dialog JSON editor displays text responses within the `output.generic` object. */
  var store_generic_responses: js.UndefOr[Boolean] = js.native
}
object WorkspaceSystemSettingsTooling {
  
  @scala.inline
  def apply(): WorkspaceSystemSettingsTooling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettingsTooling]
  }
  
  @scala.inline
  implicit class WorkspaceSystemSettingsToolingOps[Self <: WorkspaceSystemSettingsTooling] (val x: Self) extends AnyVal {
    
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
    def setStore_generic_responses(value: Boolean): Self = this.set("store_generic_responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore_generic_responses: Self = this.set("store_generic_responses", js.undefined)
  }
}
