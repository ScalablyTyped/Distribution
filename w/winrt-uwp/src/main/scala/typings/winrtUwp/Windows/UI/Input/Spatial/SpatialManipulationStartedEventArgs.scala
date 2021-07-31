package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialManipulationStartedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any
  
  /* unmapped type */
  var tryGetPointerPose: js.Any
}
object SpatialManipulationStartedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetPointerPose: js.Any): SpatialManipulationStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationStartedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialManipulationStartedEventArgsMutableBuilder[Self <: SpatialManipulationStartedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
