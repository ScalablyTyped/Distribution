package typings.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _InterpolationValue
  extends _Interpolation[js.Any]
     with _SimpleInterpolation

object _InterpolationValue {
  @scala.inline
  def Keyframes_(getName: () => String): _InterpolationValue = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[_InterpolationValue]
  }
  @scala.inline
  def CSSObject(): _InterpolationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_InterpolationValue]
  }
  @scala.inline
  def PickStyledComponentBasean(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): _InterpolationValue = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InterpolationValue]
  }
  @scala.inline
  def PickStyledComponentBaseanDefaultProps(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): _InterpolationValue = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InterpolationValue]
  }
}

