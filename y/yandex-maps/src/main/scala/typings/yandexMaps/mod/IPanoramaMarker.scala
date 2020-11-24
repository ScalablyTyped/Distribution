package typings.yandexMaps.mod

import typings.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaMarker extends js.Object {
  
  def getIconSet(): js.Promise[IPanoramaMarkerIconSet] = js.native
  
  def getPanorama(): IPanorama = js.native
  
  def getPosition(): js.Array[Double] = js.native
  
  var properties: Manager = js.native
}
object IPanoramaMarker {
  
  @scala.inline
  def apply(
    getIconSet: () => js.Promise[IPanoramaMarkerIconSet],
    getPanorama: () => IPanorama,
    getPosition: () => js.Array[Double],
    properties: Manager
  ): IPanoramaMarker = {
    val __obj = js.Dynamic.literal(getIconSet = js.Any.fromFunction0(getIconSet), getPanorama = js.Any.fromFunction0(getPanorama), getPosition = js.Any.fromFunction0(getPosition), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarker]
  }
  
  @scala.inline
  implicit class IPanoramaMarkerOps[Self <: IPanoramaMarker] (val x: Self) extends AnyVal {
    
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
    def setGetIconSet(value: () => js.Promise[IPanoramaMarkerIconSet]): Self = this.set("getIconSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanorama(value: () => IPanorama): Self = this.set("getPanorama", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => js.Array[Double]): Self = this.set("getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProperties(value: Manager): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
