package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledFunction[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] extends ThemedStyledFunctionBase[C, T, O, A] {
  // Fun thing: 'attrs' can also provide a polymorphic 'as' prop
  // My head already hurts enough so maybe later...
  def attrs[U, NewA /* <: (stdLib.Partial[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U]) with org.scalablytyped.runtime.StringDictionary[js.Any] */](
    attrs: styledDashComponentsLib.Attrs[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U, NewA, T]
  ): ThemedStyledFunction[C, T, O with NewA, A | java.lang.String] = js.native
  // Only this overload is deprecated
  // tslint:disable:unified-signatures
  /** @deprecated Prefer using the new single function style, to be removed in v5 */
  def attrs[U, NewA /* <: (stdLib.Partial[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U]) with org.scalablytyped.runtime.StringDictionary[js.Any] */](
    attrs: styledDashComponentsLib.DeprecatedAttrs[styledDashComponentsLib.StyledComponentPropsWithRef[C] with U, NewA, T]
  ): ThemedStyledFunction[C, T, O with NewA, A | java.lang.String] = js.native
}

