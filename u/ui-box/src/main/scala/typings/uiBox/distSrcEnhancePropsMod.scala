package typings.uiBox

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentPropsWithoutRef
import typings.uiBox.distSrcTypesBoxTypesMod.Without
import typings.uiBox.distSrcTypesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnhancePropsMod {
  
  @JSImport("ui-box/dist/src/enhance-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: EnhancerProps & ComponentPropsWithoutRef[Any]): EnhancedPropsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[EnhancedPropsResult]
  inline def default(props: EnhancerProps & ComponentPropsWithoutRef[Any], selectorHead: String): EnhancedPropsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], selectorHead.asInstanceOf[js.Any])).asInstanceOf[EnhancedPropsResult]
  
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
    ComponentProps[Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 144, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
  ]
}
