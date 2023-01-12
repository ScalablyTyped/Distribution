package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSourceState extends StObject {
  
  var isPressed: Any
  
  /* unmapped type */
  var properties: Any
  
  /* unmapped type */
  var source: Any
  
  /* unmapped type */
  var timestamp: Any
  
  /* unmapped type */
  var tryGetPointerPose: Any
}
object SpatialInteractionSourceState {
  
  inline def apply(isPressed: Any, properties: Any, source: Any, timestamp: Any, tryGetPointerPose: Any): SpatialInteractionSourceState = {
    val __obj = js.Dynamic.literal(isPressed = isPressed.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialInteractionSourceState] (val x: Self) extends AnyVal {
    
    inline def setIsPressed(value: Any): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
