package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialTappedEventArgs extends StObject {
  
  var interactionSourceKind: Any
  
  /* unmapped type */
  var tapCount: Any
  
  /* unmapped type */
  var tryGetPointerPose: Any
}
object SpatialTappedEventArgs {
  
  inline def apply(interactionSourceKind: Any, tapCount: Any, tryGetPointerPose: Any): SpatialTappedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialTappedEventArgs]
  }
  
  extension [Self <: SpatialTappedEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTapCount(value: Any): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
