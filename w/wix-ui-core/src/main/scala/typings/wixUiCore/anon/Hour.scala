package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hour extends StObject {
  
  var hour: String
  
  var minute: String
}
object Hour {
  
  inline def apply(hour: String, minute: String): Hour = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hour]
  }
  
  extension [Self <: Hour](x: Self) {
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
  }
}
