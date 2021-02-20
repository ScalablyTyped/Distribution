package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class MediaEventMapMutableBuilder[Self <: MediaEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCameraready(value: MediaCamerareadyEvent): Self = StObject.set(x, "cameraready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutechange(value: MediaRoutechangeEvent): Self = StObject.set(x, "routechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: MediaVolumeEvent): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
