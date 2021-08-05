package typings.xrm.Xrm

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the DateFormattingInfo.calendar field
  */
trait Calendar extends StObject {
  
  var AlgorithmType: Double
  
  var CalendarType: Double
  
  var Eras: js.Array[Double]
  
  var IsReadOnly: Boolean
  
  var MaxSupportedDateTime: Date
  
  var MinSupportedDateTime: Date
  
  var TwoDigitYearMax: Double
}
object Calendar {
  
  inline def apply(
    AlgorithmType: Double,
    CalendarType: Double,
    Eras: js.Array[Double],
    IsReadOnly: Boolean,
    MaxSupportedDateTime: Date,
    MinSupportedDateTime: Date,
    TwoDigitYearMax: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(AlgorithmType = AlgorithmType.asInstanceOf[js.Any], CalendarType = CalendarType.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxSupportedDateTime = MaxSupportedDateTime.asInstanceOf[js.Any], MinSupportedDateTime = MinSupportedDateTime.asInstanceOf[js.Any], TwoDigitYearMax = TwoDigitYearMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  
  extension [Self <: Calendar](x: Self) {
    
    inline def setAlgorithmType(value: Double): Self = StObject.set(x, "AlgorithmType", value.asInstanceOf[js.Any])
    
    inline def setCalendarType(value: Double): Self = StObject.set(x, "CalendarType", value.asInstanceOf[js.Any])
    
    inline def setEras(value: js.Array[Double]): Self = StObject.set(x, "Eras", value.asInstanceOf[js.Any])
    
    inline def setErasVarargs(value: Double*): Self = StObject.set(x, "Eras", js.Array(value :_*))
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setMaxSupportedDateTime(value: Date): Self = StObject.set(x, "MaxSupportedDateTime", value.asInstanceOf[js.Any])
    
    inline def setMinSupportedDateTime(value: Date): Self = StObject.set(x, "MinSupportedDateTime", value.asInstanceOf[js.Any])
    
    inline def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "TwoDigitYearMax", value.asInstanceOf[js.Any])
  }
}
