package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICalendarFactory extends StObject {
  
  def createCalendar(languages: IIterable[String], calendar: String, clock: String): Calendar
  
  def createCalendarDefaultCalendarAndClock(languages: IIterable[String]): Calendar
}
object ICalendarFactory {
  
  inline def apply(
    createCalendar: (IIterable[String], String, String) => Calendar,
    createCalendarDefaultCalendarAndClock: IIterable[String] => Calendar
  ): ICalendarFactory = {
    val __obj = js.Dynamic.literal(createCalendar = js.Any.fromFunction3(createCalendar), createCalendarDefaultCalendarAndClock = js.Any.fromFunction1(createCalendarDefaultCalendarAndClock))
    __obj.asInstanceOf[ICalendarFactory]
  }
  
  extension [Self <: ICalendarFactory](x: Self) {
    
    inline def setCreateCalendar(value: (IIterable[String], String, String) => Calendar): Self = StObject.set(x, "createCalendar", js.Any.fromFunction3(value))
    
    inline def setCreateCalendarDefaultCalendarAndClock(value: IIterable[String] => Calendar): Self = StObject.set(x, "createCalendarDefaultCalendarAndClock", js.Any.fromFunction1(value))
  }
}
