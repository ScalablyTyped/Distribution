package typings.yandexMaps.mod

import typings.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnectionArrow extends IPanoramaConnection {
  var properties: Manager
  def getDirection(): js.Array[Double]
  def getPanorama(): IPanorama
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
}

