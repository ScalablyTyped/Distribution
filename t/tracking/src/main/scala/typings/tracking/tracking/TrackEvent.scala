package typings.tracking.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event data emmitted by a `track` event.
  */
@js.native
trait TrackEvent extends js.Object {
  
  var data: js.Array[TrackRect] = js.native
}
object TrackEvent {
  
  @scala.inline
  def apply(data: js.Array[TrackRect]): TrackEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackEvent]
  }
  
  @scala.inline
  implicit class TrackEventOps[Self <: TrackEvent] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: TrackRect*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[TrackRect]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
