package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEventMap extends ProxyEventMap {
  var cameraready: MediaCamerareadyEvent = js.native
  var routechange: MediaRoutechangeEvent = js.native
  var volume: MediaVolumeEvent = js.native
}

object MediaEventMap {
  @scala.inline
  def apply(cameraready: MediaCamerareadyEvent, routechange: MediaRoutechangeEvent, volume: MediaVolumeEvent): MediaEventMap = {
    val __obj = js.Dynamic.literal(cameraready = cameraready.asInstanceOf[js.Any], routechange = routechange.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEventMap]
  }
  @scala.inline
  implicit class MediaEventMapOps[Self <: MediaEventMap] (val x: Self) extends AnyVal {
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
    def setCameraready(value: MediaCamerareadyEvent): Self = this.set("cameraready", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutechange(value: MediaRoutechangeEvent): Self = this.set("routechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: MediaVolumeEvent): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

