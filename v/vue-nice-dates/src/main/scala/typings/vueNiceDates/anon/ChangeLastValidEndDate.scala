package typings.vueNiceDates.anon

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLastValidEndDate extends StObject {
  
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
  implicit class ChangeLastValidEndDateMutableBuilder[Self <: ChangeLastValidEndDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeLastValidEndDate(value: String => Unit): Self = StObject.set(x, "changeLastValidEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeLastValidStartDate(value: String => Unit): Self = StObject.set(x, "changeLastValidStartDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleClickDate(value: (typings.std.Date, String) => Unit): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleFocusIn(value: MouseEvent => Unit): Self = StObject.set(x, "handleFocusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleOutsideClick(value: MouseEvent => Unit): Self = StObject.set(x, "handleOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerFocusEvent(value: String => Unit): Self = StObject.set(x, "triggerFocusEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateReceivedEndDate(value: String => Unit): Self = StObject.set(x, "updateReceivedEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateReceivedStartDate(value: String => Unit): Self = StObject.set(x, "updateReceivedStartDate", js.Any.fromFunction1(value))
  }
}
