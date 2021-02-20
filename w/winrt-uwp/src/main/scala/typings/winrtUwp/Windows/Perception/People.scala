package typings.winrtUwp.Windows.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object People {
  
  @js.native
  trait HeadPose extends StObject {
    
    var forwardDirection: js.Any = js.native
    
    /* unmapped type */
    var position: js.Any = js.native
    
    /* unmapped type */
    var upDirection: js.Any = js.native
  }
  object HeadPose {
    
    @scala.inline
    def apply(forwardDirection: js.Any, position: js.Any, upDirection: js.Any): HeadPose = {
      val __obj = js.Dynamic.literal(forwardDirection = forwardDirection.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], upDirection = upDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadPose]
    }
    
    @scala.inline
    implicit class HeadPoseMutableBuilder[Self <: HeadPose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardDirection(value: js.Any): Self = StObject.set(x, "forwardDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpDirection(value: js.Any): Self = StObject.set(x, "upDirection", value.asInstanceOf[js.Any])
    }
  }
}
