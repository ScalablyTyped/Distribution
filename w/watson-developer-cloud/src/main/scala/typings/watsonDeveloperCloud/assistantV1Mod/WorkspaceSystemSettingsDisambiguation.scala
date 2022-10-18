package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
trait WorkspaceSystemSettingsDisambiguation extends StObject {
  
  /** Whether the disambiguation feature is enabled for the workspace. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** The user-facing label for the option users can select if none of the suggested options is correct. If no value is specified for this property, this option does not appear. */
  var none_of_the_above_prompt: js.UndefOr[String] = js.undefined
  
  /** The text of the introductory prompt that accompanies disambiguation options presented to the user. */
  var prompt: js.UndefOr[String] = js.undefined
  
  /** The sensitivity of the disambiguation feature to intent detection conflicts. Set to **high** if you want the disambiguation feature to be triggered more often. This can be useful for testing or demonstration purposes. */
  var sensitivity: js.UndefOr[String] = js.undefined
}
object WorkspaceSystemSettingsDisambiguation {
  
  inline def apply(): WorkspaceSystemSettingsDisambiguation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettingsDisambiguation]
  }
  
  extension [Self <: WorkspaceSystemSettingsDisambiguation](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setNone_of_the_above_prompt(value: String): Self = StObject.set(x, "none_of_the_above_prompt", value.asInstanceOf[js.Any])
    
    inline def setNone_of_the_above_promptUndefined: Self = StObject.set(x, "none_of_the_above_prompt", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setSensitivity(value: String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
  }
}
