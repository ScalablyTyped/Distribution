package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClockIdentifiersStatics extends StObject {
  
  var twelveHour: String = js.native
  
  var twentyFourHour: String = js.native
}
object IClockIdentifiersStatics {
  
  @scala.inline
  def apply(twelveHour: String, twentyFourHour: String): IClockIdentifiersStatics = {
    val __obj = js.Dynamic.literal(twelveHour = twelveHour.asInstanceOf[js.Any], twentyFourHour = twentyFourHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClockIdentifiersStatics]
  }
  
  @scala.inline
  implicit class IClockIdentifiersStaticsMutableBuilder[Self <: IClockIdentifiersStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTwelveHour(value: String): Self = StObject.set(x, "twelveHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwentyFourHour(value: String): Self = StObject.set(x, "twentyFourHour", value.asInstanceOf[js.Any])
  }
}
