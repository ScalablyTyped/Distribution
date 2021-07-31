package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSourceState extends StObject {
  
  var isPressed: js.Any
  
  /* unmapped type */
  var properties: js.Any
  
  /* unmapped type */
  var source: js.Any
  
  /* unmapped type */
  var timestamp: js.Any
  
  /* unmapped type */
  var tryGetPointerPose: js.Any
}
object SpatialInteractionSourceState {
  
  @scala.inline
  def apply(
    isPressed: js.Any,
    properties: js.Any,
    source: js.Any,
    timestamp: js.Any,
    tryGetPointerPose: js.Any
  ): SpatialInteractionSourceState = {
    val __obj = js.Dynamic.literal(isPressed = isPressed.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceState]
  }
  
  @scala.inline
  implicit class SpatialInteractionSourceStateMutableBuilder[Self <: SpatialInteractionSourceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPressed(value: js.Any): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
