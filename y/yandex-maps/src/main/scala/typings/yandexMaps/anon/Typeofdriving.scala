package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import typings.yandexMaps.mod.multiRouter.driving.Path
import typings.yandexMaps.mod.multiRouter.driving.PathModel
import typings.yandexMaps.mod.multiRouter.driving.Route
import typings.yandexMaps.mod.multiRouter.driving.RouteModel
import typings.yandexMaps.mod.multiRouter.driving.Segment
import typings.yandexMaps.mod.multiRouter.driving.SegmentModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdriving extends StObject {
  
  var Path: Instantiable0[typings.yandexMaps.mod.multiRouter.driving.Path]
  
  var PathModel: Instantiable0[typings.yandexMaps.mod.multiRouter.driving.PathModel]
  
  var Route: Instantiable0[typings.yandexMaps.mod.multiRouter.driving.Route]
  
  var RouteModel: Instantiable0[typings.yandexMaps.mod.multiRouter.driving.RouteModel]
  
  var Segment: Instantiable0[typings.yandexMaps.mod.multiRouter.driving.Segment]
  
  var SegmentModel: Instantiable0[typings.yandexMaps.mod.multiRouter.driving.SegmentModel]
}
object Typeofdriving {
  
  inline def apply(
    Path: Instantiable0[Path],
    PathModel: Instantiable0[PathModel],
    Route: Instantiable0[Route],
    RouteModel: Instantiable0[RouteModel],
    Segment: Instantiable0[Segment],
    SegmentModel: Instantiable0[SegmentModel]
  ): Typeofdriving = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], PathModel = PathModel.asInstanceOf[js.Any], Route = Route.asInstanceOf[js.Any], RouteModel = RouteModel.asInstanceOf[js.Any], Segment = Segment.asInstanceOf[js.Any], SegmentModel = SegmentModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdriving]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofdriving] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Instantiable0[Path]): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathModel(value: Instantiable0[PathModel]): Self = StObject.set(x, "PathModel", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: Instantiable0[Route]): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    inline def setRouteModel(value: Instantiable0[RouteModel]): Self = StObject.set(x, "RouteModel", value.asInstanceOf[js.Any])
    
    inline def setSegment(value: Instantiable0[Segment]): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentModel(value: Instantiable0[SegmentModel]): Self = StObject.set(x, "SegmentModel", value.asInstanceOf[js.Any])
  }
}
