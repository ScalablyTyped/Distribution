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
    template: js.Function5[js.Any, java.lang.String, js.Array[_], js.Any, scala.Double, java.lang.String]
  ): Sparklines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("paddingX")(paddingX)
    __obj.updateDynamic("paddingY")(paddingY)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Sparklines]
  }
}

