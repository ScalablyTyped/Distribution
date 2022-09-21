package typings.unsplashJs.anon

import typings.unsplashJs.distTypesRequestMod.OrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  username :string} & unsplash-js.unsplash-js/dist/types/request.PaginationParams */
trait usernamestringPaginationP extends StObject {
  
  /**
    * API defaults to `"latest"` if no value is provided
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
  
  /**
    * API defaults to `1` if no value is provided
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * API defaults to `10` if no value is provided
    */
  var perPage: js.UndefOr[Double] = js.undefined
  
  var username: String
}
object usernamestringPaginationP {
  
  inline def apply(username: String): usernamestringPaginationP = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[usernamestringPaginationP]
  }
  
  extension [Self <: usernamestringPaginationP](x: Self) {
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
