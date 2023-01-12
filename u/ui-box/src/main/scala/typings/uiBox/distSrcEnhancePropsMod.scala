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
  
  inline def default(props: EnhancerProps & ComponentPropsWithoutRef[Any]): EnhancePropsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[EnhancePropsResult]
  inline def default(props: EnhancerProps & ComponentPropsWithoutRef[Any], selectorHead: String): EnhancePropsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], selectorHead.asInstanceOf[js.Any])).asInstanceOf[EnhancePropsResult]
  inline def default(props: EnhancerProps & ComponentPropsWithoutRef[Any], selectorHead: String, parentProperty: String): EnhancePropsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], selectorHead.asInstanceOf[js.Any], parentProperty.asInstanceOf[js.Any])).asInstanceOf[EnhancePropsResult]
  inline def default(props: EnhancerProps & ComponentPropsWithoutRef[Any], selectorHead: Unit, parentProperty: String): EnhancePropsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], selectorHead.asInstanceOf[js.Any], parentProperty.asInstanceOf[js.Any])).asInstanceOf[EnhancePropsResult]
  
  trait EnhancePropsResult extends StObject {
    
    var className: String
    
    var enhancedProps: PreservedProps
  }
  object EnhancePropsResult {
    
    inline def apply(className: String, enhancedProps: PreservedProps): EnhancePropsResult = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], enhancedProps = enhancedProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancePropsResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnhancePropsResult] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setEnhancedProps(value: PreservedProps): Self = StObject.set(x, "enhancedProps", value.asInstanceOf[js.Any])
    }
  }
  
  type PreservedProps = Without[
    ComponentProps[Any], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
  ]
}
