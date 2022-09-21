package typings.unsplashJs.anon

import typings.unsplashJs.topicsMod.TopicOrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined unsplash-js.unsplash-js/dist/helpers/typescript.OmitStrict<unsplash-js.unsplash-js/dist/types/request.PaginationParams, 'orderBy'> & {  orderBy :unsplash-js.unsplash-js/dist/methods/topics.TopicOrderBy | undefined,   topicIdsOrSlugs :std.Array<string> | undefined} */
trait OmitStrictPaginationParamOrderBy extends StObject {
  
  /**
    * default: `position`
    */
  var orderBy: js.UndefOr[TopicOrderBy] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var perPage: js.UndefOr[Double] = js.undefined
  
  var topicIdsOrSlugs: js.UndefOr[js.Array[String]] = js.undefined
}
object OmitStrictPaginationParamOrderBy {
  
  inline def apply(): OmitStrictPaginationParamOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitStrictPaginationParamOrderBy]
  }
  
  extension [Self <: OmitStrictPaginationParamOrderBy](x: Self) {
    
    inline def setOrderBy(value: TopicOrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setTopicIdsOrSlugs(value: js.Array[String]): Self = StObject.set(x, "topicIdsOrSlugs", value.asInstanceOf[js.Any])
    
    inline def setTopicIdsOrSlugsUndefined: Self = StObject.set(x, "topicIdsOrSlugs", js.undefined)
    
    inline def setTopicIdsOrSlugsVarargs(value: String*): Self = StObject.set(x, "topicIdsOrSlugs", js.Array(value*))
  }
}
