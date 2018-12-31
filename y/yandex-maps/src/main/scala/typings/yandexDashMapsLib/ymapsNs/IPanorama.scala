package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanorama extends js.Object {
  def getAngularBBox(): js.Array[scala.Double]
  def getConnectionArrows(): js.Array[IPanoramaConnectionArrow]
  def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker]
  def getCoordSystem(): ICoordSystem
  def getDefaultDirection(): js.Array[scala.Double]
  def getDefaultSpan(): js.Array[scala.Double]
  def getGraph(): IPanoramaGraph | scala.Null
  def getMarkers(): js.Array[IPanoramaMarker]
  def getName(): java.lang.String
  def getPosition(): js.Array[scala.Double]
  def getTileLevels(): js.Array[IPanoramaTileLevel]
  def getTileSize(): js.Array[scala.Double]
}

