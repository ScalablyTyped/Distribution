package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<unsplash-js.unsplash-js/dist/types/request.PaginationParams, 'page' | 'perPage'> */
trait PickPaginationParamspagep extends StObject {
  
  var page: js.UndefOr[Double] = js.undefined
  
  var perPage: js.UndefOr[Double] = js.undefined
}
object PickPaginationParamspagep {
  
  inline def apply(): PickPaginationParamspagep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPaginationParamspagep]
  }
  
  extension [Self <: PickPaginationParamspagep](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
  }
}
