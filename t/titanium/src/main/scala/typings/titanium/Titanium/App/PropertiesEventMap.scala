package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesEventMap extends ProxyEventMap {
  var change: PropertiesChangeEvent
}

object PropertiesEventMap {
  @scala.inline
  def apply(change: PropertiesChangeEvent): PropertiesEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesEventMap]
  }
}

