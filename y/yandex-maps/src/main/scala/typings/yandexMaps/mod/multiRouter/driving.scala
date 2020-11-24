package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.GeoObjectCollection
import typings.yandexMaps.mod.IEventEmitter
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.IGeometry
import typings.yandexMaps.mod.data.Manager
import typings.yandexMaps.mod.geometry.base.LineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.driving")
@js.native
object driving extends js.Object {
  
  @js.native
  class Path () extends IGeoObject[IGeometry] {
    
    def getSegments(): GeoObjectCollection = js.native
    
    var model: PathModel = js.native
    
    @JSName("properties")
    var properties_Path: Manager = js.native
  }
  
  @js.native
  class PathModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    def getSegments(): js.Array[SegmentModel] = js.native
    
    def getType(): String = js.native
    
    var properties: Manager = js.native
    
    var route: RouteModel = js.native
    
    def update(pathJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Route () extends IGeoObject[IGeometry] {
    
    def getPaths(): GeoObjectCollection = js.native
  }
  
  @js.native
  class RouteModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    def getPaths(): js.Array[PathModel] = js.native
    
    def getType(): String = js.native
    
    var multiRoute: MultiRouteModel = js.native
    
    var properties: Manager = js.native
    
    def update(routeJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Segment () extends IGeoObject[IGeometry] {
    
    @JSName("properties")
    var properties_Segment: Manager = js.native
  }
  
  @js.native
  class SegmentModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    var geometry: LineString = js.native
    
    def getType(): String = js.native
    
    def getViaPoints(): js.Array[ViaPointModel] = js.native
    
    var path: PathModel = js.native
    
    def update(segmentJson: js.Object): Unit = js.native
  }
}
