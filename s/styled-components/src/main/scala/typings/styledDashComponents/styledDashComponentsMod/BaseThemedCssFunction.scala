package typings.styledDashComponents.styledDashComponentsMod

import typings.std.TemplateStringsArray
import typings.styledDashComponents.ThemedStyledPropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseThemedCssFunction[T /* <: js.Object */] extends js.Object {
  def apply(first: TemplateStringsArray, interpolations: Interpolation[ThemedStyledPropsT[T]]*): FlattenInterpolation[ThemedStyledPropsT[T]] = js.native
  def apply(first: CSSObject, interpolations: Interpolation[ThemedStyledPropsT[T]]*): FlattenInterpolation[ThemedStyledPropsT[T]] = js.native
  def apply(
    first: InterpolationFunction[ThemedStyledPropsT[T]],
    interpolations: Interpolation[ThemedStyledPropsT[T]]*
  ): FlattenInterpolation[ThemedStyledPropsT[T]] = js.native
}

