package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialRecognitionStartedEventArgs extends StObject {
  
  var interactionSourceKind: js.Any = js.native
  
  /* unmapped type */
  var isGesturePossible: js.Any = js.native
  
  /* unmapped type */
  var tryGetPointerPose: js.Any = js.native
}
object SpatialRecognitionStartedEventArgs {
  
  @scala.inline
  def apply(interactionSourceKind: js.Any, isGesturePossible: js.Any, tryGetPointerPose: js.Any): SpatialRecognitionStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], isGesturePossible = isGesturePossible.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialRecognitionStartedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialRecognitionStartedEventArgsMutableBuilder[Self <: SpatialRecognitionStartedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGesturePossible(value: js.Any): Self = StObject.set(x, "isGesturePossible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
