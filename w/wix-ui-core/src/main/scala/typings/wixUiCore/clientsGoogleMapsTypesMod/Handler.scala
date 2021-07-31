package typings.wixUiCore.clientsGoogleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Handler extends StObject
@JSImport("wix-ui-core/src/clients/GoogleMaps/types", "Handler")
@js.native
object Handler extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Handler & String] = js.native
  
  @js.native
  sealed trait geocode
    extends StObject
       with Handler
  /* "geocode" */ val geocode: typings.wixUiCore.clientsGoogleMapsTypesMod.Handler.geocode & String = js.native
  
  @js.native
  sealed trait places
    extends StObject
       with Handler
  /* "places" */ val places: typings.wixUiCore.clientsGoogleMapsTypesMod.Handler.places & String = js.native
}
