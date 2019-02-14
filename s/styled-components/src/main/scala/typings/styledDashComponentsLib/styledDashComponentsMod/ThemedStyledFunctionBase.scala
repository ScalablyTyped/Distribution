package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledFunctionBase[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] extends js.Object {
  def apply(
    first: stdLib.TemplateStringsArray,
    rest: (Interpolation[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]])*
  ): StyledComponent[C, T, O, A] = js.native
  def apply(
    first: CSSObject,
    rest: (Interpolation[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]])*
  ): StyledComponent[C, T, O, A] = js.native
  def apply(
    first: InterpolationFunction[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]],
    rest: (Interpolation[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]])*
  ): StyledComponent[C, T, O, A] = js.native
}

