package typings.three.srcCoreGeometryMod

import typings.three.srcMathColorMod.Color
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
    val __obj = js.Dynamic.literal(colors = colors, name = name)
  
    __obj.asInstanceOf[MorphColor]
  }
}

