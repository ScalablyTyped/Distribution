package typings.unsplashJs.anon

import typings.unsplashJs.distTypesRequestMod.OrderBy
import typings.unsplashJs.distTypesRequestMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  topicIdOrSlug :string} & unsplash-js.unsplash-js/dist/types/request.PaginationParams & unsplash-js.unsplash-js/dist/types/request.OrientationParam */
trait topicIdOrSlugstringPagina extends StObject {
  
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
  
  var topicIdOrSlug: String
}
object topicIdOrSlugstringPagina {
  
  inline def apply(topicIdOrSlug: String): topicIdOrSlugstringPagina = {
    val __obj = js.Dynamic.literal(topicIdOrSlug = topicIdOrSlug.asInstanceOf[js.Any])
    __obj.asInstanceOf[topicIdOrSlugstringPagina]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: topicIdOrSlugstringPagina] (val x: Self) extends AnyVal {
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setTopicIdOrSlug(value: String): Self = StObject.set(x, "topicIdOrSlug", value.asInstanceOf[js.Any])
  }
}
