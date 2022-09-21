package typings.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typings.trimblemapsTrimblemapsJs.mod.Cancelable
import typings.trimblemapsTrimblemapsJs.mod.ReduceTripOptions
import typings.trimblemapsTrimblemapsJs.mod.RoadSurfaceRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Routing {
  
  @JSGlobal("TrimbleMaps.Routing")
  @js.native
  val ^ : js.Any = js.native
  
  inline def postDerivedRoutePath(options: ReduceTripOptions): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("postDerivedRoutePath")(options.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
  
  inline def postDerivedRouteReports(options: ReduceTripOptions): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("postDerivedRouteReports")(options.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
  
  inline def postRoadSurfaceRoute(options: RoadSurfaceRouteOptions): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("postRoadSurfaceRoute")(options.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
}
