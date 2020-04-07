package typings.styledComponents

import typings.react.mod.WeakValidationMap
import typings.std.Partial
import typings.styledComponents.styledComponentsMod.AnyStyledComponent
import typings.styledComponents.styledComponentsMod.StyledComponent
import typings.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typings.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typings.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typings.styledComponents.styledComponentsMod.StyledComponentInterpolation
import typings.styledComponents.styledComponentsMod.StyledComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, any>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
trait PickStyledComponentBasean extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol
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

object PickStyledComponentBasean {
  @scala.inline
  def apply(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ],
    defaultProps: Partial[StyledComponentProps[_, _, _, _]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, _]] = null
  ): PickStyledComponentBasean = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStyledComponentBasean]
  }
}

