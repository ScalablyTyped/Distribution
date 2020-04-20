package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarEventMap extends ProxyEventMap {
  var change: CalendarChangeEvent
}

object CalendarEventMap {
  @scala.inline
  def apply(change: CalendarChangeEvent): CalendarEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarEventMap]
  }
}

