package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Global settings for the workspace. */
trait WorkspaceSystemSettings extends StObject {
  
  /** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
  var disambiguation: js.UndefOr[WorkspaceSystemSettingsDisambiguation] = js.undefined
  
  /** For internal use only. */
  var human_agent_assist: js.UndefOr[js.Object] = js.undefined
  
  /** Workspace settings related to the Watson Assistant tool. */
  var tooling: js.UndefOr[WorkspaceSystemSettingsTooling] = js.undefined
}
object WorkspaceSystemSettings {
  
  inline def apply(): WorkspaceSystemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceSystemSettings] (val x: Self) extends AnyVal {
    
    inline def setDisambiguation(value: WorkspaceSystemSettingsDisambiguation): Self = StObject.set(x, "disambiguation", value.asInstanceOf[js.Any])
    
    inline def setDisambiguationUndefined: Self = StObject.set(x, "disambiguation", js.undefined)
    
    inline def setHuman_agent_assist(value: js.Object): Self = StObject.set(x, "human_agent_assist", value.asInstanceOf[js.Any])
    
    inline def setHuman_agent_assistUndefined: Self = StObject.set(x, "human_agent_assist", js.undefined)
    
    inline def setTooling(value: WorkspaceSystemSettingsTooling): Self = StObject.set(x, "tooling", value.asInstanceOf[js.Any])
    
    inline def setToolingUndefined: Self = StObject.set(x, "tooling", js.undefined)
  }
}
