package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialNavigationStartedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
  
  /* unmapped type */
  var isNavigatingX: js.Any
  
  /* unmapped type */
  var isNavigatingY: js.Any
  
  /* unmapped type */
  var isNavigatingZ: js.Any
  
  /* unmapped type */
  var tryGetPointerPose: js.Any
}
object SpatialNavigationStartedEventArgs {
  
  @scala.inline
  def apply(
    interactionSourceKind: js.Any,
    isNavigatingX: js.Any,
    isNavigatingY: js.Any,
    isNavigatingZ: js.Any,
    tryGetPointerPose: js.Any
  ): SpatialNavigationStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], isNavigatingX = isNavigatingX.asInstanceOf[js.Any], isNavigatingY = isNavigatingY.asInstanceOf[js.Any], isNavigatingZ = isNavigatingZ.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationStartedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialNavigationStartedEventArgsMutableBuilder[Self <: SpatialNavigationStartedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNavigatingX(value: js.Any): Self = StObject.set(x, "isNavigatingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNavigatingY(value: js.Any): Self = StObject.set(x, "isNavigatingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNavigatingZ(value: js.Any): Self = StObject.set(x, "isNavigatingZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
