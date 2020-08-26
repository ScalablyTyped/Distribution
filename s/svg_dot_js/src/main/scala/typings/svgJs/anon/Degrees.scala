package typings.svgJs.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Degrees extends js.Object {
  var filterSVGElements: js.Array[HTMLElement] = js.native
  def degrees(r: Double): Double = js.native
  def filter(array: js.Array[_], block: js.Function): js.Any = js.native
  def map(array: js.Array[_], block: js.Function): js.Any = js.native
  def radians(d: Double): Double = js.native
}

object Degrees {
  @scala.inline
  def apply(
    degrees: Double => Double,
    filter: (js.Array[_], js.Function) => js.Any,
    filterSVGElements: js.Array[HTMLElement],
    map: (js.Array[_], js.Function) => js.Any,
    radians: Double => Double
  ): Degrees = {
    val __obj = js.Dynamic.literal(degrees = js.Any.fromFunction1(degrees), filter = js.Any.fromFunction2(filter), filterSVGElements = filterSVGElements.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), radians = js.Any.fromFunction1(radians))
    __obj.asInstanceOf[Degrees]
  }
  @scala.inline
  implicit class DegreesOps[Self <: Degrees] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDegrees(value: Double => Double): Self = this.set("degrees", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: (js.Array[_], js.Function) => js.Any): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def setFilterSVGElementsVarargs(value: HTMLElement*): Self = this.set("filterSVGElements", js.Array(value :_*))
    @scala.inline
    def setFilterSVGElements(value: js.Array[HTMLElement]): Self = this.set("filterSVGElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: (js.Array[_], js.Function) => js.Any): Self = this.set("map", js.Any.fromFunction2(value))
    @scala.inline
    def setRadians(value: Double => Double): Self = this.set("radians", js.Any.fromFunction1(value))
  }
  
}

