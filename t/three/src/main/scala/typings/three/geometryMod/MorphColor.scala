package typings.three.geometryMod

import typings.three.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphColor extends js.Object {
  var colors: js.Array[Color]
  var name: String
}

object MorphColor {
  @scala.inline
  def apply(colors: js.Array[Color], name: String): MorphColor = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MorphColor]
  }
}

