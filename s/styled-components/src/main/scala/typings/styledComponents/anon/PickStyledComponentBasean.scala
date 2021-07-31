package typings.styledComponents.anon

import typings.react.mod.WeakValidationMap
import typings.std.Partial
import typings.styledComponents.styledComponentsMod.AnyStyledComponent
import typings.styledComponents.styledComponentsMod.StyledComponent
import typings.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typings.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typings.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typings.styledComponents.styledComponentsMod.StyledComponentInterpolation
import typings.styledComponents.styledComponentsMod.StyledComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, any>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
trait PickStyledComponentBasean
  extends StObject
     with StyledComponentInterpolation {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol
  
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[js.Any, js.Any, js.Any, js.Any]]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[js.Any, js.Any, js.Any, js.Any]]] = js.undefined
  
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      js.Any, 
      js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
      js.Any | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ]
}
object PickStyledComponentBasean {
  
  @scala.inline
  def apply(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      js.Any, 
      js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
      js.Any | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): PickStyledComponentBasean = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStyledComponentBasean]
  }
  
  @scala.inline
  implicit class PickStyledComponentBaseanMutableBuilder[Self <: PickStyledComponentBasean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: Partial[StyledComponentProps[js.Any, js.Any, js.Any, js.Any]]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDollarDollartypeof(value: js.Symbol): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypes(value: WeakValidationMap[StyledComponentProps[js.Any, js.Any, js.Any, js.Any]]): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
    
    @scala.inline
    def setWithComponent(
      value: /* component */ AnyStyledComponent => StyledComponent[
          StyledComponentInnerComponent[AnyStyledComponent], 
          js.Any, 
          js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
          js.Any | StyledComponentInnerAttrs[AnyStyledComponent]
        ]
    ): Self = StObject.set(x, "withComponent", js.Any.fromFunction1(value))
  }
}
