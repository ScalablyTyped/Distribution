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
  
  inline def default(rawProps: EnhancerProps & ComponentPropsWithoutRef[js.Any]): EnhancedPropsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawProps.asInstanceOf[js.Any]).asInstanceOf[EnhancedPropsResult]
  
  trait EnhancedPropsResult extends StObject {
    
    var className: String
    
    var enhancedProps: PreservedProps
  }
  object EnhancedPropsResult {
    
    inline def apply(className: String, enhancedProps: PreservedProps): EnhancedPropsResult = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], enhancedProps = enhancedProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedPropsResult]
    }
    
    extension [Self <: EnhancedPropsResult](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setEnhancedProps(value: PreservedProps): Self = StObject.set(x, "enhancedProps", value.asInstanceOf[js.Any])
    }
  }
  
  type PreservedProps = Without[
    ComponentProps[js.Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
  ]
}
