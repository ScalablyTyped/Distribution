package typings.yandexMaps.mod

import typings.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaConnectionArrow extends IPanoramaConnection {
  var properties: Manager = js.native
  def getDirection(): js.Array[Double] = js.native
  def getPanorama(): IPanorama = js.native
}

object IPanoramaConnectionArrow {
  @scala.inline
  def apply(
    getConnectedPanorama: () => js.Promise[IPanorama],
    getDirection: () => js.Array[Double],
    getPanorama: () => IPanorama,
    properties: Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama), getDirection = js.Any.fromFunction0(getDirection), getPanorama = js.Any.fromFunction0(getPanorama), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
  @scala.inline
  implicit class IPanoramaConnectionArrowOps[Self <: IPanoramaConnectionArrow] (val x: Self) extends AnyVal {
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
    def setGetDirection(value: () => js.Array[Double]): Self = this.set("getDirection", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPanorama(value: () => IPanorama): Self = this.set("getPanorama", js.Any.fromFunction0(value))
    @scala.inline
    def setProperties(value: Manager): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

