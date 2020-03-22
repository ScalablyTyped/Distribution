package typings.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledComponentsMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type AnyStyledComponent = typings.styledComponents.styledComponentsMod.StyledComponent[js.Any, js.Any, js.Any, js.Any | scala.Nothing]
  type Attrs[P, A /* <: typings.std.Partial[P] */, T] = (js.Function1[
    /* props */ typings.styledComponents.styledComponentsMod.ThemedStyledProps[P, T], 
    A
  ]) | A
  type BaseThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = typings.react.mod.ComponentClass[
    typings.styledComponents.styledComponentsMod.ThemeProviderProps[T, U], 
    typings.react.mod.ComponentState
  ]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ typings.react.mod.ComponentType[js.Any], 
    typings.react.mod.ForwardRefExoticComponent[
      typings.styledComponents.styledComponentsMod.WithOptionalTheme[
        typings.react.mod.ComponentPropsWithRef[typings.react.mod.ComponentType[js.Any]], 
        T
      ]
    ]
  ]
  type CSSKeyframes = js.Object with org.scalablytyped.runtime.StringDictionary[typings.styledComponents.styledComponentsMod.CSSObject]
  type CSSProp[T] = java.lang.String | typings.styledComponents.styledComponentsMod.CSSObject | typings.styledComponents.styledComponentsMod.FlattenInterpolation[typings.styledComponents.styledComponentsMod.ThemeProps[T]]
  type CSSProperties = typings.csstype.mod.Properties[java.lang.String | scala.Double]
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((typings.std.Pick[P, typings.std.Exclude[java.lang.String, java.lang.String]]) with (typings.std.Partial[typings.std.Pick[P, typings.std.Extract[java.lang.String, java.lang.String]]]) with (typings.std.Partial[typings.std.Pick[D, typings.std.Exclude[java.lang.String, java.lang.String]]])) | P
  type FalseyValue = js.UndefOr[scala.Null | typings.styledComponents.styledComponentsBooleans.`false`]
  type GlobalStyleComponent[P, T] = typings.react.mod.ComponentClass[
    typings.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps[P, T], 
    typings.react.mod.ComponentState
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.styledComponents.styledComponentsMod.InterpolationValue
    - typings.styledComponents.styledComponentsMod.FlattenInterpolation[P]
    - typings.styledComponents.styledComponentsMod.InterpolationFunction[P]
  */
  type Interpolation[P] = typings.styledComponents.styledComponentsMod._Interpolation[P] | java.lang.String | scala.Double | typings.styledComponents.styledComponentsMod.FalseyValue
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.styledComponents.styledComponentsMod.FalseyValue
    - typings.styledComponents.styledComponentsMod.Keyframes_
    - typings.styledComponents.styledComponentsMod.StyledComponentInterpolation
    - typings.styledComponents.styledComponentsMod.CSSObject
  */
  type InterpolationValue = typings.styledComponents.styledComponentsMod._InterpolationValue | java.lang.String | scala.Double | typings.styledComponents.styledComponentsMod.FalseyValue
  // Helper type operators
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (typings.styledComponents.styledComponentsMod.Defaultize[P, js.Any])
  /* Rewritten from type alias, can be one of: 
    - typings.styledComponents.styledComponentsMod.InterpolationValue
    - typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
  */
  type SimpleInterpolation = typings.styledComponents.styledComponentsMod._SimpleInterpolation | java.lang.String | scala.Double | typings.styledComponents.styledComponentsMod.FalseyValue
  type StyledComponent[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (// the "string" allows this to be used as an object key
  // I really want to avoid this if possible but it's the only way to use nesting with object styles...
  java.lang.String) with (typings.styledComponents.styledComponentsMod.StyledComponentBase[C, T, O, A]) with (typings.hoistNonReactStatics.mod.NonReactStatics[C, js.Object])
  type StyledComponentInnerAttrs[C /* <: typings.styledComponents.styledComponentsMod.AnyStyledComponent */] = js.Any
  type StyledComponentInnerComponent[C /* <: typings.react.mod.ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: typings.styledComponents.styledComponentsMod.AnyStyledComponent */] = js.Any
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: java.lang.String */] = (typings.styledComponents.styledComponentsMod.WithOptionalTheme[
    (typings.styledComponents.styledComponentsMod.Omit[
      (typings.styledComponents.styledComponentsMod.ReactDefaultizedProps[C, typings.react.mod.ComponentPropsWithRef[C]]) with O, 
      A
    ]) with (typings.std.Partial[typings.std.Pick[typings.react.mod.ComponentPropsWithRef[C] with O, A]]), 
    T
  ]) with typings.styledComponents.styledComponentsMod.WithChildrenIfReactComponentClass[C]
  type StyledComponentPropsWithAs[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (typings.styledComponents.styledComponentsMod.StyledComponentProps[C, T, O, A]) with typings.styledComponents.AnonForwardedAs[C]
  type StyledComponentPropsWithRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = typings.react.mod.ComponentPropsWithRef[
    C | typings.styledComponents.styledComponentsMod.StyledComponentInnerComponent[C]
  ]
  type StyledFunction[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = typings.styledComponents.styledComponentsMod.ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledProps[P] = typings.styledComponents.styledComponentsMod.ThemedStyledProps[
    P, 
    typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.DefaultTheme]
  ]
  type StylisPlugin = js.Function7[
    /* context */ scala.Double, 
    /* selector */ js.Array[java.lang.String], 
    /* parent */ js.Array[java.lang.String], 
    /* content */ java.lang.String, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    java.lang.String | scala.Unit
  ]
  type ThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = typings.styledComponents.styledComponentsMod.BaseThemeProviderComponent[
    typings.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
    typings.styledComponents.styledComponentsMod.AnyIfEmpty[U]
  ]
  type ThemedCssFunction[T /* <: js.Object */] = typings.styledComponents.styledComponentsMod.BaseThemedCssFunction[typings.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
  type ThemedGlobalStyledClassProps[P, T] = (typings.styledComponents.styledComponentsMod.WithOptionalTheme[P, T]) with typings.styledComponents.AnonSuppressMultiMountWarning
  type ThemedStyledInterface[T /* <: js.Object */] = typings.styledComponents.styledComponentsMod.ThemedBaseStyledInterface[typings.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
  type ThemedStyledProps[P, T] = P with typings.styledComponents.styledComponentsMod.ThemeProps[T]
  // Because of React typing quirks, when getting props from a React.ComponentClass,
  // we need to manually add a `children` field.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
  // and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
  type WithChildrenIfReactComponentClass[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = js.Object | typings.styledComponents.AnonChildren
  type WithOptionalTheme[P /* <: typings.styledComponents.AnonThemeT[T] */, T] = P with typings.styledComponents.AnonThemeT[T]
  type WithThemeFnInterface[T /* <: js.Object */] = typings.styledComponents.styledComponentsMod.BaseWithThemeFnInterface[typings.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
}
