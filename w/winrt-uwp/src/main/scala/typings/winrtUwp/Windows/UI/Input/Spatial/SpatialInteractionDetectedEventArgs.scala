package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionDetectedEventArgs extends StObject {
  
  var interaction: js.Any
  
  /* unmapped type */
  var interactionSourceKind: js.Any
  
  /* unmapped type */
  var tryGetPointerPose: js.Any
}
object SpatialInteractionDetectedEventArgs {
  
  @scala.inline
  def apply(interaction: js.Any, interactionSourceKind: js.Any, tryGetPointerPose: js.Any): SpatialInteractionDetectedEventArgs = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionDetectedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialInteractionDetectedEventArgsMutableBuilder[Self <: SpatialInteractionDetectedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteraction(value: js.Any): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
