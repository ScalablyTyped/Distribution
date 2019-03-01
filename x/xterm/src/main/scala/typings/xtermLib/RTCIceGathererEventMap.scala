package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceGathererEventMap extends js.Object {
  var error: Event
  var localcandidate: RTCIceGathererEvent
}

object RTCIceGathererEventMap {
  @scala.inline
  def apply(error: Event, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("localcandidate")(localcandidate)
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
}

