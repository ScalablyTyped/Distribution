package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshControlEventMap extends ProxyEventMap {
  var refreshend: RefreshControlRefreshendEvent
  var refreshstart: RefreshControlRefreshstartEvent
}

object RefreshControlEventMap {
  @scala.inline
  def apply(refreshend: RefreshControlRefreshendEvent, refreshstart: RefreshControlRefreshstartEvent): RefreshControlEventMap = {
    val __obj = js.Dynamic.literal(refreshend = refreshend.asInstanceOf[js.Any], refreshstart = refreshstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlEventMap]
  }
}

