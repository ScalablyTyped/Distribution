package typings.sudokus.sudokusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var fixed: Boolean
  var value: Double
}

object Cell {
  @scala.inline
  def apply(fixed: Boolean, value: Double): Cell = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cell]
  }
}

