package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sparklines extends js.Object {
  var paddingX: scala.Double
  var paddingY: scala.Double
  var radius: scala.Double
  def template(item: js.Any, common: java.lang.String, data: js.Array[_], column: js.Any, index: scala.Double): java.lang.String
}

object Sparklines {
  @scala.inline
  def apply(
    paddingX: scala.Double,
    paddingY: scala.Double,
    radius: scala.Double,
    template: (js.Any, java.lang.String, js.Array[_], js.Any, scala.Double) => java.lang.String
  ): Sparklines = {
    val __obj = js.Dynamic.literal(paddingX = paddingX, paddingY = paddingY, radius = radius, template = js.Any.fromFunction5(template))
  
    __obj.asInstanceOf[Sparklines]
  }
}

