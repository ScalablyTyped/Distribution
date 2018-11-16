package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledFunction[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] extends js.Object {
  def apply(
    strings: stdLib.TemplateStringsArray,
    interpolations: (Interpolation[
      ThemedStyledProps[styledDashComponentsLib.StyledComponentPropsWithRef[C] with O, T]
    ])*
  ): StyledComponent[C, T, O, A] = js.native
  // Fun thing: 'attrs' can also provide a polymorphic 'as' prop
  // My head already hurts enough so maybe later...
  def attrs[U, A /* <: (stdLib.Partial[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U]) with ScalablyTyped.runtime.StringDictionary[js.Any] */](
    attrs: styledDashComponentsLib.Attrs[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U, A, T]
  ): ThemedStyledFunction[C, T, O with A, java.lang.String] = js.native
  // Only this overload is deprecated
  // tslint:disable:unified-signatures
  /** @deprecated Prefer using the new single function style, to be removed in v5 */
  def attrs[U, A /* <: (stdLib.Partial[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U]) with ScalablyTyped.runtime.StringDictionary[js.Any] */](
    attrs: styledDashComponentsLib.DeprecatedAttrs[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U, A, T]
  ): ThemedStyledFunction[C, T, O with A, java.lang.String] = js.native
}

