package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionDetectedEventArgs extends StObject {
  
  var interaction: Any
  
  /* unmapped type */
  var interactionSourceKind: Any
  
  /* unmapped type */
  var tryGetPointerPose: Any
}
object SpatialInteractionDetectedEventArgs {
  
  inline def apply(interaction: Any, interactionSourceKind: Any, tryGetPointerPose: Any): SpatialInteractionDetectedEventArgs = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionDetectedEventArgs]
  }
  
  extension [Self <: SpatialInteractionDetectedEventArgs](x: Self) {
    
    inline def setInteraction(value: Any): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
