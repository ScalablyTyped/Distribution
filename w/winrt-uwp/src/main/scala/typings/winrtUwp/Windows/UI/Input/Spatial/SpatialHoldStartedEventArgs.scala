package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialHoldStartedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
  
  /* unmapped type */
  var tryGetPointerPose: js.Any
}
object SpatialHoldStartedEventArgs {
  
  inline def apply(interactionSourceKind: js.Any, tryGetPointerPose: js.Any): SpatialHoldStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldStartedEventArgs]
  }
  
  extension [Self <: SpatialHoldStartedEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
