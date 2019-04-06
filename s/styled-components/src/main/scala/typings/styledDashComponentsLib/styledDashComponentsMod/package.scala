package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsMod {
  type AnyStyledComponent = (StyledComponent[js.Any, js.Any, js.Any, js.Any]) | (StyledComponent[js.Any, js.Any, js.Any, scala.Nothing])
  type BaseThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = reactLib.reactMod.ReactNs.ComponentClass[ThemeProviderProps[T, U], reactLib.reactMod.ReactNs.ComponentState]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[js.Any], 
    reactLib.reactMod.ReactNs.ForwardRefExoticComponent[
      styledDashComponentsLib.WithOptionalTheme[
        reactLib.reactMod.ReactNs.ComponentPropsWithRef[reactLib.reactMod.ReactNs.ComponentType[js.Any]], 
        T
      ]
    ]
  ]
  type CSSKeyframes = js.Object with org.scalablytyped.runtime.StringDictionary[CSSObject]
  type CSSObject = (csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]) with styledDashComponentsLib.styledDashComponentsLibStrings.CSSObject with js.Any
  type CSSProp[T] = java.lang.String | FlattenInterpolation[ThemeProps[T]]
  type FalseyValue = js.UndefOr[scala.Null | styledDashComponentsLib.styledDashComponentsLibNumbers.`false`]
  type GlobalStyleComponent[P, T] = reactLib.reactMod.ReactNs.ComponentClass[ThemedGlobalStyledClassProps[P, T], reactLib.reactMod.ReactNs.ComponentState]
  /* Rewritten from type alias, can be one of: 
    - InterpolationValue
    - FlattenInterpolation[P]
    - InterpolationFunction[P]
  */
  type Interpolation[P] = _Interpolation[P] | InterpolationValue
  type InterpolationValue = java.lang.String | scala.Double | FalseyValue | Keyframes | styledDashComponentsLib.StyledComponentInterpolation | CSSObject
  type SimpleInterpolation = InterpolationValue | FlattenSimpleInterpolation
  type StyledComponent[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (// the "string" allows this to be used as an object key
  // I really want to avoid this if possible but it's the only way to use nesting with object styles...
  java.lang.String) with (StyledComponentBase[C, T, O, A])
  type StyledComponentInnerAttrs[C /* <: AnyStyledComponent */] = js.Any
  type StyledComponentInnerComponent[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: AnyStyledComponent */] = js.Any
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: java.lang.String */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: java.lang.String */] = (styledDashComponentsLib.WithOptionalTheme[
    (styledDashComponentsLib.Omit[
      (styledDashComponentsLib.ReactDefaultizedProps[C, reactLib.reactMod.ReactNs.ComponentPropsWithRef[C]]) with O, 
      A
    ]) with (stdLib.Partial[stdLib.Pick[reactLib.reactMod.ReactNs.ComponentPropsWithRef[C] with O, A]]), 
    T
  ]) with styledDashComponentsLib.WithChildrenIfReactComponentClass[C]
  type StyledComponentPropsWithRef[C /* <: java.lang.String */] = reactLib.reactMod.ReactNs.ComponentPropsWithRef[C] | reactLib.reactMod.ReactNs.ComponentPropsWithRef[StyledComponentInnerComponent[C]]
  type StyledFunction[C /* <: java.lang.String */] = ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledInterface = ThemedStyledInterface[DefaultTheme]
  type StyledProps[P] = ThemedStyledProps[P, styledDashComponentsLib.AnyIfEmpty[DefaultTheme]]
  type ThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = BaseThemeProviderComponent[styledDashComponentsLib.AnyIfEmpty[T], styledDashComponentsLib.AnyIfEmpty[U]]
  type ThemedCssFunction[T /* <: js.Object */] = BaseThemedCssFunction[styledDashComponentsLib.AnyIfEmpty[T]]
  type ThemedGlobalStyledClassProps[P, T] = (styledDashComponentsLib.WithOptionalTheme[P, T]) with styledDashComponentsLib.Anon_SuppressMultiMountWarning
  type ThemedStyledInterface[T /* <: js.Object */] = ThemedBaseStyledInterface[styledDashComponentsLib.AnyIfEmpty[T]]
  type ThemedStyledProps[P, T] = P with ThemeProps[T]
  type WithThemeFnInterface[T /* <: js.Object */] = BaseWithThemeFnInterface[styledDashComponentsLib.AnyIfEmpty[T]]
}
