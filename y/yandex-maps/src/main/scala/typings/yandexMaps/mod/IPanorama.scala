package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanorama extends js.Object {
  def getAngularBBox(): js.Array[Double]
  def getConnectionArrows(): js.Array[IPanoramaConnectionArrow]
  def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker]
  def getCoordSystem(): ICoordSystem
  def getDefaultDirection(): js.Array[Double]
  def getDefaultSpan(): js.Array[Double]
  def getGraph(): IPanoramaGraph | Null
  def getMarkers(): js.Array[IPanoramaMarker]
  def getName(): String
  def getPosition(): js.Array[Double]
  def getTileLevels(): js.Array[IPanoramaTileLevel]
  def getTileSize(): js.Array[Double]
}

object IPanorama {
  @scala.inline
  def apply(
    getAngularBBox: () => js.Array[Double],
    getConnectionArrows: () => js.Array[IPanoramaConnectionArrow],
    getConnectionMarkers: () => js.Array[IPanoramaConnectionMarker],
    getCoordSystem: () => ICoordSystem,
    getDefaultDirection: () => js.Array[Double],
    getDefaultSpan: () => js.Array[Double],
    getGraph: () => IPanoramaGraph | Null,
    getMarkers: () => js.Array[IPanoramaMarker],
    getName: () => String,
    getPosition: () => js.Array[Double],
    getTileLevels: () => js.Array[IPanoramaTileLevel],
    getTileSize: () => js.Array[Double]
  ): IPanorama = {
    val __obj = js.Dynamic.literal(getAngularBBox = js.Any.fromFunction0(getAngularBBox), getConnectionArrows = js.Any.fromFunction0(getConnectionArrows), getConnectionMarkers = js.Any.fromFunction0(getConnectionMarkers), getCoordSystem = js.Any.fromFunction0(getCoordSystem), getDefaultDirection = js.Any.fromFunction0(getDefaultDirection), getDefaultSpan = js.Any.fromFunction0(getDefaultSpan), getGraph = js.Any.fromFunction0(getGraph), getMarkers = js.Any.fromFunction0(getMarkers), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getTileLevels = js.Any.fromFunction0(getTileLevels), getTileSize = js.Any.fromFunction0(getTileSize))
  
    __obj.asInstanceOf[IPanorama]
  }
}

