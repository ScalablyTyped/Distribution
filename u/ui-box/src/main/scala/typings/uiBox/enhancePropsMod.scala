package typings.uiBox

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentPropsWithoutRef
import typings.uiBox.boxTypesMod.Without
import typings.uiBox.typesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enhancePropsMod {
  
  @JSImport("ui-box/dist/src/enhance-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(rawProps: EnhancerProps & ComponentPropsWithoutRef[js.Any]): EnhancedPropsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawProps.asInstanceOf[js.Any]).asInstanceOf[EnhancedPropsResult]
  
  trait EnhancedPropsResult extends StObject {
    
    var className: String
    
    var enhancedProps: PreservedProps
  }
  object EnhancedPropsResult {
    
    @scala.inline
    def apply(className: String, enhancedProps: PreservedProps): EnhancedPropsResult = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], enhancedProps = enhancedProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedPropsResult]
    }
    
    @scala.inline
    implicit class EnhancedPropsResultMutableBuilder[Self <: EnhancedPropsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedProps(value: PreservedProps): Self = StObject.set(x, "enhancedProps", value.asInstanceOf[js.Any])
    }
  }
  
  type PreservedProps = Without[
    ComponentProps[js.Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
  ]
}
