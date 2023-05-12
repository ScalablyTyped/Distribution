package typings.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typings.trimblemapsTrimblemapsJs.anon.PlaceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Places {
  
  @JSGlobal("TrimbleMaps.Places")
  @js.native
  val ^ : js.Any = js.native
  
  inline def authenticate(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")().asInstanceOf[js.Promise[String]]
  
  inline def getPlace(options: PlaceId): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlace")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getPlaceDetails(options: PlaceId): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceDetails")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
