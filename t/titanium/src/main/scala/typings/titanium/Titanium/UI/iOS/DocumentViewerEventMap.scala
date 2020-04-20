package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentViewerEventMap extends ProxyEventMap {
  var load: DocumentViewerLoadEvent
  var menu: DocumentViewerMenuEvent
  var unload: DocumentViewerUnloadEvent
}

object DocumentViewerEventMap {
  @scala.inline
  def apply(load: DocumentViewerLoadEvent, menu: DocumentViewerMenuEvent, unload: DocumentViewerUnloadEvent): DocumentViewerEventMap = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewerEventMap]
  }
}

