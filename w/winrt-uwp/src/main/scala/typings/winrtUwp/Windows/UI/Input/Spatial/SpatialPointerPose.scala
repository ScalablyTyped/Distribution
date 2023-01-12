package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialPointerPose extends StObject {
  
  /* unmapped type */
  var head: Any
  
  /* unmapped type */
  var timestamp: Any
}
object SpatialPointerPose {
  
  inline def apply(head: Any, timestamp: Any): SpatialPointerPose = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialPointerPose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialPointerPose] (val x: Self) extends AnyVal {
    
    inline def setHead(value: Any): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
