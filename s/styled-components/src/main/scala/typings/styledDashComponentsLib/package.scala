package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsLib {
  type Attrs[P, A /* <: stdLib.Partial[P] */, T] = (js.Function1[/* props */ js.Any, A]) | A
  type DeprecatedAttrs[P, A /* <: stdLib.Partial[P] */, T] = styledDashComponentsLib.styledDashComponentsLibStrings.DeprecatedAttrs with A
  type DiffBetween[T, U] = (stdLib.Pick[T, stdLib.Exclude[java.lang.String, java.lang.String]]) with (stdLib.Pick[U, stdLib.Exclude[java.lang.String, java.lang.String]])
  // abuse Pick to strip the call signature from ForwardRefExoticComponent
  type ForwardRefExoticBase[P] = stdLib.Pick[reactLib.reactMod.ReactNs.ForwardRefExoticComponent[P], java.lang.String]
  // Helper type operators
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type StyleSheetManagerProps = Anon_Target | Anon_TargetSheet
  type StyledComponentInnerAttrs[C /* <: js.Any */] = js.Any
  type StyledComponentInnerComponent[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: js.Any */] = js.Any
  // remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
  type StyledComponentInterpolation = stdLib.Pick[js.Any, java.lang.String]
  type StyledComponentPropsWithAs[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = js.Any with Anon_As[C]
  type StyledComponentPropsWithRef[C /* <: java.lang.String */] = reactLib.reactMod.ReactNs.ComponentPropsWithRef[C] | reactLib.reactMod.ReactNs.ComponentPropsWithRef[StyledComponentInnerComponent[C]]
  type ThemedStyledComponentFactories[T /* <: js.Object */] = styledDashComponentsLib.styledDashComponentsLibStrings.ThemedStyledComponentFactories with js.Any
  type WithOptionalTheme[P /* <: Anon_Theme[T] */, T] = P with Anon_Theme[T]
}
