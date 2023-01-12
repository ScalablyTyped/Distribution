package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  def endDate(date: String): Unit
  
  def isFocus(isFocus: Boolean): Unit
  
  def receivedFocusName(focusName: String): Unit
  
  def startDate(date: String): Unit
}
object EndDate {
  
  inline def apply(
    endDate: String => Unit,
    isFocus: Boolean => Unit,
    receivedFocusName: String => Unit,
    startDate: String => Unit
  ): EndDate = {
    val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), isFocus = js.Any.fromFunction1(isFocus), receivedFocusName = js.Any.fromFunction1(receivedFocusName), startDate = js.Any.fromFunction1(startDate))
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: String => Unit): Self = StObject.set(x, "endDate", js.Any.fromFunction1(value))
    
    inline def setIsFocus(value: Boolean => Unit): Self = StObject.set(x, "isFocus", js.Any.fromFunction1(value))
    
    inline def setReceivedFocusName(value: String => Unit): Self = StObject.set(x, "receivedFocusName", js.Any.fromFunction1(value))
    
    inline def setStartDate(value: String => Unit): Self = StObject.set(x, "startDate", js.Any.fromFunction1(value))
  }
}
