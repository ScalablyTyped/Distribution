package typings.vueNiceDates.anon

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLastValidDate extends StObject {
  
  def changeLastValidDate(date: String): Unit = js.native
  
  def handleClickDate(date: typings.std.Date, `type`: String): Unit = js.native
  
  def handleFocusIn(e: MouseEvent): Unit = js.native
  
  def handleOutsideClick(e: MouseEvent): Unit = js.native
}
object ChangeLastValidDate {
  
  @scala.inline
  def apply(
    changeLastValidDate: String => Unit,
    handleClickDate: (typings.std.Date, String) => Unit,
    handleFocusIn: MouseEvent => Unit,
    handleOutsideClick: MouseEvent => Unit
  ): ChangeLastValidDate = {
    val __obj = js.Dynamic.literal(changeLastValidDate = js.Any.fromFunction1(changeLastValidDate), handleClickDate = js.Any.fromFunction2(handleClickDate), handleFocusIn = js.Any.fromFunction1(handleFocusIn), handleOutsideClick = js.Any.fromFunction1(handleOutsideClick))
    __obj.asInstanceOf[ChangeLastValidDate]
  }
  
  @scala.inline
  implicit class ChangeLastValidDateMutableBuilder[Self <: ChangeLastValidDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeLastValidDate(value: String => Unit): Self = StObject.set(x, "changeLastValidDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleClickDate(value: (typings.std.Date, String) => Unit): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleFocusIn(value: MouseEvent => Unit): Self = StObject.set(x, "handleFocusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleOutsideClick(value: MouseEvent => Unit): Self = StObject.set(x, "handleOutsideClick", js.Any.fromFunction1(value))
  }
}
