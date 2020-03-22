package typings.vfileLocation.mod

import typings.vfileLocation.AnonColumn
import typings.vfileLocation.AnonLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * Get the `offset` (`number`) for a line and column-based `position` in the bound file.
    * Returns `-1` when given invalid or out of bounds input.
    */
  def toOffset(position: AnonColumn): Double
  /**
    * Get the line and column-based `position` for `offset` in the bound file.
    */
  def toPosition(offset: Double): AnonLine
}

object Location {
  @scala.inline
  def apply(toOffset: AnonColumn => Double, toPosition: Double => AnonLine): Location = {
    val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPosition = js.Any.fromFunction1(toPosition))
  
    __obj.asInstanceOf[Location]
  }
}

