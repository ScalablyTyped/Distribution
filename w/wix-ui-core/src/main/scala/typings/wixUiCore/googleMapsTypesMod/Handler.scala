package typings.wixUiCore.googleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Handler extends StObject
@JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/types", "Handler")
@js.native
object Handler extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Handler & String] = js.native
  
  @js.native
  sealed trait geocode
    extends StObject
       with Handler
  /* "geocode" */ val geocode: typings.wixUiCore.googleMapsTypesMod.Handler.geocode & String = js.native
  
  @js.native
  sealed trait places
    extends StObject
       with Handler
  /* "places" */ val places: typings.wixUiCore.googleMapsTypesMod.Handler.places & String = js.native
}
