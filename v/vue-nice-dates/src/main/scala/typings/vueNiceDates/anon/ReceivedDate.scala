package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivedDate extends StObject {
  
  var receivedDate: String | js.Date | Null
}
object ReceivedDate {
  
  inline def apply(): ReceivedDate = {
    val __obj = js.Dynamic.literal(receivedDate = null)
    __obj.asInstanceOf[ReceivedDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceivedDate] (val x: Self) extends AnyVal {
    
    inline def setReceivedDate(value: String | js.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedDateNull: Self = StObject.set(x, "receivedDate", null)
  }
}
