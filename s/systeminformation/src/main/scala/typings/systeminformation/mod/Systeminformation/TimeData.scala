package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 1. General
@js.native
trait TimeData extends StObject {
  
  var current: String = js.native
  
  var timezone: String = js.native
  
  var timezoneName: String = js.native
  
  var uptime: String = js.native
}
object TimeData {
  
  @scala.inline
  def apply(current: String, timezone: String, timezoneName: String, uptime: String): TimeData = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], timezoneName = timezoneName.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeData]
  }
  
  @scala.inline
  implicit class TimeDataMutableBuilder[Self <: TimeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneName(value: String): Self = StObject.set(x, "timezoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptime(value: String): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
  }
}
