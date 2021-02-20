package typings.yandexMaps.mod

import typings.yandexMaps.anon.Dictindex
import typings.yandexMaps.mod.data.Manager
import typings.yandexMaps.mod.geometry.base.LineString
import typings.yandexMaps.mod.geometry.base.Point
import typings.yandexMaps.mod.multiRouter.driving.Route
import typings.yandexMaps.mod.multiRouter.driving.RouteModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiRouter {
  
  @JSImport("yandex-maps", "multiRouter.EditorAddon")
  @js.native
  class EditorAddon () extends ICustomizable {
    
    def isActive(): Boolean = js.native
    
    def start(state: js.Object): Unit = js.native
    
    var state: Manager = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("yandex-maps", "multiRouter.MultiRoute")
  @js.native
  class MultiRoute protected () extends IGeoObject[IGeometry] {
    def this(model: IMultiRouteModelJson) = this()
    def this(model: MultiRouteModel) = this()
    def this(model: IMultiRouteModelJson, options: Dictindex) = this()
    def this(model: MultiRouteModel, options: Dictindex) = this()
    
    var editor: EditorAddon = js.native
    
    def getActiveRoute(): Route | typings.yandexMaps.mod.multiRouter.masstransit.Route | Null = js.native
    
    def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    def getRoutes(): GeoObjectCollection = js.native
    
    def getViaPoints(): GeoObjectCollection = js.native
    
    def getWayPoints(): GeoObjectCollection = js.native
    
    var model: MultiRouteModel = js.native
    
    def setActiveRoute(): Unit = js.native
    def setActiveRoute(route: Route): Unit = js.native
    def setActiveRoute(route: typings.yandexMaps.mod.multiRouter.masstransit.Route): Unit = js.native
  }
  
  @JSImport("yandex-maps", "multiRouter.MultiRouteModel")
  @js.native
  class MultiRouteModel protected () extends IEventEmitter {
    def this(referencePoints: js.Array[IMultiRouteReferencePoint]) = this()
    def this(referencePoints: js.Array[IMultiRouteReferencePoint], params: IMultiRouteParams) = this()
    
    def destroy(): Unit = js.native
    
    def getAllPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
    
    def getJson(): js.Object = js.native
    
    def getParams(): IMultiRouteParams = js.native
    
    def getPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
    
    def getReferencePointIndexes(): js.Object = js.native
    
    def getReferencePoints(): js.Array[IMultiRouteReferencePoint] = js.native
    
    def getRoutes(): js.Array[RouteModel | typings.yandexMaps.mod.multiRouter.masstransit.RouteModel] = js.native
    
    def getViaPoints(): js.Array[ViaPointModel] = js.native
    
    def getWayPoints(): js.Array[WayPointModel] = js.native
    
    var properties: Manager = js.native
    
    def setParams(params: IMultiRouteParams): Unit = js.native
    def setParams(params: IMultiRouteParams, extend: js.UndefOr[scala.Nothing], clearRequests: Boolean): Unit = js.native
    def setParams(params: IMultiRouteParams, extend: Boolean): Unit = js.native
    def setParams(params: IMultiRouteParams, extend: Boolean, clearRequests: Boolean): Unit = js.native
    
    def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint]): Unit = js.native
    def setReferencePoints(
      referencePoints: js.Array[IMultiRouteReferencePoint],
      viaIndexes: js.UndefOr[scala.Nothing],
      clearRequests: Boolean
    ): Unit = js.native
    def setReferencePoints(referencePoints: js.Array[IMultiRouteReferencePoint], viaIndexes: js.Array[Double]): Unit = js.native
    def setReferencePoints(
      referencePoints: js.Array[IMultiRouteReferencePoint],
      viaIndexes: js.Array[Double],
      clearRequests: Boolean
    ): Unit = js.native
  }
  
  @JSImport("yandex-maps", "multiRouter.ViaPoint")
  @js.native
  class ViaPoint () extends IGeoObject[IGeometry] {
    
    @JSName("properties")
    var properties_ViaPoint: Manager = js.native
  }
  
  @JSImport("yandex-maps", "multiRouter.ViaPointModel")
  @js.native
  class ViaPointModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    var geometry: Point = js.native
    
    def getReferencePoint(): js.Object = js.native
    
    def getReferencePointIndex(): Double = js.native
    
    var multiRoute: MultiRouteModel = js.native
    
    var properties: Manager = js.native
    
    def setReferencePoint(referencePoint: js.Object): Unit = js.native
    
    def update(viaPointJson: js.Object): Unit = js.native
  }
  
  @JSImport("yandex-maps", "multiRouter.WayPoint")
  @js.native
  class WayPoint () extends IGeoObject[IGeometry] {
    
    var model: WayPointModel = js.native
    
    @JSName("properties")
    var properties_WayPoint: Manager = js.native
  }
  
  @JSImport("yandex-maps", "multiRouter.WayPointModel")
  @js.native
  class WayPointModel () extends IEventEmitter {
    
    def destroy(): Unit = js.native
    
    var geometry: Point = js.native
    
    def getReferencePoint(): js.Object = js.native
    
    def getReferencePointIndex(): Double = js.native
    
    var multiRoute: MultiRouteModel = js.native
    
    var properties: Manager = js.native
    
    def setReferencePoint(referencePoint: js.Object): Unit = js.native
    
    def update(wayPointJson: js.Object): Unit = js.native
  }
  
  object driving {
    
    @JSImport("yandex-maps", "multiRouter.driving.Path")
    @js.native
    class Path () extends IGeoObject[IGeometry] {
      
      def getSegments(): GeoObjectCollection = js.native
      
      var model: PathModel = js.native
      
      @JSName("properties")
      var properties_Path: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.driving.PathModel")
    @js.native
    class PathModel () extends IEventEmitter {
      
      def destroy(): Unit = js.native
      
      def getSegments(): js.Array[SegmentModel] = js.native
      
      def getType(): String = js.native
      
      var properties: Manager = js.native
      
      var route: RouteModel = js.native
      
      def update(pathJson: js.Object): Unit = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.driving.Route")
    @js.native
    class Route () extends IGeoObject[IGeometry] {
      
      def getPaths(): GeoObjectCollection = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.driving.RouteModel")
    @js.native
    class RouteModel () extends IEventEmitter {
      
      def destroy(): Unit = js.native
      
      def getPaths(): js.Array[PathModel] = js.native
      
      def getType(): String = js.native
      
      var multiRoute: MultiRouteModel = js.native
      
      var properties: Manager = js.native
      
      def update(routeJson: js.Object): Unit = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.driving.Segment")
    @js.native
    class Segment () extends IGeoObject[IGeometry] {
      
      @JSName("properties")
      var properties_Segment: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.driving.SegmentModel")
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
  
  object masstransit {
    
    @JSImport("yandex-maps", "multiRouter.masstransit.Path")
    @js.native
    class Path () extends IGeoObject[IGeometry] {
      
      def getSegmentMarkers(): GeoObjectCollection = js.native
      
      def getSegments(): GeoObjectCollection = js.native
      
      var model: PathModel = js.native
      
      @JSName("properties")
      var properties_Path: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.PathModel")
    @js.native
    class PathModel () extends IEventEmitter {
      
      def destroy(): Unit = js.native
      
      def getSegments(): js.Array[TransferSegmentModel | TransportSegmentModel | WalkSegmentModel] = js.native
      
      def getType(): String = js.native
      
      var properties: Manager = js.native
      
      var route: typings.yandexMaps.mod.multiRouter.masstransit.RouteModel = js.native
      
      def update(pathJson: js.Object): Unit = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.Route")
    @js.native
    class Route () extends IGeoObject[IGeometry] {
      
      def getPaths(): GeoObjectCollection = js.native
      
      var model: typings.yandexMaps.mod.multiRouter.masstransit.RouteModel = js.native
      
      @JSName("properties")
      var properties_Route: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.RouteModel")
    @js.native
    class RouteModel () extends IEventEmitter {
      
      def destroy(): Unit = js.native
      
      def getPaths(): js.Array[PathModel] = js.native
      
      def getType(): String = js.native
      
      var multiRoute: MultiRouteModel = js.native
      
      var properties: Manager = js.native
      
      def update(routeJson: js.Object): Unit = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.StopModel")
    @js.native
    class StopModel () extends IEventEmitter {
      
      var geometry: Point = js.native
      
      var properties: Manager = js.native
      
      var segment: TransportSegmentModel = js.native
      
      def update(stopJson: js.Object): Unit = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.TransferSegment")
    @js.native
    class TransferSegment () extends IGeoObject[IGeometry] {
      
      var model: TransferSegmentModel = js.native
      
      @JSName("properties")
      var properties_TransferSegment: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.TransferSegmentModel")
    @js.native
    class TransferSegmentModel () extends IEventEmitter {
      
      def destroy(segmentJson: js.Object): Unit = js.native
      
      var geometry: LineString = js.native
      
      def getType(): String = js.native
      
      var path: PathModel = js.native
      
      var properties: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.TransportSegment")
    @js.native
    class TransportSegment () extends IGeoObject[IGeometry] {
      
      var model: TransportSegmentModel = js.native
      
      @JSName("properties")
      var properties_TransportSegment: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.TransportSegmentModel")
    @js.native
    class TransportSegmentModel () extends IEventEmitter {
      
      def destroy(): Unit = js.native
      
      var geometry: LineString = js.native
      
      def getStops(): js.Array[StopModel] = js.native
      
      def getType(): String = js.native
      
      var path: PathModel = js.native
      
      var properties: Manager = js.native
      
      def update(segmentJson: js.Object): Unit = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.WalkSegment")
    @js.native
    class WalkSegment () extends IGeoObject[IGeometry] {
      
      var model: WalkSegmentModel = js.native
      
      @JSName("properties")
      var properties_WalkSegment: Manager = js.native
    }
    
    @JSImport("yandex-maps", "multiRouter.masstransit.WalkSegmentModel")
    @js.native
    class WalkSegmentModel () extends IEventEmitter {
      
      def destroy(): Unit = js.native
      
      var geometry: LineString = js.native
      
      def getType(): String = js.native
      
      var path: PathModel = js.native
      
      var properties: Manager = js.native
    }
  }
}
