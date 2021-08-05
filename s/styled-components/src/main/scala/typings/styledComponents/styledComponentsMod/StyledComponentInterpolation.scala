package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
/* Rewritten from type alias, can be one of: 
  - typings.styledComponents.anon.PickStyledComponentBasean
  - typings.styledComponents.anon.PickStyledComponentBaseanDefaultProps
*/
trait StyledComponentInterpolation
  extends StObject
     with _InterpolationValue
object StyledComponentInterpolation {
  
  inline def PickStyledComponentBasean(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      js.Any, 
      js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
      js.Any | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): typings.styledComponents.anon.PickStyledComponentBasean = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.styledComponents.anon.PickStyledComponentBasean]
  }
  
  inline def PickStyledComponentBaseanDefaultProps(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      js.Any, 
      js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): typings.styledComponents.anon.PickStyledComponentBaseanDefaultProps = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.styledComponents.anon.PickStyledComponentBaseanDefaultProps]
  }
}
