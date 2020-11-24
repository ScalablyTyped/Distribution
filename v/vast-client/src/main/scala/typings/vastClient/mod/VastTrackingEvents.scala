package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class VastTrackingEventsOps[Self <: VastTrackingEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompleteVarargs(value: String*): Self = this.set("complete", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: js.Array[String]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstQuartileVarargs(value: String*): Self = this.set("firstQuartile", js.Array(value :_*))
    
    @scala.inline
    def setFirstQuartile(value: js.Array[String]): Self = this.set("firstQuartile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidpointVarargs(value: String*): Self = this.set("midpoint", js.Array(value :_*))
    
    @scala.inline
    def setMidpoint(value: js.Array[String]): Self = this.set("midpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdQuartileVarargs(value: String*): Self = this.set("thirdQuartile", js.Array(value :_*))
    
    @scala.inline
    def setThirdQuartile(value: js.Array[String]): Self = this.set("thirdQuartile", value.asInstanceOf[js.Any])
  }
}
