package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _InterpolationValue
  extends StObject
     with _Interpolation[js.Any]
     with _SimpleInterpolation
object _InterpolationValue {
  
  inline def CSSObject(): typings.styledComponents.styledComponentsMod.CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.styledComponents.styledComponentsMod.CSSObject]
  }
  
  inline def Keyframes_(getName: () => String): typings.styledComponents.styledComponentsMod.Keyframes_ = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[typings.styledComponents.styledComponentsMod.Keyframes_]
  }
  
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
