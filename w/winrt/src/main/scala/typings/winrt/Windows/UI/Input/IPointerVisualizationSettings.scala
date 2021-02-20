package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerVisualizationSettings extends StObject {
  
  var isBarrelButtonFeedbackEnabled: Boolean = js.native
  
  var isContactFeedbackEnabled: Boolean = js.native
}
object IPointerVisualizationSettings {
  
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): IPointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled.asInstanceOf[js.Any], isContactFeedbackEnabled = isContactFeedbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerVisualizationSettings]
  }
  
  @scala.inline
  implicit class IPointerVisualizationSettingsMutableBuilder[Self <: IPointerVisualizationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsBarrelButtonFeedbackEnabled(value: Boolean): Self = StObject.set(x, "isBarrelButtonFeedbackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContactFeedbackEnabled(value: Boolean): Self = StObject.set(x, "isContactFeedbackEnabled", value.asInstanceOf[js.Any])
  }
}
