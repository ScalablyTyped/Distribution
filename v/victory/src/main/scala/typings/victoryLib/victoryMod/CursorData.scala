package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorData extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object CursorData {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): CursorData = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[CursorData]
  }
}

