package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerVisualizationSettings extends StObject {
  
  var isBarrelButtonFeedbackEnabled: Boolean
  
  var isContactFeedbackEnabled: Boolean
}
object IPointerVisualizationSettings {
  
  inline def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): IPointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled.asInstanceOf[js.Any], isContactFeedbackEnabled = isContactFeedbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerVisualizationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPointerVisualizationSettings] (val x: Self) extends AnyVal {
    
    inline def setIsBarrelButtonFeedbackEnabled(value: Boolean): Self = StObject.set(x, "isBarrelButtonFeedbackEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsContactFeedbackEnabled(value: Boolean): Self = StObject.set(x, "isContactFeedbackEnabled", value.asInstanceOf[js.Any])
  }
}
