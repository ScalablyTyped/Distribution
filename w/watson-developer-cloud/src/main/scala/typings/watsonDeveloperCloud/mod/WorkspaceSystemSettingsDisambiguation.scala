package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
@js.native
trait WorkspaceSystemSettingsDisambiguation extends StObject {
  
  /** Whether the disambiguation feature is enabled for the workspace. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** The user-facing label for the option users can select if none of the suggested options is correct. If no value is specified for this property, this option does not appear. */
  var none_of_the_above_prompt: js.UndefOr[String] = js.native
  
  /** The text of the introductory prompt that accompanies disambiguation options presented to the user. */
  var prompt: js.UndefOr[String] = js.native
  
  /** The sensitivity of the disambiguation feature to intent detection conflicts. Set to **high** if you want the disambiguation feature to be triggered more often. This can be useful for testing or demonstration purposes. */
  var sensitivity: js.UndefOr[String] = js.native
}
object WorkspaceSystemSettingsDisambiguation {
  
  @scala.inline
  def apply(): WorkspaceSystemSettingsDisambiguation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettingsDisambiguation]
  }
  
  @scala.inline
  implicit class WorkspaceSystemSettingsDisambiguationMutableBuilder[Self <: WorkspaceSystemSettingsDisambiguation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setNone_of_the_above_prompt(value: String): Self = StObject.set(x, "none_of_the_above_prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone_of_the_above_promptUndefined: Self = StObject.set(x, "none_of_the_above_prompt", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setSensitivity(value: String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
  }
}
