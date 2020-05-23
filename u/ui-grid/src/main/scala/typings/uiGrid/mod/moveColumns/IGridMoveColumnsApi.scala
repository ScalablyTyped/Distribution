package typings.uiGrid.mod.moveColumns

import typings.uiGrid.anon.ColumnPositionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridMoveColumnsApi extends js.Object {
  // Events
  var on: ColumnPositionChanged
  // Methods
  /**
    * Method can be used to change column position
    * @param {number} originalPosition Original column position as a 0 indexed integer
    * @param {number} newPosition New column position as a 0 indexed integer
    */
  def moveColumn(originalPosition: Double, newPosition: Double): Unit
}

object IGridMoveColumnsApi {
  @scala.inline
  def apply(moveColumn: (Double, Double) => Unit, on: ColumnPositionChanged): IGridMoveColumnsApi = {
    val __obj = js.Dynamic.literal(moveColumn = js.Any.fromFunction2(moveColumn), on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMoveColumnsApi]
  }
}

