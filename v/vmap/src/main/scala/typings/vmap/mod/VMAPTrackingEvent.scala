package typings.vmap.mod

import typings.vmap.vmapStrings.breakEnd
import typings.vmap.vmapStrings.breakStart
import typings.vmap.vmapStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a VMAP tracking event
  */
trait VMAPTrackingEvent extends js.Object {
  /**
    * The name of the event to track for the element. Can be one of breakStart, breakEnd or error
    */
  var event: breakStart | breakEnd | error
  /**
    * The URI of the tracker
    */
  var uri: String
}

object VMAPTrackingEvent {
  @scala.inline
  def apply(event: breakStart | breakEnd | error, uri: String): VMAPTrackingEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[VMAPTrackingEvent]
  }
}

