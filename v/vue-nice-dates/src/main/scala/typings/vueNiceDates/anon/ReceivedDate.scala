package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceivedDate extends StObject {
  
  var receivedDate: String | typings.std.Date | Null = js.native
}
object ReceivedDate {
  
  @scala.inline
  def apply(): ReceivedDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceivedDate]
  }
  
  @scala.inline
  implicit class ReceivedDateMutableBuilder[Self <: ReceivedDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceivedDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDateNull: Self = StObject.set(x, "receivedDate", null)
  }
}
