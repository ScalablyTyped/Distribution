package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.GeoObjectCollection
import typings.yandexMaps.mod.IEventEmitter
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.data.Manager
import typings.yandexMaps.mod.geometry.base.LineString
import typings.yandexMaps.mod.geometry.base.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.masstransit")
@js.native
object masstransit extends js.Object {
  @js.native
  class Path () extends IGeoObject {
    var model: PathModel = js.native
    @JSName("properties")
    var properties_Path: Manager = js.native
    def getSegmentMarkers(): GeoObjectCollection = js.native
    def getSegments(): GeoObjectCollection = js.native
  }
  
  @js.native
  class PathModel () extends IEventEmitter {
    var properties: Manager = js.native
    var route: RouteModel = js.native
    def destroy(): Unit = js.native
    def getSegments(): js.Array[TransferSegmentModel | TransportSegmentModel | WalkSegmentModel] = js.native
    def getType(): String = js.native
    def update(pathJson: js.Object): Unit = js.native
  }
  
  @js.native
  class Route () extends IGeoObject {
    var model: RouteModel = js.native
    @JSName("properties")
    var properties_Route: Manager = js.native
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
  class StopModel () extends IEventEmitter {
    var geometry: Point = js.native
    var properties: Manager = js.native
    var segment: TransportSegmentModel = js.native
    def update(stopJson: js.Object): Unit = js.native
  }
  
  @js.native
  class TransferSegment () extends IGeoObject {
    var model: TransferSegmentModel = js.native
    @JSName("properties")
    var properties_TransferSegment: Manager = js.native
  }
  
  @js.native
  class TransferSegmentModel () extends IEventEmitter {
    var geometry: LineString = js.native
    var path: PathModel = js.native
    var properties: Manager = js.native
    def destroy(segmentJson: js.Object): Unit = js.native
    def getType(): String = js.native
  }
  
  @js.native
  class TransportSegment () extends IGeoObject {
    var model: TransportSegmentModel = js.native
    @JSName("properties")
    var properties_TransportSegment: Manager = js.native
  }
  
  @js.native
  class TransportSegmentModel () extends IEventEmitter {
    var geometry: LineString = js.native
    var path: PathModel = js.native
    var properties: Manager = js.native
    def destroy(): Unit = js.native
    def getStops(): js.Array[StopModel] = js.native
    def getType(): String = js.native
    def update(segmentJson: js.Object): Unit = js.native
  }
  
  @js.native
  class WalkSegment () extends IGeoObject {
    var model: WalkSegmentModel = js.native
    @JSName("properties")
    var properties_WalkSegment: Manager = js.native
  }
  
  @js.native
  class WalkSegmentModel () extends IEventEmitter {
    var geometry: LineString = js.native
    var path: PathModel = js.native
    var properties: Manager = js.native
    def destroy(): Unit = js.native
    def getType(): String = js.native
  }
  
}

