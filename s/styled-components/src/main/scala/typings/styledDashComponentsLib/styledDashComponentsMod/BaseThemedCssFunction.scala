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
    first: InterpolationFunction[styledDashComponentsLib.ThemedStyledPropsT[T]],
    interpolations: Interpolation[styledDashComponentsLib.ThemedStyledPropsT[T]]*
  ): FlattenInterpolation[styledDashComponentsLib.ThemedStyledPropsT[T]] = js.native
}

