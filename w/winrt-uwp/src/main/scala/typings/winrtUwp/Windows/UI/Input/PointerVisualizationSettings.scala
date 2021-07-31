package typings.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the visual feedback settings for pointer input. */
trait PointerVisualizationSettings extends StObject {
  
  /** Gets or sets a value that indicates whether visual feedback is enabled for pen/stylus input when the barrel button is pressed. */
  var isBarrelButtonFeedbackEnabled: Boolean
  
  /** Gets or sets a value that indicates whether visual feedback is enabled when a pointer contact is detected. */
  var isContactFeedbackEnabled: Boolean
}
object PointerVisualizationSettings {
  
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): PointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled.asInstanceOf[js.Any], isContactFeedbackEnabled = isContactFeedbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerVisualizationSettings]
  }
  
  @scala.inline
  implicit class PointerVisualizationSettingsMutableBuilder[Self <: PointerVisualizationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsBarrelButtonFeedbackEnabled(value: Boolean): Self = StObject.set(x, "isBarrelButtonFeedbackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContactFeedbackEnabled(value: Boolean): Self = StObject.set(x, "isContactFeedbackEnabled", value.asInstanceOf[js.Any])
  }
}
