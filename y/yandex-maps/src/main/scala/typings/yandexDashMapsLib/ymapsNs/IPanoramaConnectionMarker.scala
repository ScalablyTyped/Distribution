package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnectionMarker
  extends IPanoramaConnection
     with IPanoramaMarker

object IPanoramaConnectionMarker {
  @scala.inline
  def apply(
    getConnectedPanorama: js.Function0[js.Promise[IPanorama]],
    getIconSet: js.Function0[js.Promise[IPanoramaMarkerIconSet]],
    getPanorama: js.Function0[IPanorama],
    getPosition: js.Function0[js.Array[scala.Double]],
    properties: yandexDashMapsLib.ymapsNs.dataNs.Manager
  ): IPanoramaConnectionMarker = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = getConnectedPanorama, getIconSet = getIconSet, getPanorama = getPanorama, getPosition = getPosition, properties = properties)
  
    __obj.asInstanceOf[IPanoramaConnectionMarker]
  }
}

