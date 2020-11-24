package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteractionDetectedEventArgs extends js.Object {
  
  var interaction: js.Any = js.native
  
   /* unmapped type */ var interactionSourceKind: js.Any = js.native
  
   /* unmapped type */ var tryGetPointerPose: js.Any = js.native
}
object SpatialInteractionDetectedEventArgs {
  
  @scala.inline
  def apply(interaction: js.Any, interactionSourceKind: js.Any, tryGetPointerPose: js.Any): SpatialInteractionDetectedEventArgs = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionDetectedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialInteractionDetectedEventArgsOps[Self <: SpatialInteractionDetectedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setInteraction(value: js.Any): Self = this.set("interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = this.set("interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = this.set("tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
