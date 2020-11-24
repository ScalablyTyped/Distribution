package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerVisualizationSettings extends js.Object {
  
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
  implicit class IPointerVisualizationSettingsOps[Self <: IPointerVisualizationSettings] (val x: Self) extends AnyVal {
    
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
    def setIsBarrelButtonFeedbackEnabled(value: Boolean): Self = this.set("isBarrelButtonFeedbackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContactFeedbackEnabled(value: Boolean): Self = this.set("isContactFeedbackEnabled", value.asInstanceOf[js.Any])
  }
}
