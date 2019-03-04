package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaMarker extends js.Object {
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager
  def getIconSet(): js.Promise[IPanoramaMarkerIconSet]
  def getPanorama(): IPanorama
  def getPosition(): js.Array[scala.Double]
}

object IPanoramaMarker {
  @scala.inline
  def apply(
    getIconSet: js.Function0[js.Promise[IPanoramaMarkerIconSet]],
    getPanorama: js.Function0[IPanorama],
    getPosition: js.Function0[js.Array[scala.Double]],
    properties: yandexDashMapsLib.ymapsNs.dataNs.Manager
  ): IPanoramaMarker = {
    val __obj = js.Dynamic.literal(getIconSet = getIconSet, getPanorama = getPanorama, getPosition = getPosition, properties = properties)
  
    __obj.asInstanceOf[IPanoramaMarker]
  }
}

