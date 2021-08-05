package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivedDate extends StObject {
  
  var receivedDate: String | typings.std.Date | Null
}
object ReceivedDate {
  
  inline def apply(): ReceivedDate = {
    val __obj = js.Dynamic.literal(receivedDate = null)
    __obj.asInstanceOf[ReceivedDate]
  }
  
  extension [Self <: ReceivedDate](x: Self) {
    
    inline def setReceivedDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedDateNull: Self = StObject.set(x, "receivedDate", null)
  }
}
