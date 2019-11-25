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

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, never>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
trait PickStyledComponentBaseanyanyanyneverkeyofStyledCo extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var $$typeof: js.Symbol
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[_, _, _, scala.Nothing]]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]]] = js.undefined
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ]
}

object PickStyledComponentBaseanyanyanyneverkeyofStyledCo {
  @scala.inline
  def apply(
    $$typeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ],
    defaultProps: Partial[StyledComponentProps[_, _, _, scala.Nothing]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]] = null
  ): PickStyledComponentBaseanyanyanyneverkeyofStyledCo = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any], withComponent = js.Any.fromFunction1(withComponent))
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStyledComponentBaseanyanyanyneverkeyofStyledCo]
  }
}

