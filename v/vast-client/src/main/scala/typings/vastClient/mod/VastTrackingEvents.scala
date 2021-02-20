package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastTrackingEvents
  extends /* key */ StringDictionary[js.Array[String]] {
  
  var complete: js.Array[String] = js.native
  
  var firstQuartile: js.Array[String] = js.native
  
  var midpoint: js.Array[String] = js.native
  
  var thirdQuartile: js.Array[String] = js.native
}
object VastTrackingEvents {
  
  @scala.inline
  def apply(
    complete: js.Array[String],
    firstQuartile: js.Array[String],
    midpoint: js.Array[String],
    thirdQuartile: js.Array[String]
  ): VastTrackingEvents = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], firstQuartile = firstQuartile.asInstanceOf[js.Any], midpoint = midpoint.asInstanceOf[js.Any], thirdQuartile = thirdQuartile.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastTrackingEvents]
  }
  
  @scala.inline
  implicit class VastTrackingEventsMutableBuilder[Self <: VastTrackingEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Array[String]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteVarargs(value: String*): Self = StObject.set(x, "complete", js.Array(value :_*))
    
    @scala.inline
    def setFirstQuartile(value: js.Array[String]): Self = StObject.set(x, "firstQuartile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstQuartileVarargs(value: String*): Self = StObject.set(x, "firstQuartile", js.Array(value :_*))
    
    @scala.inline
    def setMidpoint(value: js.Array[String]): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidpointVarargs(value: String*): Self = StObject.set(x, "midpoint", js.Array(value :_*))
    
    @scala.inline
    def setThirdQuartile(value: js.Array[String]): Self = StObject.set(x, "thirdQuartile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdQuartileVarargs(value: String*): Self = StObject.set(x, "thirdQuartile", js.Array(value :_*))
  }
}
