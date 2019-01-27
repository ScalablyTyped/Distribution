package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseThemedCssFunction[T /* <: js.Object */] extends js.Object {
  def apply(first: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def apply(first: CSSObject, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def apply(
    first: InterpolationFunction[ThemedStyledProps[js.Object, T]],
    interpolations: (Interpolation[ThemedStyledProps[js.Object, T]])*
  ): FlattenInterpolation[ThemedStyledProps[js.Object, T]] = js.native
}

