package typings.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
/* Rewritten from type alias, can be one of: 
  - typings.styledComponents.anon.PickStyledComponentBasean
  - typings.styledComponents.anon.PickStyledComponentBaseanDefaultProps
*/
trait StyledComponentInterpolation extends _InterpolationValue

object StyledComponentInterpolation {
  @scala.inline
  def PickStyledComponentBasean(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): StyledComponentInterpolation = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentInterpolation]
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
  ): StyledComponentInterpolation = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentInterpolation]
  }
}

