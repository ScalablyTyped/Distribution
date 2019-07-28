package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sparklines extends js.Object {
  var paddingX: Double
  var paddingY: Double
  var radius: Double
  def template(item: js.Any, common: String, data: js.Array[_], column: js.Any, index: Double): String
}

object Sparklines {
  @scala.inline
  def apply(
    paddingX: Double,
    paddingY: Double,
    radius: Double,
    template: (js.Any, String, js.Array[_], js.Any, Double) => String
  ): Sparklines = {
    val __obj = js.Dynamic.literal(paddingX = paddingX, paddingY = paddingY, radius = radius, template = js.Any.fromFunction5(template))
  
    __obj.asInstanceOf[Sparklines]
  }
}

