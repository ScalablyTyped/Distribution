package typings
package sudokusLib.sudokusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var fixed: scala.Boolean
  var value: scala.Double
}

object Cell {
  @scala.inline
  def apply(fixed: scala.Boolean, value: scala.Double): Cell = {
    val __obj = js.Dynamic.literal(fixed = fixed, value = value)
  
    __obj.asInstanceOf[Cell]
  }
}

