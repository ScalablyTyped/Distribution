package typings.styledDashComponents.styledDashComponentsMod

import typings.react.reactMod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, any>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> | std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, never>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
trait StyledComponentInterpolation extends _InterpolationValue {
  @JSName("$$typeof")
  var $$typeof: js.UndefOr[js.Symbol] = js.undefined
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[_, _, _, _ | scala.Nothing]]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[_, _, _, _ | scala.Nothing]]] = js.undefined
  var withComponent: js.UndefOr[
    js.Function1[
      /* component */ AnyStyledComponent, 
      StyledComponent[
        StyledComponentInnerComponent[AnyStyledComponent], 
        _, 
        js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
        _ | scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
      ]
    ]
  ] = js.undefined
}

object StyledComponentInterpolation {
  @scala.inline
  def apply(
    $$typeof: js.Symbol = null,
    defaultProps: Partial[StyledComponentProps[_, _, _, _]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, _]] = null,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ] = null
  ): StyledComponentInterpolation = {
    val __obj = js.Dynamic.literal()
    if ($$typeof != null) __obj.updateDynamic("$$typeof")($$typeof)
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes)
    if (withComponent != null) __obj.updateDynamic("withComponent")(js.Any.fromFunction1(withComponent))
    __obj.asInstanceOf[StyledComponentInterpolation]
  }
}

