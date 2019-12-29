package typings.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.csstype.csstypeMod.Properties
  import typings.hoistDashNonDashReactDashStatics.hoistDashNonDashReactDashStaticsMod.NonReactStatics
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentPropsWithRef
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ForwardRefExoticComponent
  import typings.std.Exclude
  import typings.std.Extract
  import typings.std.Partial
  import typings.std.Pick
  import typings.styledDashComponents.Anon_As
  import typings.styledDashComponents.Anon_Children
  import typings.styledDashComponents.Anon_SuppressMultiMountWarning
  import typings.styledDashComponents.Anon_ThemeT
  import typings.styledDashComponents.WithOptionalThemeComponentPropsWithRefCT
  import typings.styledDashComponents.styledDashComponentsBooleans.`false`

  type AnyIfEmpty[T /* <: js.Object */] = T
  type AnyStyledComponent = StyledComponent[js.Any, js.Any, js.Any, js.Any | scala.Nothing]
  type Attrs[P, A /* <: Partial[P] */, T] = (js.Function1[/* props */ ThemedStyledProps[P, T], A]) | A
  type BaseThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = ComponentClass[ThemeProviderProps[T, U], ComponentState]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ ComponentType[js.Any], 
    ForwardRefExoticComponent[WithOptionalThemeComponentPropsWithRefCT[T]]
  ]
  type CSSKeyframes = js.Object with StringDictionary[CSSObject]
  type CSSProp[T] = String | CSSObject | FlattenInterpolation[ThemeProps[T]]
  type CSSProperties = Properties[String | Double]
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((Pick[P, Exclude[String, String]]) with (Partial[Pick[P, Extract[String, String]]]) with (Partial[Pick[D, Exclude[String, String]]])) | P
  type DeprecatedAttrs[P, A /* <: Partial[P] */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: (props : styled-components.styled-components.ThemedStyledProps<P, T>): A[K] | A[K]}
    */ typings.styledDashComponents.styledDashComponentsStrings.DeprecatedAttrs with js.Any
  type FalseyValue = js.UndefOr[Null | `false`]
  type GlobalStyleComponent[P, T] = ComponentClass[ThemedGlobalStyledClassProps[P, T], ComponentState]
  /* Rewritten from type alias, can be one of: 
    - typings.styledDashComponents.styledDashComponentsMod.InterpolationValue
    - typings.styledDashComponents.styledDashComponentsMod.FlattenInterpolation[P]
    - typings.styledDashComponents.styledDashComponentsMod.InterpolationFunction[P]
  */
  type Interpolation[P] = _Interpolation[P] | String | Double | FalseyValue
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.styledDashComponents.styledDashComponentsMod.FalseyValue
    - typings.styledDashComponents.styledDashComponentsMod.Keyframes
    - typings.styledDashComponents.styledDashComponentsMod.StyledComponentInterpolation
    - typings.styledDashComponents.styledDashComponentsMod.CSSObject
  */
  type InterpolationValue = _InterpolationValue | String | Double | FalseyValue
  // Helper type operators
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (Defaultize[P, js.Any])
  /* Rewritten from type alias, can be one of: 
    - typings.styledDashComponents.styledDashComponentsMod.InterpolationValue
    - typings.styledDashComponents.styledDashComponentsMod.FlattenSimpleInterpolation
  */
  type SimpleInterpolation = _SimpleInterpolation | String | Double | FalseyValue
  type StyledComponent[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: String */] = (// the "string" allows this to be used as an object key
  // I really want to avoid this if possible but it's the only way to use nesting with object styles...
  String) with (StyledComponentBase[C, T, O, A]) with (NonReactStatics[C, js.Object])
  type StyledComponentInnerAttrs[C /* <: AnyStyledComponent */] = js.Any
  type StyledComponentInnerComponent[C /* <: ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: AnyStyledComponent */] = js.Any
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: String */] = (WithOptionalTheme[
    (Omit[(ReactDefaultizedProps[C, ComponentPropsWithRef[C]]) with O, A]) with (Partial[Pick[ComponentPropsWithRef[C] with O, A]]), 
    T
  ]) with WithChildrenIfReactComponentClass[C]
  type StyledComponentPropsWithAs[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: String */] = (StyledComponentProps[C, T, O, A]) with Anon_As[C]
  type StyledComponentPropsWithRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = ComponentPropsWithRef[C | StyledComponentInnerComponent[C]]
  type StyledFunction[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledProps[P] = ThemedStyledProps[P, AnyIfEmpty[DefaultTheme]]
  type ThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = BaseThemeProviderComponent[AnyIfEmpty[T], AnyIfEmpty[U]]
  type ThemedCssFunction[T /* <: js.Object */] = BaseThemedCssFunction[AnyIfEmpty[T]]
  type ThemedGlobalStyledClassProps[P, T] = (WithOptionalTheme[P, T]) with Anon_SuppressMultiMountWarning
  type ThemedStyledInterface[T /* <: js.Object */] = ThemedBaseStyledInterface[AnyIfEmpty[T]]
  type ThemedStyledProps[P, T] = P with ThemeProps[T]
  // Because of React typing quirks, when getting props from a React.ComponentClass,
  // we need to manually add a `children` field.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
  // and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
  type WithChildrenIfReactComponentClass[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = js.Object | Anon_Children
  type WithOptionalTheme[P /* <: Anon_ThemeT[T] */, T] = P with Anon_ThemeT[T]
  type WithThemeFnInterface[T /* <: js.Object */] = BaseWithThemeFnInterface[AnyIfEmpty[T]]
}
