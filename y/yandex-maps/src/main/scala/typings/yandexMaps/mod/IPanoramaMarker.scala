package typings.yandexMaps.mod

import typings.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaMarker extends js.Object {
  var properties: Manager
  def getIconSet(): js.Promise[IPanoramaMarkerIconSet]
  def getPanorama(): IPanorama
  def getPosition(): js.Array[Double]
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
}

