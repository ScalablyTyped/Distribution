package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.yandexMaps.mod.IMultiRouteModelJson
import typings.yandexMaps.mod.IMultiRouteParams
import typings.yandexMaps.mod.IMultiRouteReferencePoint
import typings.yandexMaps.mod.multiRouter.EditorAddon
import typings.yandexMaps.mod.multiRouter.MultiRoute
import typings.yandexMaps.mod.multiRouter.MultiRouteModel
import typings.yandexMaps.mod.multiRouter.ViaPoint
import typings.yandexMaps.mod.multiRouter.ViaPointModel
import typings.yandexMaps.mod.multiRouter.WayPoint
import typings.yandexMaps.mod.multiRouter.WayPointModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofmultiRouter extends StObject {
  
  var EditorAddon: Instantiable0[typings.yandexMaps.mod.multiRouter.EditorAddon]
  
  var MultiRoute: Instantiable2[
    /* model */ MultiRouteModel | IMultiRouteModelJson, 
    /* options */ js.UndefOr[Dictindex], 
    typings.yandexMaps.mod.multiRouter.MultiRoute
  ]
  
  var MultiRouteModel: Instantiable2[
    /* referencePoints */ js.Array[IMultiRouteReferencePoint], 
    /* params */ js.UndefOr[IMultiRouteParams], 
    typings.yandexMaps.mod.multiRouter.MultiRouteModel
  ]
  
  var ViaPoint: Instantiable0[typings.yandexMaps.mod.multiRouter.ViaPoint]
  
  var ViaPointModel: Instantiable0[typings.yandexMaps.mod.multiRouter.ViaPointModel]
  
  var WayPoint: Instantiable0[typings.yandexMaps.mod.multiRouter.WayPoint]
  
  var WayPointModel: Instantiable0[typings.yandexMaps.mod.multiRouter.WayPointModel]
  
  val driving: Typeofdriving
  
  val masstransit: Typeofmasstransit
}
object TypeofmultiRouter {
  
  inline def apply(
    EditorAddon: Instantiable0[EditorAddon],
    MultiRoute: Instantiable2[
      /* model */ MultiRouteModel | IMultiRouteModelJson, 
      /* options */ js.UndefOr[Dictindex], 
      MultiRoute
    ],
    MultiRouteModel: Instantiable2[
      /* referencePoints */ js.Array[IMultiRouteReferencePoint], 
      /* params */ js.UndefOr[IMultiRouteParams], 
      MultiRouteModel
    ],
    ViaPoint: Instantiable0[ViaPoint],
    ViaPointModel: Instantiable0[ViaPointModel],
    WayPoint: Instantiable0[WayPoint],
    WayPointModel: Instantiable0[WayPointModel],
    driving: Typeofdriving,
    masstransit: Typeofmasstransit
  ): TypeofmultiRouter = {
    val __obj = js.Dynamic.literal(EditorAddon = EditorAddon.asInstanceOf[js.Any], MultiRoute = MultiRoute.asInstanceOf[js.Any], MultiRouteModel = MultiRouteModel.asInstanceOf[js.Any], ViaPoint = ViaPoint.asInstanceOf[js.Any], ViaPointModel = ViaPointModel.asInstanceOf[js.Any], WayPoint = WayPoint.asInstanceOf[js.Any], WayPointModel = WayPointModel.asInstanceOf[js.Any], driving = driving.asInstanceOf[js.Any], masstransit = masstransit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofmultiRouter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofmultiRouter] (val x: Self) extends AnyVal {
    
    inline def setDriving(value: Typeofdriving): Self = StObject.set(x, "driving", value.asInstanceOf[js.Any])
    
    inline def setEditorAddon(value: Instantiable0[EditorAddon]): Self = StObject.set(x, "EditorAddon", value.asInstanceOf[js.Any])
    
    inline def setMasstransit(value: Typeofmasstransit): Self = StObject.set(x, "masstransit", value.asInstanceOf[js.Any])
    
    inline def setMultiRoute(
      value: Instantiable2[
          /* model */ MultiRouteModel | IMultiRouteModelJson, 
          /* options */ js.UndefOr[Dictindex], 
          MultiRoute
        ]
    ): Self = StObject.set(x, "MultiRoute", value.asInstanceOf[js.Any])
    
    inline def setMultiRouteModel(
      value: Instantiable2[
          /* referencePoints */ js.Array[IMultiRouteReferencePoint], 
          /* params */ js.UndefOr[IMultiRouteParams], 
          MultiRouteModel
        ]
    ): Self = StObject.set(x, "MultiRouteModel", value.asInstanceOf[js.Any])
    
    inline def setViaPoint(value: Instantiable0[ViaPoint]): Self = StObject.set(x, "ViaPoint", value.asInstanceOf[js.Any])
    
    inline def setViaPointModel(value: Instantiable0[ViaPointModel]): Self = StObject.set(x, "ViaPointModel", value.asInstanceOf[js.Any])
    
    inline def setWayPoint(value: Instantiable0[WayPoint]): Self = StObject.set(x, "WayPoint", value.asInstanceOf[js.Any])
    
    inline def setWayPointModel(value: Instantiable0[WayPointModel]): Self = StObject.set(x, "WayPointModel", value.asInstanceOf[js.Any])
  }
}
