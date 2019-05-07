package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnectionMarker
  extends IPanoramaConnection
     with IPanoramaMarker

object IPanoramaConnectionMarker {
  @scala.inline
  def apply(
    getConnectedPanorama: () => js.Promise[IPanorama],
    getIconSet: () => js.Promise[IPanoramaMarkerIconSet],
    getPanorama: () => IPanorama,
    getPosition: () => js.Array[scala.Double],
    properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager
  ): IPanoramaConnectionMarker = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama), getIconSet = js.Any.fromFunction0(getIconSet), getPanorama = js.Any.fromFunction0(getPanorama), getPosition = js.Any.fromFunction0(getPosition), properties = properties)
  
    __obj.asInstanceOf[IPanoramaConnectionMarker]
  }
}

