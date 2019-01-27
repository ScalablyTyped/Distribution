package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsLib {
  type AnyIfEmpty[T /* <: js.Object */] = java.lang.String
  type Attrs[P, A /* <: stdLib.Partial[P] */, T] = (js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThemedStyledProps<P, T> */ /* props */ js.Any, 
    A
  ]) | A
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]) with (stdLib.Partial[stdLib.Pick[P, stdLib.Extract[java.lang.String, java.lang.String]]]) with (stdLib.Partial[stdLib.Pick[D, stdLib.Exclude[java.lang.String, java.lang.String]]])) | P
  type DeprecatedAttrs[P, A /* <: stdLib.Partial[P] */, T] = styledDashComponentsLib.styledDashComponentsLibStrings.DeprecatedAttrs with A
  // abuse Pick to strip the call signature from ForwardRefExoticComponent
  type ForwardRefExoticBase[P] = stdLib.Pick[reactLib.reactMod.ReactNs.ForwardRefExoticComponent[P], java.lang.String]
  // Helper type operators
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (Defaultize[P, js.Any])
  type StyleSheetManagerProps = Anon_Sheet | Anon_SheetTarget
  type StyledComponentInnerAttrs[C /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnyStyledComponent */ js.Any */] = js.Any
  type StyledComponentInnerComponent[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnyStyledComponent */ js.Any */] = js.Any
  // remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
  type StyledComponentInterpolation = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyledComponentBase<any, any, any, any> */ js.Any, 
    java.lang.String
  ]
  type StyledComponentPropsWithAs[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyledComponentProps<C, T, O, A> */ js.Any) with Anon_As[C]
  type StyledComponentPropsWithRef[C /* <: java.lang.String */] = reactLib.reactMod.ReactNs.ComponentPropsWithRef[C] | reactLib.reactMod.ReactNs.ComponentPropsWithRef[StyledComponentInnerComponent[C]]
  type ThemedStyledComponentFactories[T /* <: js.Object */] = styledDashComponentsLib.styledDashComponentsLibStrings.ThemedStyledComponentFactories with js.Any
  type WithOptionalTheme[P /* <: Anon_Theme[T] */, T] = P with Anon_Theme[T]
}
