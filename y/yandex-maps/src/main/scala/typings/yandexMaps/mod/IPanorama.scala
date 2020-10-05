package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanorama extends js.Object {
  def getAngularBBox(): js.Array[Double] = js.native
  def getConnectionArrows(): js.Array[IPanoramaConnectionArrow] = js.native
  def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker] = js.native
  def getCoordSystem(): ICoordSystem = js.native
  def getDefaultDirection(): js.Array[Double] = js.native
  def getDefaultSpan(): js.Array[Double] = js.native
  def getGraph(): IPanoramaGraph | Null = js.native
  def getMarkers(): js.Array[IPanoramaMarker] = js.native
  def getName(): String = js.native
  def getPosition(): js.Array[Double] = js.native
  def getTileLevels(): js.Array[IPanoramaTileLevel] = js.native
  def getTileSize(): js.Array[Double] = js.native
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
  @scala.inline
  implicit class IPanoramaOps[Self <: IPanorama] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAngularBBox(value: () => js.Array[Double]): Self = this.set("getAngularBBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConnectionArrows(value: () => js.Array[IPanoramaConnectionArrow]): Self = this.set("getConnectionArrows", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConnectionMarkers(value: () => js.Array[IPanoramaConnectionMarker]): Self = this.set("getConnectionMarkers", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCoordSystem(value: () => ICoordSystem): Self = this.set("getCoordSystem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDefaultDirection(value: () => js.Array[Double]): Self = this.set("getDefaultDirection", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDefaultSpan(value: () => js.Array[Double]): Self = this.set("getDefaultSpan", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGraph(value: () => IPanoramaGraph | Null): Self = this.set("getGraph", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMarkers(value: () => js.Array[IPanoramaMarker]): Self = this.set("getMarkers", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosition(value: () => js.Array[Double]): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTileLevels(value: () => js.Array[IPanoramaTileLevel]): Self = this.set("getTileLevels", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTileSize(value: () => js.Array[Double]): Self = this.set("getTileSize", js.Any.fromFunction0(value))
  }
  
}

