package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCreative extends js.Object {
  
  var adId: String | Null = js.native
  
  var apiFramework: String | Null = js.native
  
  var id: String | Null = js.native
  
  var sequence: String | Double | Null = js.native
  
  var trackingEvents: VastTrackingEvents = js.native
  
  var `type`: String = js.native
}
object VastCreative {
  
  @scala.inline
  def apply(trackingEvents: VastTrackingEvents, `type`: String): VastCreative = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreative]
  }
  
  @scala.inline
  implicit class VastCreativeOps[Self <: VastCreative] (val x: Self) extends AnyVal {
    
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
    def setTrackingEvents(value: VastTrackingEvents): Self = this.set("trackingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdId(value: String): Self = this.set("adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdIdNull: Self = this.set("adId", null)
    
    @scala.inline
    def setApiFramework(value: String): Self = this.set("apiFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFrameworkNull: Self = this.set("apiFramework", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setSequence(value: String | Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNull: Self = this.set("sequence", null)
  }
}
