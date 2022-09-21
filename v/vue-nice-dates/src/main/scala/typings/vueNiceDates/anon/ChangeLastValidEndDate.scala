package typings.vueNiceDates.anon

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeLastValidEndDate extends StObject {
  
  def changeLastValidEndDate(date: String): Unit
  
  def changeLastValidStartDate(date: String): Unit
  
  def handleClickDate(date: js.Date, `type`: String): Unit
  
  def handleFocusIn(e: MouseEvent): Unit
  
  def handleOutsideClick(e: MouseEvent): Unit
  
  def triggerFocusEvent(focusName: String): Unit
  
  def updateReceivedEndDate(date: String): Unit
  
  def updateReceivedStartDate(date: String): Unit
}
object ChangeLastValidEndDate {
  
  inline def apply(
    changeLastValidEndDate: String => Unit,
    changeLastValidStartDate: String => Unit,
    handleClickDate: (js.Date, String) => Unit,
    handleFocusIn: MouseEvent => Unit,
    handleOutsideClick: MouseEvent => Unit,
    triggerFocusEvent: String => Unit,
    updateReceivedEndDate: String => Unit,
    updateReceivedStartDate: String => Unit
  ): ChangeLastValidEndDate = {
    val __obj = js.Dynamic.literal(changeLastValidEndDate = js.Any.fromFunction1(changeLastValidEndDate), changeLastValidStartDate = js.Any.fromFunction1(changeLastValidStartDate), handleClickDate = js.Any.fromFunction2(handleClickDate), handleFocusIn = js.Any.fromFunction1(handleFocusIn), handleOutsideClick = js.Any.fromFunction1(handleOutsideClick), triggerFocusEvent = js.Any.fromFunction1(triggerFocusEvent), updateReceivedEndDate = js.Any.fromFunction1(updateReceivedEndDate), updateReceivedStartDate = js.Any.fromFunction1(updateReceivedStartDate))
    __obj.asInstanceOf[ChangeLastValidEndDate]
  }
  
  extension [Self <: ChangeLastValidEndDate](x: Self) {
    
    inline def setChangeLastValidEndDate(value: String => Unit): Self = StObject.set(x, "changeLastValidEndDate", js.Any.fromFunction1(value))
    
    inline def setChangeLastValidStartDate(value: String => Unit): Self = StObject.set(x, "changeLastValidStartDate", js.Any.fromFunction1(value))
    
    inline def setHandleClickDate(value: (js.Date, String) => Unit): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2(value))
    
    inline def setHandleFocusIn(value: MouseEvent => Unit): Self = StObject.set(x, "handleFocusIn", js.Any.fromFunction1(value))
    
    inline def setHandleOutsideClick(value: MouseEvent => Unit): Self = StObject.set(x, "handleOutsideClick", js.Any.fromFunction1(value))
    
    inline def setTriggerFocusEvent(value: String => Unit): Self = StObject.set(x, "triggerFocusEvent", js.Any.fromFunction1(value))
    
    inline def setUpdateReceivedEndDate(value: String => Unit): Self = StObject.set(x, "updateReceivedEndDate", js.Any.fromFunction1(value))
    
    inline def setUpdateReceivedStartDate(value: String => Unit): Self = StObject.set(x, "updateReceivedStartDate", js.Any.fromFunction1(value))
  }
}
