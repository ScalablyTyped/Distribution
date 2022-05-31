package typings.yandexMaps.global.ymaps

import typings.yandexMaps.anon.Dictindex
import typings.yandexMaps.mod.IMultiRouteModelJson
import typings.yandexMaps.mod.IMultiRouteParams
import typings.yandexMaps.mod.IMultiRouteReferencePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiRouter {
  
  @JSGlobal("ymaps.multiRouter.EditorAddon")
  @js.native
  class EditorAddon ()
    extends typings.yandexMaps.mod.multiRouter.EditorAddon
  
  @JSGlobal("ymaps.multiRouter.MultiRoute")
  @js.native
  class MultiRoute protected ()
    extends typings.yandexMaps.mod.multiRouter.MultiRoute {
    def this(model: IMultiRouteModelJson) = this()
    def this(model: typings.yandexMaps.mod.multiRouter.MultiRouteModel) = this()
    def this(model: IMultiRouteModelJson, options: Dictindex) = this()
    def this(model: typings.yandexMaps.mod.multiRouter.MultiRouteModel, options: Dictindex) = this()
  }
  
  @JSGlobal("ymaps.multiRouter.MultiRouteModel")
  @js.native
  class MultiRouteModel protected ()
    extends typings.yandexMaps.mod.multiRouter.MultiRouteModel {
    def this(referencePoints: js.Array[IMultiRouteReferencePoint]) = this()
    def this(referencePoints: js.Array[IMultiRouteReferencePoint], params: IMultiRouteParams) = this()
  }
  
  @JSGlobal("ymaps.multiRouter.ViaPoint")
  @js.native
  class ViaPoint ()
    extends typings.yandexMaps.mod.multiRouter.ViaPoint
  
  @JSGlobal("ymaps.multiRouter.ViaPointModel")
  @js.native
  class ViaPointModel ()
    extends typings.yandexMaps.mod.multiRouter.ViaPointModel
  
  @JSGlobal("ymaps.multiRouter.WayPoint")
  @js.native
  class WayPoint ()
    extends typings.yandexMaps.mod.multiRouter.WayPoint
  
  @JSGlobal("ymaps.multiRouter.WayPointModel")
  @js.native
  class WayPointModel ()
    extends typings.yandexMaps.mod.multiRouter.WayPointModel
  
  object driving {
    
    @JSGlobal("ymaps.multiRouter.driving.Path")
    @js.native
    class Path ()
      extends typings.yandexMaps.mod.multiRouter.driving.Path
    
    @JSGlobal("ymaps.multiRouter.driving.PathModel")
    @js.native
    class PathModel ()
      extends typings.yandexMaps.mod.multiRouter.driving.PathModel
    
    @JSGlobal("ymaps.multiRouter.driving.Route")
    @js.native
    class Route ()
      extends typings.yandexMaps.mod.multiRouter.driving.Route
    
    @JSGlobal("ymaps.multiRouter.driving.RouteModel")
    @js.native
    class RouteModel ()
      extends typings.yandexMaps.mod.multiRouter.driving.RouteModel
    
    @JSGlobal("ymaps.multiRouter.driving.Segment")
    @js.native
    class Segment ()
      extends typings.yandexMaps.mod.multiRouter.driving.Segment
    
    @JSGlobal("ymaps.multiRouter.driving.SegmentModel")
    @js.native
    class SegmentModel ()
      extends typings.yandexMaps.mod.multiRouter.driving.SegmentModel
  }
  
  object masstransit {
    
    @JSGlobal("ymaps.multiRouter.masstransit.Path")
    @js.native
    class Path ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.Path
    
    @JSGlobal("ymaps.multiRouter.masstransit.PathModel")
    @js.native
    class PathModel ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.PathModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.Route")
    @js.native
    class Route ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.Route
    
    @JSGlobal("ymaps.multiRouter.masstransit.RouteModel")
    @js.native
    class RouteModel ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.RouteModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.StopModel")
    @js.native
    class StopModel ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.StopModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransferSegment")
    @js.native
    class TransferSegment ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.TransferSegment
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransferSegmentModel")
    @js.native
    class TransferSegmentModel ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.TransferSegmentModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransportSegment")
    @js.native
    class TransportSegment ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.TransportSegment
    
    @JSGlobal("ymaps.multiRouter.masstransit.TransportSegmentModel")
    @js.native
    class TransportSegmentModel ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.TransportSegmentModel
    
    @JSGlobal("ymaps.multiRouter.masstransit.WalkSegment")
    @js.native
    class WalkSegment ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.WalkSegment
    
    @JSGlobal("ymaps.multiRouter.masstransit.WalkSegmentModel")
    @js.native
    class WalkSegmentModel ()
      extends typings.yandexMaps.mod.multiRouter.masstransit.WalkSegmentModel
  }
}
