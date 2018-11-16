package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseThemedCssFunction[T /* <: js.Object */] extends js.Object {
  def apply(cssObject: CSSObject): js.Array[InterpolationValue] = js.native
  def apply(strings: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): js.Array[InterpolationValue] = js.native
  def apply[P](func: InterpolationFunction[ThemedStyledProps[P, T]]): js.Array[FlattenInterpolation[ThemedStyledProps[P, T]]] = js.native
}

