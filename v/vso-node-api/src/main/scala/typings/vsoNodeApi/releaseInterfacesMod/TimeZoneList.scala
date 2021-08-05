package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZoneList extends StObject {
  
  var utcTimeZone: TimeZone
  
  var validTimeZones: js.Array[TimeZone]
}
object TimeZoneList {
  
  inline def apply(utcTimeZone: TimeZone, validTimeZones: js.Array[TimeZone]): TimeZoneList = {
    val __obj = js.Dynamic.literal(utcTimeZone = utcTimeZone.asInstanceOf[js.Any], validTimeZones = validTimeZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneList]
  }
  
  extension [Self <: TimeZoneList](x: Self) {
    
    inline def setUtcTimeZone(value: TimeZone): Self = StObject.set(x, "utcTimeZone", value.asInstanceOf[js.Any])
    
    inline def setValidTimeZones(value: js.Array[TimeZone]): Self = StObject.set(x, "validTimeZones", value.asInstanceOf[js.Any])
    
    inline def setValidTimeZonesVarargs(value: TimeZone*): Self = StObject.set(x, "validTimeZones", js.Array(value :_*))
  }
}
