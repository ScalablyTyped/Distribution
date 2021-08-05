package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClockIdentifiersStatics extends StObject {
  
  var twelveHour: String
  
  var twentyFourHour: String
}
object IClockIdentifiersStatics {
  
  inline def apply(twelveHour: String, twentyFourHour: String): IClockIdentifiersStatics = {
    val __obj = js.Dynamic.literal(twelveHour = twelveHour.asInstanceOf[js.Any], twentyFourHour = twentyFourHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClockIdentifiersStatics]
  }
  
  extension [Self <: IClockIdentifiersStatics](x: Self) {
    
    inline def setTwelveHour(value: String): Self = StObject.set(x, "twelveHour", value.asInstanceOf[js.Any])
    
    inline def setTwentyFourHour(value: String): Self = StObject.set(x, "twentyFourHour", value.asInstanceOf[js.Any])
  }
}
