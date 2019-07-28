package typings.tracking.trackingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event data emmitted by a `track` event.
  */
trait TrackEvent extends js.Object {
  var data: js.Array[TrackRect]
}

object TrackEvent {
  @scala.inline
  def apply(data: js.Array[TrackRect]): TrackEvent = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[TrackEvent]
  }
}

