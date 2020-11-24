package typings.uiGrid.mod.moveColumns

import typings.uiGrid.anon.ColumnPositionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridMoveColumnsApi extends js.Object {
  
  // Methods
  /**
    * Method can be used to change column position
    * @param {number} originalPosition Original column position as a 0 indexed integer
    * @param {number} newPosition New column position as a 0 indexed integer
    */
  def moveColumn(originalPosition: Double, newPosition: Double): Unit = js.native
  
  // Events
  var on: ColumnPositionChanged = js.native
}
object IGridMoveColumnsApi {
  
  @scala.inline
  def apply(moveColumn: (Double, Double) => Unit, on: ColumnPositionChanged): IGridMoveColumnsApi = {
    val __obj = js.Dynamic.literal(moveColumn = js.Any.fromFunction2(moveColumn), on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMoveColumnsApi]
  }
  
  @scala.inline
  implicit class IGridMoveColumnsApiOps[Self <: IGridMoveColumnsApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMoveColumn(value: (Double, Double) => Unit): Self = this.set("moveColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: ColumnPositionChanged): Self = this.set("on", value.asInstanceOf[js.Any])
  }
}
