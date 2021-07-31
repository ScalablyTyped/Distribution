package typings.wixUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacesServiceStatusTypes extends StObject
@JSImport("wix-ui-core/dist/src/clients/GoogleMaps/types", "PlacesServiceStatusTypes")
@js.native
object PlacesServiceStatusTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlacesServiceStatusTypes & String] = js.native
  
  @js.native
  sealed trait InvalidRequest
    extends StObject
       with PlacesServiceStatusTypes
  /* "INVALID_REQUEST" */ val InvalidRequest: typings.wixUiCore.typesMod.PlacesServiceStatusTypes.InvalidRequest & String = js.native
  
  @js.native
  sealed trait NotFound
    extends StObject
       with PlacesServiceStatusTypes
  /* "NOT_FOUND" */ val NotFound: typings.wixUiCore.typesMod.PlacesServiceStatusTypes.NotFound & String = js.native
  
  @js.native
  sealed trait Ok
    extends StObject
       with PlacesServiceStatusTypes
  /* "OK" */ val Ok: typings.wixUiCore.typesMod.PlacesServiceStatusTypes.Ok & String = js.native
  
  @js.native
  sealed trait OverQueryLimit
    extends StObject
       with PlacesServiceStatusTypes
  /* "OVER_QUERY_LIMIT" */ val OverQueryLimit: typings.wixUiCore.typesMod.PlacesServiceStatusTypes.OverQueryLimit & String = js.native
  
  @js.native
  sealed trait RequestDenied
    extends StObject
       with PlacesServiceStatusTypes
  /* "REQUEST_DENIED" */ val RequestDenied: typings.wixUiCore.typesMod.PlacesServiceStatusTypes.RequestDenied & String = js.native
  
  @js.native
  sealed trait UnknownError
    extends StObject
       with PlacesServiceStatusTypes
  /* "UNKNOWN_ERROR" */ val UnknownError: typings.wixUiCore.typesMod.PlacesServiceStatusTypes.UnknownError & String = js.native
  
  @js.native
  sealed trait ZeroResults
    extends StObject
       with PlacesServiceStatusTypes
  /* "ZERO_RESULTS" */ val ZeroResults: typings.wixUiCore.typesMod.PlacesServiceStatusTypes.ZeroResults & String = js.native
}
