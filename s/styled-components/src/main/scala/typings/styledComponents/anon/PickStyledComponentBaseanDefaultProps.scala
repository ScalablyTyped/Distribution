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

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, never>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
trait PickStyledComponentBaseanDefaultProps
  extends StObject
     with StyledComponentInterpolation {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol
  
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[js.Any, js.Any, js.Any, scala.Nothing]]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[js.Any, js.Any, js.Any, scala.Nothing]]] = js.undefined
  
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      js.Any, 
      js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ]
}
object PickStyledComponentBaseanDefaultProps {
  
  @scala.inline
  def apply(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      js.Any, 
      js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): PickStyledComponentBaseanDefaultProps = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStyledComponentBaseanDefaultProps]
  }
  
  @scala.inline
  implicit class PickStyledComponentBaseanDefaultPropsMutableBuilder[Self <: PickStyledComponentBaseanDefaultProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: Partial[StyledComponentProps[js.Any, js.Any, js.Any, scala.Nothing]]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDollarDollartypeof(value: js.Symbol): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypes(value: WeakValidationMap[StyledComponentProps[js.Any, js.Any, js.Any, scala.Nothing]]): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
    
    @scala.inline
    def setWithComponent(
      value: /* component */ AnyStyledComponent => StyledComponent[
          StyledComponentInnerComponent[AnyStyledComponent], 
          js.Any, 
          js.Any & StyledComponentInnerOtherProps[AnyStyledComponent], 
          scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
        ]
    ): Self = StObject.set(x, "withComponent", js.Any.fromFunction1(value))
  }
}
