package typings.stylefire

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowTransformNone extends StObject {
    
    var allowTransformNone: js.UndefOr[Boolean] = js.undefined
    
    var enableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
    
    var isDashCase: js.UndefOr[Boolean] = js.undefined
  }
  object AllowTransformNone {
    
    inline def apply(): AllowTransformNone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowTransformNone]
    }
    
    extension [Self <: AllowTransformNone](x: Self) {
      
      inline def setAllowTransformNone(value: Boolean): Self = StObject.set(x, "allowTransformNone", value.asInstanceOf[js.Any])
      
      inline def setAllowTransformNoneUndefined: Self = StObject.set(x, "allowTransformNone", js.undefined)
      
      inline def setEnableHardwareAcceleration(value: Boolean): Self = StObject.set(x, "enableHardwareAcceleration", value.asInstanceOf[js.Any])
      
      inline def setEnableHardwareAccelerationUndefined: Self = StObject.set(x, "enableHardwareAcceleration", js.undefined)
      
      inline def setIsDashCase(value: Boolean): Self = StObject.set(x, "isDashCase", value.asInstanceOf[js.Any])
      
      inline def setIsDashCaseUndefined: Self = StObject.set(x, "isDashCase", js.undefined)
    }
  }
  
  trait Transform extends StObject {
    
    var transform: js.UndefOr[String] = js.undefined
    
    var transformOrigin: js.UndefOr[String] = js.undefined
  }
  object Transform {
    
    inline def apply(): Transform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transform]
    }
    
    extension [Self <: Transform](x: Self) {
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
