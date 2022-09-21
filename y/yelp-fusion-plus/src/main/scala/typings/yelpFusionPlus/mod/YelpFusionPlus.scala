package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object YelpFusionPlus {
  
  @JSImport("yelp-fusion-plus", "YelpFusionPlus")
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateBusiness(business: Business): Business = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBusiness")(business.asInstanceOf[js.Any]).asInstanceOf[Business]
  
  inline def CreateLocationBusinessesSearchRequest(locationBusinessesSearchRequest: LocationBusinessesSearchRequest): LocationBusinessesSearchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateLocationBusinessesSearchRequest")(locationBusinessesSearchRequest.asInstanceOf[js.Any]).asInstanceOf[LocationBusinessesSearchRequest]
}
