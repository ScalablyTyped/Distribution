package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastValidDate extends StObject {
  
  @JSName("$lastValidDate")
  var $lastValidDate: String
  
  var receivedDate: String
  
  var receivedIsFocus: Boolean
}
object LastValidDate {
  
  inline def apply($lastValidDate: String, receivedDate: String, receivedIsFocus: Boolean): LastValidDate = {
    val __obj = js.Dynamic.literal($lastValidDate = $lastValidDate.asInstanceOf[js.Any], receivedDate = receivedDate.asInstanceOf[js.Any], receivedIsFocus = receivedIsFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastValidDate]
  }
  
  extension [Self <: LastValidDate](x: Self) {
    
    inline def set$lastValidDate(value: String): Self = StObject.set(x, "$lastValidDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedDate(value: String): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedIsFocus(value: Boolean): Self = StObject.set(x, "receivedIsFocus", value.asInstanceOf[js.Any])
  }
}
