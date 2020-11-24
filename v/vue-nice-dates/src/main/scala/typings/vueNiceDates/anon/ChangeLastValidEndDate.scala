package typings.vueNiceDates.anon

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLastValidEndDate extends js.Object {
  
  def changeLastValidEndDate(date: String): Unit = js.native
  
  def changeLastValidStartDate(date: String): Unit = js.native
  
  def handleClickDate(date: typings.std.Date, `type`: String): Unit = js.native
  
  def handleFocusIn(e: MouseEvent): Unit = js.native
  
  def handleOutsideClick(e: MouseEvent): Unit = js.native
  
  def triggerFocusEvent(focusName: String): Unit = js.native
  
  def updateReceivedEndDate(date: String): Unit = js.native
  
  def updateReceivedStartDate(date: String): Unit = js.native
}
object ChangeLastValidEndDate {
  
  @scala.inline
  def apply(
    changeLastValidEndDate: String => Unit,
    changeLastValidStartDate: String => Unit,
    handleClickDate: (typings.std.Date, String) => Unit,
    handleFocusIn: MouseEvent => Unit,
    handleOutsideClick: MouseEvent => Unit,
    triggerFocusEvent: String => Unit,
    updateReceivedEndDate: String => Unit,
    updateReceivedStartDate: String => Unit
  ): ChangeLastValidEndDate = {
    val __obj = js.Dynamic.literal(changeLastValidEndDate = js.Any.fromFunction1(changeLastValidEndDate), changeLastValidStartDate = js.Any.fromFunction1(changeLastValidStartDate), handleClickDate = js.Any.fromFunction2(handleClickDate), handleFocusIn = js.Any.fromFunction1(handleFocusIn), handleOutsideClick = js.Any.fromFunction1(handleOutsideClick), triggerFocusEvent = js.Any.fromFunction1(triggerFocusEvent), updateReceivedEndDate = js.Any.fromFunction1(updateReceivedEndDate), updateReceivedStartDate = js.Any.fromFunction1(updateReceivedStartDate))
    __obj.asInstanceOf[ChangeLastValidEndDate]
  }
  
  @scala.inline
  implicit class ChangeLastValidEndDateOps[Self <: ChangeLastValidEndDate] (val x: Self) extends AnyVal {
    
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
    def setChangeLastValidEndDate(value: String => Unit): Self = this.set("changeLastValidEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeLastValidStartDate(value: String => Unit): Self = this.set("changeLastValidStartDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleClickDate(value: (typings.std.Date, String) => Unit): Self = this.set("handleClickDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleFocusIn(value: MouseEvent => Unit): Self = this.set("handleFocusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleOutsideClick(value: MouseEvent => Unit): Self = this.set("handleOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerFocusEvent(value: String => Unit): Self = this.set("triggerFocusEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateReceivedEndDate(value: String => Unit): Self = this.set("updateReceivedEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateReceivedStartDate(value: String => Unit): Self = this.set("updateReceivedStartDate", js.Any.fromFunction1(value))
  }
}
