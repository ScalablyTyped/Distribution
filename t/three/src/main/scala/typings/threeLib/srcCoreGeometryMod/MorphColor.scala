package typings
package threeLib.srcCoreGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphColor extends js.Object {
  var colors: js.Array[threeLib.srcMathColorMod.Color]
  var name: java.lang.String
}

object MorphColor {
  @scala.inline
  def apply(colors: js.Array[threeLib.srcMathColorMod.Color], name: java.lang.String): MorphColor = {
    val __obj = js.Dynamic.literal(colors = colors, name = name)
  
    __obj.asInstanceOf[MorphColor]
  }
}

