package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type AnyStyledComponent = StyledComponent[js.Any, js.Any, js.Any, js.Any | scala.Nothing]
  type Attrs[P, A /* <: stdLib.Partial[P] */, T] = (js.Function1[/* props */ ThemedStyledProps[P, T], A]) | A
  type BaseThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = reactLib.reactMod.ComponentClass[ThemeProviderProps[T, U], reactLib.reactMod.ComponentState]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[js.Any], 
    reactLib.reactMod.ForwardRefExoticComponent[styledDashComponentsLib.WithOptionalThemeComponentPropsWithRefCT[T]]
  ]
  type CSSKeyframes = js.Object with org.scalablytyped.runtime.StringDictionary[CSSObject]
  type CSSObject = (csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]) with styledDashComponentsLib.styledDashComponentsLibStrings.CSSObject with js.Any
  type CSSProp[T] = java.lang.String | CSSObject | FlattenInterpolation[ThemeProps[T]]
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]) with (stdLib.Partial[stdLib.Pick[P, stdLib.Extract[java.lang.String, java.lang.String]]]) with (stdLib.Partial[stdLib.Pick[D, stdLib.Exclude[java.lang.String, java.lang.String]]])) | P
  type DeprecatedAttrs[P, A /* <: stdLib.Partial[P] */, T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof A ]: (props : styled-components.styled-components.ThemedStyledProps<P, T>): A[K] | A[K]}
    */ styledDashComponentsLib.styledDashComponentsLibStrings.DeprecatedAttrs with js.Any
  type FalseyValue = js.UndefOr[scala.Null | styledDashComponentsLib.styledDashComponentsLibNumbers.`false`]
  type GlobalStyleComponent[P, T] = reactLib.reactMod.ComponentClass[ThemedGlobalStyledClassProps[P, T], reactLib.reactMod.ComponentState]
  /* Rewritten from type alias, can be one of: 
    - InterpolationValue
    - FlattenInterpolation[P]
    - InterpolationFunction[P]
  */
  type Interpolation[P] = _Interpolation[P] | java.lang.String | scala.Double | FalseyValue | CSSObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - FalseyValue
    - Keyframes
    - StyledComponentInterpolation
    - CSSObject
  */
  type InterpolationValue = _InterpolationValue | java.lang.String | scala.Double | FalseyValue | CSSObject
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (Defaultize[P, js.Any])
  /* Rewritten from type alias, can be one of: 
    - InterpolationValue
    - FlattenSimpleInterpolation
  */
  type SimpleInterpolation = _SimpleInterpolation | java.lang.String | scala.Double | FalseyValue | CSSObject
  type StyledComponent[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (// the "string" allows this to be used as an object key
  // I really want to avoid this if possible but it's the only way to use nesting with object styles...
  java.lang.String) with (StyledComponentBase[C, T, O, A])
  type StyledComponentInnerAttrs[C /* <: AnyStyledComponent */] = js.Any
  type StyledComponentInnerComponent[C /* <: reactLib.reactMod.ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: AnyStyledComponent */] = js.Any
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: java.lang.String */] = (WithOptionalTheme[
    (styledDashComponentsLib.Omit[(ReactDefaultizedProps[C, reactLib.reactMod.ComponentPropsWithRef[C]]) with O, A]) with (stdLib.Partial[stdLib.Pick[reactLib.reactMod.ComponentPropsWithRef[C] with O, A]]), 
    T
  ]) with WithChildrenIfReactComponentClass[C]
  type StyledComponentPropsWithAs[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (StyledComponentProps[C, T, O, A]) with styledDashComponentsLib.Anon_As[C]
  type StyledComponentPropsWithRef[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */] = reactLib.reactMod.ComponentPropsWithRef[C | StyledComponentInnerComponent[C]]
  type StyledFunction[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */] = ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledProps[P] = ThemedStyledProps[P, AnyIfEmpty[DefaultTheme]]
  type ThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = BaseThemeProviderComponent[AnyIfEmpty[T], AnyIfEmpty[U]]
  type ThemedCssFunction[T /* <: js.Object */] = BaseThemedCssFunction[AnyIfEmpty[T]]
  type ThemedGlobalStyledClassProps[P, T] = (WithOptionalTheme[P, T]) with styledDashComponentsLib.Anon_SuppressMultiMountWarning
  type ThemedStyledInterface[T /* <: js.Object */] = ThemedBaseStyledInterface[AnyIfEmpty[T]]
  type ThemedStyledProps[P, T] = P with ThemeProps[T]
  // Because of React typing quirks, when getting props from a React.ComponentClass,
  // we need to manually add a `children` field.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
  // and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
  type WithChildrenIfReactComponentClass[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */] = js.Object | styledDashComponentsLib.Anon_Children
  type WithOptionalTheme[P /* <: styledDashComponentsLib.Anon_ThemeT[T] */, T] = P with styledDashComponentsLib.Anon_ThemeT[T]
  type WithThemeFnInterface[T /* <: js.Object */] = BaseWithThemeFnInterface[AnyIfEmpty[T]]
}
