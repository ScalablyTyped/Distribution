package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Workspace settings related to the Watson Assistant tool. */
trait WorkspaceSystemSettingsTooling extends StObject {
  
  /** Whether the dialog JSON editor displays text responses within the `output.generic` object. */
  var store_generic_responses: js.UndefOr[Boolean] = js.undefined
}
object WorkspaceSystemSettingsTooling {
  
  inline def apply(): WorkspaceSystemSettingsTooling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettingsTooling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceSystemSettingsTooling] (val x: Self) extends AnyVal {
    
    inline def setStore_generic_responses(value: Boolean): Self = StObject.set(x, "store_generic_responses", value.asInstanceOf[js.Any])
    
    inline def setStore_generic_responsesUndefined: Self = StObject.set(x, "store_generic_responses", js.undefined)
  }
}
