package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsMod {
  type AnyStyledComponent = (StyledComponent[js.Any, js.Any, js.Any, js.Any]) | (StyledComponent[js.Any, js.Any, js.Any, scala.Nothing])
  type BaseThemeProviderComponent[T /* <: js.Object */] = reactLib.reactMod.ReactNs.ComponentClass[ThemeProviderProps[T], reactLib.reactMod.ReactNs.ComponentState]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[js.Any], 
    reactLib.reactMod.ReactNs.ForwardRefExoticComponent[
      styledDashComponentsLib.WithOptionalTheme[
        reactLib.reactMod.ReactNs.ComponentPropsWithRef[reactLib.reactMod.ReactNs.ComponentType[js.Any]], 
        T
      ]
    ]
  ]
  type CSSObject = csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]
  type FalseyValue = js.UndefOr[scala.Null | styledDashComponentsLib.styledDashComponentsLibNumbers.`false`]
  type FlattenInterpolation[P] = InterpolationValue | InterpolationFunction[P]
  type GlobalStyleComponent[P, T] = reactLib.reactMod.ReactNs.ComponentClass[
    ThemedGlobalStyledClassProps[ThemedGlobalStyledClassProps[P, T], T], 
    reactLib.reactMod.ReactNs.ComponentState
  ]
  type Interpolation[P] = FlattenInterpolation[P] | (js.Array[FlattenInterpolation[P] | js.Array[FlattenInterpolation[P]]])
  type InterpolationFunction[P] = js.Function1[/* props */ P, InterpolationValue]
  type InterpolationValue = java.lang.String | scala.Double | Styles | FalseyValue | Keyframes | styledDashComponentsLib.StyledComponentInterpolation | CSSObject
  type SimpleInterpolation = InterpolationValue | (js.Array[InterpolationValue | js.Array[InterpolationValue]])
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: java.lang.String */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: java.lang.String */] = styledDashComponentsLib.WithOptionalTheme[
    (styledDashComponentsLib.Omit[reactLib.reactMod.ReactNs.ComponentPropsWithRef[C] with O, A]) with (stdLib.Partial[stdLib.Pick[reactLib.reactMod.ReactNs.ComponentPropsWithRef[C] with O, A]]), 
    T
  ]
  type StyledFunction[C /* <: java.lang.String */] = ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledInterface = ThemedStyledInterface[DefaultTheme]
  type StyledProps[P] = ThemedStyledProps[P, js.Any]
  type ThemeProviderComponent[T /* <: js.Object */] = BaseThemeProviderComponent[T]
  type ThemedCssFunction[T /* <: js.Object */] = BaseThemedCssFunction[T]
  type ThemedGlobalStyledClassProps[P, T] = P with styledDashComponentsLib.Anon_SuppressMultiMountWarning[T]
  type ThemedStyledInterface[T /* <: js.Object */] = ThemedBaseStyledInterface[T]
  type ThemedStyledProps[P, T] = P with ThemeProps[T]
  type WithThemeFnInterface[T /* <: js.Object */] = BaseWithThemeFnInterface[T]
}
