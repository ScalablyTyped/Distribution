package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndDate extends js.Object {
  
  def endDate(date: String): Unit = js.native
  
  def isFocus(isFocus: Boolean): Unit = js.native
  
  def receivedFocusName(focusName: String): Unit = js.native
  
  def startDate(date: String): Unit = js.native
}
object EndDate {
  
  @scala.inline
  def apply(
    endDate: String => Unit,
    isFocus: Boolean => Unit,
    receivedFocusName: String => Unit,
    startDate: String => Unit
  ): EndDate = {
    val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), isFocus = js.Any.fromFunction1(isFocus), receivedFocusName = js.Any.fromFunction1(receivedFocusName), startDate = js.Any.fromFunction1(startDate))
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit class EndDateOps[Self <: EndDate] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: String => Unit): Self = this.set("endDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFocus(value: Boolean => Unit): Self = this.set("isFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReceivedFocusName(value: String => Unit): Self = this.set("receivedFocusName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDate(value: String => Unit): Self = this.set("startDate", js.Any.fromFunction1(value))
  }
}
