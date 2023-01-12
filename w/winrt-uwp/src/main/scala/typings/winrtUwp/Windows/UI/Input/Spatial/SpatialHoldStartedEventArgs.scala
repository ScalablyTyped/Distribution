package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialHoldStartedEventArgs extends StObject {
  
  var interactionSourceKind: Any
  
  /* unmapped type */
  var tryGetPointerPose: Any
}
object SpatialHoldStartedEventArgs {
  
  inline def apply(interactionSourceKind: Any, tryGetPointerPose: Any): SpatialHoldStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldStartedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialHoldStartedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
