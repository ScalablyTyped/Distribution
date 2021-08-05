package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  /**
    * The day of birth, between 1 and 31.
    */
  var day: Double
  
  /**
    * The month of birth, between 1 and 12.
    */
  var month: Double
  
  /**
    * The four-digit year of birth.
    */
  var year: Double
}
object Day {
  
  inline def apply(day: Double, month: Double, year: Double): Day = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
  
  extension [Self <: Day](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
