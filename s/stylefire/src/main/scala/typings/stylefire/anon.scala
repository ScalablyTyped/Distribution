package typings.stylefire

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AllowTransformNone extends StObject {
    
    var allowTransformNone: js.UndefOr[Boolean] = js.native
    
    var enableHardwareAcceleration: js.UndefOr[Boolean] = js.native
    
    var isDashCase: js.UndefOr[Boolean] = js.native
  }
  object AllowTransformNone {
    
    @scala.inline
    def apply(): AllowTransformNone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowTransformNone]
    }
    
    @scala.inline
    implicit class AllowTransformNoneMutableBuilder[Self <: AllowTransformNone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTransformNone(value: Boolean): Self = StObject.set(x, "allowTransformNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransformNoneUndefined: Self = StObject.set(x, "allowTransformNone", js.undefined)
      
      @scala.inline
      def setEnableHardwareAcceleration(value: Boolean): Self = StObject.set(x, "enableHardwareAcceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHardwareAccelerationUndefined: Self = StObject.set(x, "enableHardwareAcceleration", js.undefined)
      
      @scala.inline
      def setIsDashCase(value: Boolean): Self = StObject.set(x, "isDashCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDashCaseUndefined: Self = StObject.set(x, "isDashCase", js.undefined)
    }
  }
  
  @js.native
  trait Transform extends StObject {
    
    var transform: js.UndefOr[String] = js.native
    
    var transformOrigin: js.UndefOr[String] = js.native
  }
  object Transform {
    
    @scala.inline
    def apply(): Transform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
