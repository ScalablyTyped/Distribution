package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.GeoObjectCollection
import typings.yandexMaps.mod.IEventEmitter
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.data.Manager
import typings.yandexMaps.mod.geometry.base.LineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.driving")
@js.native
object driving extends js.Object {
  @js.native
  class Path () extends IGeoObject {
    var model: PathModel = js.native
    @JSName("properties")
    var properties_Path: Manager = js.native
    def getSegments(): GeoObjectCollection = js.native
  }
  
  @js.native
  class PathModel () extends IEventEmitter {
    var properties: Manager = js.native
    var route: RouteModel = js.native
    def destroy(): Unit = js.native
    def getSegments(): js.Array[SegmentModel] = js.native
    def getType(): String = js.native
    def update(pathJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Route () extends IGeoObject {
    def getPaths(): GeoObjectCollection = js.native
  }
  
  @js.native
  class RouteModel () extends IEventEmitter {
    var multiRoute: MultiRouteModel = js.native
    var properties: Manager = js.native
    def destroy(): Unit = js.native
    def getPaths(): js.Array[PathModel] = js.native
    def getType(): String = js.native
    def update(routeJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Segment () extends IGeoObject {
    @JSName("properties")
    var properties_Segment: Manager = js.native
  }
  
  @js.native
  class SegmentModel () extends IEventEmitter {
    var geometry: LineString = js.native
    var path: PathModel = js.native
    def destroy(): Unit = js.native
    def getType(): String = js.native
    def getViaPoints(): js.Array[ViaPointModel] = js.native
    def update(segmentJson: js.Object): Unit = js.native
  }
  
}

