package typings.styledDashComponents

import typings.react.reactMod.WeakValidationMap
import typings.std.Partial
import typings.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import typings.styledDashComponents.styledDashComponentsMod.StyledComponent
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentInnerAttrs
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentInnerComponent
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentInnerOtherProps
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentInterpolation
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, any>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
trait PickStyledComponentBaseanyanyanyanykeyofStyledComp extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var $$typeof: js.Symbol
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[_, _, _, _]]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[_, _, _, _]]] = js.undefined
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ]
}

object PickStyledComponentBaseanyanyanyanykeyofStyledComp {
  @scala.inline
  def apply(
    $$typeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ],
    defaultProps: Partial[StyledComponentProps[_, _, _, _]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, _]] = null
  ): PickStyledComponentBaseanyanyanyanykeyofStyledComp = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any], withComponent = js.Any.fromFunction1(withComponent))
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStyledComponentBaseanyanyanyanykeyofStyledComp]
  }
}

