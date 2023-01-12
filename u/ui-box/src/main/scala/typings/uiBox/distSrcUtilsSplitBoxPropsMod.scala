package typings.uiBox

import typings.std.Exclude
import typings.std.Pick
import typings.uiBox.distSrcTypesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSplitBoxPropsMod {
  
  @JSImport("ui-box/dist/src/utils/split-box-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: EnhancerProps */](props: P): SplitBoxProps[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[SplitBoxProps[P]]
  
  trait SplitBoxProps[P /* <: EnhancerProps */] extends StObject {
    
    var matchedProps: Pick[
        P, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
      ]
    
    var remainingProps: Pick[
        P, 
        Exclude[
          /* keyof P */ String, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
        ]
      ]
  }
  object SplitBoxProps {
    
    inline def apply[P /* <: EnhancerProps */](
      matchedProps: Pick[
          P, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
        ],
      remainingProps: Pick[
          P, 
          Exclude[
            /* keyof P */ String, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
          ]
        ]
    ): SplitBoxProps[P] = {
      val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitBoxProps[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitBoxProps[?], P /* <: EnhancerProps */] (val x: Self & SplitBoxProps[P]) extends AnyVal {
      
      inline def setMatchedProps(
        value: Pick[
              P, 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
            ]
      ): Self = StObject.set(x, "matchedProps", value.asInstanceOf[js.Any])
      
      inline def setRemainingProps(
        value: Pick[
              P, 
              Exclude[
                /* keyof P */ String, 
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
              ]
            ]
      ): Self = StObject.set(x, "remainingProps", value.asInstanceOf[js.Any])
    }
  }
}
