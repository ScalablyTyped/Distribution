package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rail {
  
  @JSImport("@trimblemaps/trimblemaps-js", "Rail")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStations(options: RailStationRequest): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("getStations")(options.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
  
  inline def postRoutePath(options: RailRouteRequest): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("postRoutePath")(options.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
}
