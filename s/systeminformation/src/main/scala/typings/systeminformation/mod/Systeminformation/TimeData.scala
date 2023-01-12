package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 1. General
trait TimeData extends StObject {
  
  var current: Double
  
  var timezone: String
  
  var timezoneName: String
  
  var uptime: Double
}
object TimeData {
  
  inline def apply(current: Double, timezone: String, timezoneName: String, uptime: Double): TimeData = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], timezoneName = timezoneName.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeData] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneName(value: String): Self = StObject.set(x, "timezoneName", value.asInstanceOf[js.Any])
    
    inline def setUptime(value: Double): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
  }
}
