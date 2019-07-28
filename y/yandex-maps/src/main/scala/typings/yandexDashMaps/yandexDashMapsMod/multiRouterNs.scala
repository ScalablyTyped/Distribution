package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_ActiveRouteAutoSelection
import typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager
import typings.yandexDashMaps.yandexDashMapsMod.geometryNs.baseNs.LineString
import typings.yandexDashMaps.yandexDashMapsMod.geometryNs.baseNs.Point
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.EditorAddon
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.MultiRouteModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.ViaPointModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.WayPointModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.drivingNs.PathModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.drivingNs.Route
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.drivingNs.RouteModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.drivingNs.SegmentModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.StopModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.TransferSegmentModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.TransportSegmentModel
import typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.WalkSegmentModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter")
@js.native
object multiRouterNs extends js.Object {
  @js.native
  class EditorAddon () extends ICustomizable {
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    var state: Manager = js.native
    def isActive(): Boolean = js.native
    def start(state: js.Object): Unit = js.native
    def stop(): Unit = js.native
  }
  
  @js.native
  class MultiRoute protected () extends IGeoObject {
    def this(model: IMultiRouteModelJson) = this()
    def this(model: MultiRouteModel) = this()
    def this(model: IMultiRouteModelJson, options: Anon_ActiveRouteAutoSelection) = this()
    def this(model: MultiRouteModel, options: Anon_ActiveRouteAutoSelection) = this()
    var editor: EditorAddon = js.native
    /* CompleteClass */
    override var events: IEventManager = js.native
    var model: MultiRouteModel = js.native
    def getActiveRoute(): Route | typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.Route | Null = js.native
    def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
    def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
    def getRoutes(): GeoObjectCollection = js.native
    def getViaPoints(): GeoObjectCollection = js.native
    def getWayPoints(): GeoObjectCollection = js.native
    def setActiveRoute(): Unit = js.native
    def setActiveRoute(route: Route): Unit = js.native
    def setActiveRoute(route: typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.Route): Unit = js.native
  }
  
  @js.native
  class MultiRouteModel protected () extends IEventEmitter {
    def this(referencePoints: js.Array[IMultiRouteReferencePoint]) = this()
    def this(referencePoints: js.Array[IMultiRouteReferencePoint], params: IMultiRouteParams) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    var properties: Manager = js.native
    def destroy(): Unit = js.native
    def getAllPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
    def getJson(): js.Object = js.native
    def getParams(): IMultiRouteParams = js.native
    def getPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
    def getReferencePointIndexes(): js.Object = js.native
    def getReferencePoints(): js.Array[IMultiRouteReferencePoint] = js.native
    def getRoutes(): js.Array[
        RouteModel | typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.RouteModel
      ] = js.native
    def getViaPoints(): js.Array[ViaPointModel] = js.native
    def getWayPoints(): js.Array[WayPointModel] = js.native
    def setParams(params: IMultiRouteParams): Unit = js.native
    def setParams(params: IMultiRouteParams, extend: Boolean): Unit = js.native
    def setParams(params: IMultiRouteParams, extend: Boolean, clearRequests: Boolean): Unit = js.native
    def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint]): Unit = js.native
    def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint], viaIndexes: js.Array[Double]): Unit = js.native
    def setReferencePoints(
      referencePoints: js.Array[IMultiRouteReferencePoint],
      viaIndexes: js.Array[Double],
      clearRequests: Boolean
    ): Unit = js.native
  }
  
  @js.native
  class ViaPoint () extends IGeoObject {
    /* CompleteClass */
    override var events: IEventManager = js.native
    @JSName("properties")
    var properties_ViaPoint: Manager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
  }
  
  @js.native
  class ViaPointModel () extends IEventEmitter {
    /* CompleteClass */
    override var events: IEventManager = js.native
    var geometry: Point = js.native
    var multiRoute: MultiRouteModel = js.native
    var properties: Manager = js.native
    def destroy(): Unit = js.native
    def getReferencePoint(): js.Object = js.native
    def getReferencePointIndex(): Double = js.native
    def setReferencePoint(referencePoint: js.Object): Unit = js.native
    def update(viaPointJson: js.Object): Unit = js.native
  }
  
  @js.native
  class WayPoint () extends IGeoObject {
    /* CompleteClass */
    override var events: IEventManager = js.native
    var model: WayPointModel = js.native
    @JSName("properties")
    var properties_WayPoint: Manager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
  }
  
  @js.native
  class WayPointModel () extends IEventEmitter {
    /* CompleteClass */
    override var events: IEventManager = js.native
    var geometry: Point = js.native
    var multiRoute: MultiRouteModel = js.native
    var properties: Manager = js.native
    def destroy(): Unit = js.native
    def getReferencePoint(): js.Object = js.native
    def getReferencePointIndex(): Double = js.native
    def setReferencePoint(referencePoint: js.Object): Unit = js.native
    def update(wayPointJson: js.Object): Unit = js.native
  }
  
  @JSName("driving")
  @js.native
  object drivingNs extends js.Object {
    @js.native
    class Path () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var model: PathModel = js.native
      @JSName("properties")
      var properties_Path: Manager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def getSegments(): GeoObjectCollection = js.native
    }
    
    @js.native
    class PathModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var properties: Manager = js.native
      var route: RouteModel = js.native
      def destroy(): Unit = js.native
      def getSegments(): js.Array[SegmentModel] = js.native
      def getType(): String = js.native
      def update(pathJson: js.Object): Unit = js.native
    }
    
    @js.native
    class Route () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def getPaths(): GeoObjectCollection = js.native
    }
    
    @js.native
    class RouteModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var multiRoute: MultiRouteModel = js.native
      var properties: Manager = js.native
      def destroy(): Unit = js.native
      def getPaths(): js.Array[PathModel] = js.native
      def getType(): String = js.native
      def update(routeJson: js.Object): Unit = js.native
    }
    
    @js.native
    class Segment () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      @JSName("properties")
      var properties_Segment: Manager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
    }
    
    @js.native
    class SegmentModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var geometry: LineString = js.native
      var path: PathModel = js.native
      def destroy(): Unit = js.native
      def getType(): String = js.native
      def getViaPoints(): js.Array[ViaPointModel] = js.native
      def update(segmentJson: js.Object): Unit = js.native
    }
    
  }
  
  @JSName("masstransit")
  @js.native
  object masstransitNs extends js.Object {
    @js.native
    class Path () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var model: typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.PathModel = js.native
      @JSName("properties")
      var properties_Path: Manager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def getSegmentMarkers(): GeoObjectCollection = js.native
      def getSegments(): GeoObjectCollection = js.native
    }
    
    @js.native
    class PathModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var properties: Manager = js.native
      var route: typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.RouteModel = js.native
      def destroy(): Unit = js.native
      def getSegments(): js.Array[TransferSegmentModel | TransportSegmentModel | WalkSegmentModel] = js.native
      def getType(): String = js.native
      def update(pathJson: js.Object): Unit = js.native
    }
    
    @js.native
    class Route () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var model: typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.RouteModel = js.native
      @JSName("properties")
      var properties_Route: Manager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def getPaths(): GeoObjectCollection = js.native
    }
    
    @js.native
    class RouteModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var multiRoute: MultiRouteModel = js.native
      var properties: Manager = js.native
      def destroy(): Unit = js.native
      def getPaths(): js.Array[typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.PathModel] = js.native
      def getType(): String = js.native
      def update(routeJson: js.Object): Unit = js.native
    }
    
    @js.native
    class StopModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var geometry: Point = js.native
      var properties: Manager = js.native
      var segment: TransportSegmentModel = js.native
      def update(stopJson: js.Object): Unit = js.native
    }
    
    @js.native
    class TransferSegment () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var model: TransferSegmentModel = js.native
      @JSName("properties")
      var properties_TransferSegment: Manager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
    }
    
    @js.native
    class TransferSegmentModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var geometry: LineString = js.native
      var path: typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.PathModel = js.native
      var properties: Manager = js.native
      def destroy(segmentJson: js.Object): Unit = js.native
      def getType(): String = js.native
    }
    
    @js.native
    class TransportSegment () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var model: TransportSegmentModel = js.native
      @JSName("properties")
      var properties_TransportSegment: Manager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
    }
    
    @js.native
    class TransportSegmentModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var geometry: LineString = js.native
      var path: typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.PathModel = js.native
      var properties: Manager = js.native
      def destroy(): Unit = js.native
      def getStops(): js.Array[StopModel] = js.native
      def getType(): String = js.native
      def update(segmentJson: js.Object): Unit = js.native
    }
    
    @js.native
    class WalkSegment () extends IGeoObject {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var model: WalkSegmentModel = js.native
      @JSName("properties")
      var properties_WalkSegment: Manager = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
    }
    
    @js.native
    class WalkSegmentModel () extends IEventEmitter {
      /* CompleteClass */
      override var events: IEventManager = js.native
      var geometry: LineString = js.native
      var path: typings.yandexDashMaps.yandexDashMapsMod.multiRouterNs.masstransitNs.PathModel = js.native
      var properties: Manager = js.native
      def destroy(): Unit = js.native
      def getType(): String = js.native
    }
    
  }
  
}

