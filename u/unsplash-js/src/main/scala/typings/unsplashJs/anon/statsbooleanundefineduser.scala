package typings.unsplashJs.anon

import typings.unsplashJs.distTypesRequestMod.OrderBy
import typings.unsplashJs.distTypesRequestMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  stats :boolean | undefined,   username :string} & unsplash-js.unsplash-js/dist/types/request.OrientationParam & unsplash-js.unsplash-js/dist/types/request.PaginationParams */
trait statsbooleanundefineduser extends StObject {
  
  /**
    * API defaults to `"latest"` if no value is provided
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  /**
    * API defaults to `1` if no value is provided
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * API defaults to `10` if no value is provided
    */
  var perPage: js.UndefOr[Double] = js.undefined
  
  var stats: js.UndefOr[Boolean] = js.undefined
  
  var username: String
}
object statsbooleanundefineduser {
  
  inline def apply(username: String): statsbooleanundefineduser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[statsbooleanundefineduser]
  }
  
  extension [Self <: statsbooleanundefineduser](x: Self) {
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
