package typings
package svgDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var filterSVGElements: js.Array[stdLib.HTMLElement]
  def degrees(r: scala.Double): scala.Double
  def filter(array: js.Array[_], block: js.Function): js.Any
  def map(array: js.Array[_], block: js.Function): js.Any
  def radians(d: scala.Double): scala.Double
}

object Anon_Array {
  @scala.inline
  def apply(
    degrees: js.Function1[scala.Double, scala.Double],
    filter: js.Function2[js.Array[_], js.Function, js.Any],
    filterSVGElements: js.Array[stdLib.HTMLElement],
    map: js.Function2[js.Array[_], js.Function, js.Any],
    radians: js.Function1[scala.Double, scala.Double]
  ): Anon_Array = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degrees")(degrees)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("filterSVGElements")(filterSVGElements)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("radians")(radians)
    __obj.asInstanceOf[Anon_Array]
  }
}

