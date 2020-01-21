package typings.svgJs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var filterSVGElements: js.Array[HTMLElement]
  def degrees(r: Double): Double
  def filter(array: js.Array[_], block: js.Function): js.Any
  def map(array: js.Array[_], block: js.Function): js.Any
  def radians(d: Double): Double
}

object AnonArray {
  @scala.inline
  def apply(
    degrees: Double => Double,
    filter: (js.Array[_], js.Function) => js.Any,
    filterSVGElements: js.Array[HTMLElement],
    map: (js.Array[_], js.Function) => js.Any,
    radians: Double => Double
  ): AnonArray = {
    val __obj = js.Dynamic.literal(degrees = js.Any.fromFunction1(degrees), filter = js.Any.fromFunction2(filter), filterSVGElements = filterSVGElements.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), radians = js.Any.fromFunction1(radians))
  
    __obj.asInstanceOf[AnonArray]
  }
}

