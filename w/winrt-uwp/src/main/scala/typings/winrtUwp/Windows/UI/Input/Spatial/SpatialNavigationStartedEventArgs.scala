package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialNavigationStartedEventArgs extends StObject {
  
  var interactionSourceKind: Any
  
  /* unmapped type */
  var isNavigatingX: Any
  
  /* unmapped type */
  var isNavigatingY: Any
  
  /* unmapped type */
  var isNavigatingZ: Any
  
  /* unmapped type */
  var tryGetPointerPose: Any
}
object SpatialNavigationStartedEventArgs {
  
  inline def apply(
    interactionSourceKind: Any,
    isNavigatingX: Any,
    isNavigatingY: Any,
    isNavigatingZ: Any,
    tryGetPointerPose: Any
  ): SpatialNavigationStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], isNavigatingX = isNavigatingX.asInstanceOf[js.Any], isNavigatingY = isNavigatingY.asInstanceOf[js.Any], isNavigatingZ = isNavigatingZ.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationStartedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialNavigationStartedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setIsNavigatingX(value: Any): Self = StObject.set(x, "isNavigatingX", value.asInstanceOf[js.Any])
    
    inline def setIsNavigatingY(value: Any): Self = StObject.set(x, "isNavigatingY", value.asInstanceOf[js.Any])
    
    inline def setIsNavigatingZ(value: Any): Self = StObject.set(x, "isNavigatingZ", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
