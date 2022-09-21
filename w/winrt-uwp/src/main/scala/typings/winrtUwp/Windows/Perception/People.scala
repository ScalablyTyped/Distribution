package typings.winrtUwp.Windows.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object People {
  
  trait HeadPose extends StObject {
    
    var forwardDirection: Any
    
    /* unmapped type */
    var position: Any
    
    /* unmapped type */
    var upDirection: Any
  }
  object HeadPose {
    
    inline def apply(forwardDirection: Any, position: Any, upDirection: Any): HeadPose = {
      val __obj = js.Dynamic.literal(forwardDirection = forwardDirection.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], upDirection = upDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadPose]
    }
    
    extension [Self <: HeadPose](x: Self) {
      
      inline def setForwardDirection(value: Any): Self = StObject.set(x, "forwardDirection", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setUpDirection(value: Any): Self = StObject.set(x, "upDirection", value.asInstanceOf[js.Any])
    }
  }
}
