package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Workspace settings related to the Watson Assistant tool. */
@js.native
trait WorkspaceSystemSettingsTooling extends StObject {
  
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
  implicit class WorkspaceSystemSettingsToolingMutableBuilder[Self <: WorkspaceSystemSettingsTooling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStore_generic_responses(value: Boolean): Self = StObject.set(x, "store_generic_responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore_generic_responsesUndefined: Self = StObject.set(x, "store_generic_responses", js.undefined)
  }
}
