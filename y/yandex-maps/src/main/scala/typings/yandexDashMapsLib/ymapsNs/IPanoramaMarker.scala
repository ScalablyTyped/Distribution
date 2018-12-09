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

