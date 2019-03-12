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
    getConnectedPanorama: () => js.Promise[IPanorama],
    getDirection: () => js.Array[scala.Double],
    getPanorama: () => IPanorama,
    properties: yandexDashMapsLib.ymapsNs.dataNs.Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama), getDirection = js.Any.fromFunction0(getDirection), getPanorama = js.Any.fromFunction0(getPanorama), properties = properties)
  
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
}

