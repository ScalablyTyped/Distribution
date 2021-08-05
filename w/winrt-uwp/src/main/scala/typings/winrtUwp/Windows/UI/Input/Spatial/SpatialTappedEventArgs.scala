package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialTappedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
  
  /* unmapped type */
  var tapCount: js.Any
  
  /* unmapped type */
  var tryGetPointerPose: js.Any
}
object SpatialTappedEventArgs {
  
  inline def apply(interactionSourceKind: js.Any, tapCount: js.Any, tryGetPointerPose: js.Any): SpatialTappedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialTappedEventArgs]
  }
  
  extension [Self <: SpatialTappedEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTapCount(value: js.Any): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
