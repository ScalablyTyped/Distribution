package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter")
@js.native
object multiRouterNs extends js.Object {
  @js.native
  class EditorAddon ()
    extends yandexDashMapsLib.yandexDashMapsMod.ICustomizable {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    var state: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def isActive(): scala.Boolean = js.native
    def start(state: js.Object): scala.Unit = js.native
    def stop(): scala.Unit = js.native
  }
  
  @js.native
  class MultiRoute protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
    def this(model: yandexDashMapsLib.yandexDashMapsMod.IMultiRouteModelJson) = this()
    def this(model: MultiRouteModel) = this()
    def this(model: yandexDashMapsLib.yandexDashMapsMod.IMultiRouteModelJson, options: yandexDashMapsLib.Anon_ActiveRouteAutoSelection) = this()
    def this(model: MultiRouteModel, options: yandexDashMapsLib.Anon_ActiveRouteAutoSelection) = this()
    var editor: EditorAddon = js.native
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var model: MultiRouteModel = js.native
    def getActiveRoute(): yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.drivingNs.Route | yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.masstransitNs.Route | scala.Null = js.native
    def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
    /* CompleteClass */
    override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    def getPixelBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
    def getRoutes(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    def getViaPoints(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    def getWayPoints(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    def setActiveRoute(): scala.Unit = js.native
    def setActiveRoute(route: yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.drivingNs.Route): scala.Unit = js.native
    def setActiveRoute(route: yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.masstransitNs.Route): scala.Unit = js.native
  }
  
  @js.native
  class MultiRouteModel protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
    def this(referencePoints: js.Array[yandexDashMapsLib.yandexDashMapsMod.IMultiRouteReferencePoint]) = this()
    def this(referencePoints: js.Array[yandexDashMapsLib.yandexDashMapsMod.IMultiRouteReferencePoint], params: yandexDashMapsLib.yandexDashMapsMod.IMultiRouteParams) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def destroy(): scala.Unit = js.native
    def getAllPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
    def getJson(): js.Object = js.native
    def getParams(): yandexDashMapsLib.yandexDashMapsMod.IMultiRouteParams = js.native
    def getPoints(): js.Array[WayPointModel | ViaPointModel] = js.native
    def getReferencePointIndexes(): js.Object = js.native
    def getReferencePoints(): js.Array[yandexDashMapsLib.yandexDashMapsMod.IMultiRouteReferencePoint] = js.native
    def getRoutes(): js.Array[yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.drivingNs.RouteModel] | js.Array[yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.masstransitNs.RouteModel] = js.native
    def getViaPoints(): js.Array[ViaPointModel] = js.native
    def getWayPoints(): js.Array[WayPointModel] = js.native
    def setParams(params: yandexDashMapsLib.yandexDashMapsMod.IMultiRouteParams): scala.Unit = js.native
    def setParams(params: yandexDashMapsLib.yandexDashMapsMod.IMultiRouteParams, extend: scala.Boolean): scala.Unit = js.native
    def setParams(
      params: yandexDashMapsLib.yandexDashMapsMod.IMultiRouteParams,
      extend: scala.Boolean,
      clearRequests: scala.Boolean
    ): scala.Unit = js.native
    def setReferencePoints(referencePoints: js.Array[yandexDashMapsLib.yandexDashMapsMod.IMultiRouteReferencePoint]): scala.Unit = js.native
    def setReferencePoints(
      referencePoints: js.Array[yandexDashMapsLib.yandexDashMapsMod.IMultiRouteReferencePoint],
      viaIndexes: js.Array[scala.Double]
    ): scala.Unit = js.native
    def setReferencePoints(
      referencePoints: js.Array[yandexDashMapsLib.yandexDashMapsMod.IMultiRouteReferencePoint],
      viaIndexes: js.Array[scala.Double],
      clearRequests: scala.Boolean
    ): scala.Unit = js.native
  }
  
  @js.native
  class ViaPoint ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    @JSName("properties")
    var properties_ViaPoint: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
  }
  
  @js.native
  class ViaPointModel ()
    extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.Point = js.native
    var multiRoute: MultiRouteModel = js.native
    var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def destroy(): scala.Unit = js.native
    def getReferencePoint(): js.Object = js.native
    def getReferencePointIndex(): scala.Double = js.native
    def setReferencePoint(referencePoint: js.Object): scala.Unit = js.native
    def update(viaPointJson: js.Object): scala.Unit = js.native
  }
  
  @js.native
  class WayPoint ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var model: WayPointModel = js.native
    @JSName("properties")
    var properties_WayPoint: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
  }
  
  @js.native
  class WayPointModel ()
    extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.Point = js.native
    var multiRoute: MultiRouteModel = js.native
    var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def destroy(): scala.Unit = js.native
    def getReferencePoint(): js.Object = js.native
    def getReferencePointIndex(): scala.Double = js.native
    def setReferencePoint(referencePoint: js.Object): scala.Unit = js.native
    def update(wayPointJson: js.Object): scala.Unit = js.native
  }
  
  @JSName("driving")
  @js.native
  object drivingNs extends js.Object {
    @js.native
    class Path ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var model: PathModel = js.native
      @JSName("properties")
      var properties_Path: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
      def getSegments(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    }
    
    @js.native
    class PathModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      var route: RouteModel = js.native
      def destroy(): scala.Unit = js.native
      def getSegments(): js.Array[SegmentModel] = js.native
      def getType(): java.lang.String = js.native
      def update(pathJson: js.Object): scala.Unit = js.native
    }
    
    @js.native
    class Route ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
      def getPaths(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    }
    
    @js.native
    class RouteModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var multiRoute: yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.MultiRouteModel = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      def destroy(): scala.Unit = js.native
      def getPaths(): js.Array[PathModel] = js.native
      def getType(): java.lang.String = js.native
      def update(routeJson: js.Object): scala.Unit = js.native
    }
    
    @js.native
    class Segment ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      @JSName("properties")
      var properties_Segment: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    }
    
    @js.native
    class SegmentModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.LineString = js.native
      var path: PathModel = js.native
      def destroy(): scala.Unit = js.native
      def getType(): java.lang.String = js.native
      def getViaPoints(): js.Array[yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.ViaPointModel] = js.native
      def update(segmentJson: js.Object): scala.Unit = js.native
    }
    
  }
  
  @JSName("masstransit")
  @js.native
  object masstransitNs extends js.Object {
    @js.native
    class Path ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var model: PathModel = js.native
      @JSName("properties")
      var properties_Path: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
      def getSegmentMarkers(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
      def getSegments(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    }
    
    @js.native
    class PathModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      var route: RouteModel = js.native
      def destroy(): scala.Unit = js.native
      def getSegments(): js.Array[TransferSegmentModel | TransportSegmentModel | WalkSegmentModel] = js.native
      def getType(): java.lang.String = js.native
      def update(pathJson: js.Object): scala.Unit = js.native
    }
    
    @js.native
    class Route ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var model: RouteModel = js.native
      @JSName("properties")
      var properties_Route: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
      def getPaths(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    }
    
    @js.native
    class RouteModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var multiRoute: yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.MultiRouteModel = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      def destroy(): scala.Unit = js.native
      def getPaths(): js.Array[PathModel] = js.native
      def getType(): java.lang.String = js.native
      def update(routeJson: js.Object): scala.Unit = js.native
    }
    
    @js.native
    class StopModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.Point = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      var segment: TransportSegmentModel = js.native
      def update(stopJson: js.Object): scala.Unit = js.native
    }
    
    @js.native
    class TransferSegment ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var model: TransferSegmentModel = js.native
      @JSName("properties")
      var properties_TransferSegment: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    }
    
    @js.native
    class TransferSegmentModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.LineString = js.native
      var path: PathModel = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      def destroy(segmentJson: js.Object): scala.Unit = js.native
      def getType(): java.lang.String = js.native
    }
    
    @js.native
    class TransportSegment ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var model: TransportSegmentModel = js.native
      @JSName("properties")
      var properties_TransportSegment: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    }
    
    @js.native
    class TransportSegmentModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.LineString = js.native
      var path: PathModel = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      def destroy(): scala.Unit = js.native
      def getStops(): js.Array[StopModel] = js.native
      def getType(): java.lang.String = js.native
      def update(segmentJson: js.Object): scala.Unit = js.native
    }
    
    @js.native
    class WalkSegment ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var model: WalkSegmentModel = js.native
      @JSName("properties")
      var properties_WalkSegment: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    }
    
    @js.native
    class WalkSegmentModel ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var geometry: yandexDashMapsLib.yandexDashMapsMod.geometryNs.baseNs.LineString = js.native
      var path: PathModel = js.native
      var properties: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
      def destroy(): scala.Unit = js.native
      def getType(): java.lang.String = js.native
    }
    
  }
  
}

