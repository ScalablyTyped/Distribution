package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanorama extends StObject {
  
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
  
  @scala.inline
  implicit class IPanoramaMutableBuilder[Self <: IPanorama] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAngularBBox(value: () => js.Array[Double]): Self = StObject.set(x, "getAngularBBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConnectionArrows(value: () => js.Array[IPanoramaConnectionArrow]): Self = StObject.set(x, "getConnectionArrows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConnectionMarkers(value: () => js.Array[IPanoramaConnectionMarker]): Self = StObject.set(x, "getConnectionMarkers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCoordSystem(value: () => ICoordSystem): Self = StObject.set(x, "getCoordSystem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultDirection(value: () => js.Array[Double]): Self = StObject.set(x, "getDefaultDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultSpan(value: () => js.Array[Double]): Self = StObject.set(x, "getDefaultSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGraph(value: () => IPanoramaGraph | Null): Self = StObject.set(x, "getGraph", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarkers(value: () => js.Array[IPanoramaMarker]): Self = StObject.set(x, "getMarkers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => js.Array[Double]): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileLevels(value: () => js.Array[IPanoramaTileLevel]): Self = StObject.set(x, "getTileLevels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileSize(value: () => js.Array[Double]): Self = StObject.set(x, "getTileSize", js.Any.fromFunction0(value))
  }
}
