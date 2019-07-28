package typings.styledDashComponents.styledDashComponentsMod

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledFunctionBase[C /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: String */] extends js.Object {
  def apply(first: TemplateStringsArray): StyledComponent[C, T, O, A] = js.native
  def apply(
    first: TemplateStringsArray,
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

