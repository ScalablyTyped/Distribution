package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastTrackingEvents
  extends StObject
     with /* key */ StringDictionary[js.Array[String]] {
  
  var complete: js.Array[String]
  
  var firstQuartile: js.Array[String]
  
  var midpoint: js.Array[String]
  
  var thirdQuartile: js.Array[String]
}
object VastTrackingEvents {
  
  inline def apply(
    complete: js.Array[String],
    firstQuartile: js.Array[String],
    midpoint: js.Array[String],
    thirdQuartile: js.Array[String]
  ): VastTrackingEvents = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], firstQuartile = firstQuartile.asInstanceOf[js.Any], midpoint = midpoint.asInstanceOf[js.Any], thirdQuartile = thirdQuartile.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastTrackingEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastTrackingEvents] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: js.Array[String]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteVarargs(value: String*): Self = StObject.set(x, "complete", js.Array(value*))
    
    inline def setFirstQuartile(value: js.Array[String]): Self = StObject.set(x, "firstQuartile", value.asInstanceOf[js.Any])
    
    inline def setFirstQuartileVarargs(value: String*): Self = StObject.set(x, "firstQuartile", js.Array(value*))
    
    inline def setMidpoint(value: js.Array[String]): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    inline def setMidpointVarargs(value: String*): Self = StObject.set(x, "midpoint", js.Array(value*))
    
    inline def setThirdQuartile(value: js.Array[String]): Self = StObject.set(x, "thirdQuartile", value.asInstanceOf[js.Any])
    
    inline def setThirdQuartileVarargs(value: String*): Self = StObject.set(x, "thirdQuartile", js.Array(value*))
  }
}
