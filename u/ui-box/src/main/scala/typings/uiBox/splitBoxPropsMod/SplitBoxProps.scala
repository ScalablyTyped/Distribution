package typings.uiBox.splitBoxPropsMod

import typings.std.Exclude
import typings.std.Pick
import typings.uiBox.typesEnhancersMod.EnhancerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitBoxProps[P /* <: EnhancerProps */] extends js.Object {
  
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
  implicit class SplitBoxPropsOps[Self <: SplitBoxProps[_], P /* <: EnhancerProps */] (val x: Self with SplitBoxProps[P]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchedProps(
      value: Pick[
          P, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
        ]
    ): Self = this.set("matchedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingProps(
      value: Pick[
          P, 
          Exclude[
            /* keyof P */ String, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any
          ]
        ]
    ): Self = this.set("remainingProps", value.asInstanceOf[js.Any])
  }
}
