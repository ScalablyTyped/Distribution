package typings.uiBox

import typings.std.Exclude
import typings.std.Pick
import typings.uiBox.typesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitBoxPropsMod {
  
  @JSImport("ui-box/dist/src/utils/split-box-props", JSImport.Default)
  @js.native
  def default[P /* <: EnhancerProps */](props: P): SplitBoxProps[P] = js.native
  
  @js.native
  trait SplitBoxProps[P /* <: EnhancerProps */] extends StObject {
    
    var matchedProps: Pick[
        P, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
      ] = js.native
    
    var remainingProps: Pick[
        P, 
        Exclude[
          /* keyof P */ String, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
        ]
      ] = js.native
  }
  object SplitBoxProps {
    
    @scala.inline
    def apply[P /* <: EnhancerProps */](
      matchedProps: Pick[
          P, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
        ],
      remainingProps: Pick[
          P, 
          Exclude[
            /* keyof P */ String, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
          ]
        ]
    ): SplitBoxProps[P] = {
      val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitBoxProps[P]]
    }
    
    @scala.inline
    implicit class SplitBoxPropsMutableBuilder[Self <: SplitBoxProps[_], P /* <: EnhancerProps */] (val x: Self with SplitBoxProps[P]) extends AnyVal {
      
      @scala.inline
      def setMatchedProps(
        value: Pick[
              P, 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
            ]
      ): Self = StObject.set(x, "matchedProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainingProps(
        value: Pick[
              P, 
              Exclude[
                /* keyof P */ String, 
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "remainingProps", value.asInstanceOf[js.Any])
    }
  }
}
