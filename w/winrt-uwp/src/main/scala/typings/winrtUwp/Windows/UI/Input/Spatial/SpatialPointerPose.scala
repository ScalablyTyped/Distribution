package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialPointerPose extends StObject {
  
  /* unmapped type */
  var head: js.Any
  
  /* unmapped type */
  var timestamp: js.Any
}
object SpatialPointerPose {
  
  inline def apply(head: js.Any, timestamp: js.Any): SpatialPointerPose = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialPointerPose]
  }
  
  extension [Self <: SpatialPointerPose](x: Self) {
    
    inline def setHead(value: js.Any): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
