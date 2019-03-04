package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnectionArrow extends IPanoramaConnection {
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager
  def getDirection(): js.Array[scala.Double]
  def getPanorama(): IPanorama
}

object IPanoramaConnectionArrow {
  @scala.inline
  def apply(
    getConnectedPanorama: js.Function0[js.Promise[IPanorama]],
    getDirection: js.Function0[js.Array[scala.Double]],
    getPanorama: js.Function0[IPanorama],
    properties: yandexDashMapsLib.ymapsNs.dataNs.Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = getConnectedPanorama, getDirection = getDirection, getPanorama = getPanorama, properties = properties)
  
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
}

