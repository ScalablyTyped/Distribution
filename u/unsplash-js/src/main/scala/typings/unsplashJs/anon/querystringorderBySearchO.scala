package typings.unsplashJs.anon

import typings.unsplashJs.distTypesRequestMod.Orientation
import typings.unsplashJs.typesRequestMod.ColorId
import typings.unsplashJs.typesRequestMod.ContentFilter
import typings.unsplashJs.typesRequestMod.Language
import typings.unsplashJs.typesRequestMod.SearchOrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  query :string,   orderBy :unsplash-js.unsplash-js/dist/methods/search/types/request.SearchOrderBy | undefined,   color :unsplash-js.unsplash-js/dist/methods/search/types/request.ColorId | undefined,   lang :unsplash-js.unsplash-js/dist/methods/search/types/request.Language | undefined,   contentFilter :unsplash-js.unsplash-js/dist/methods/search/types/request.ContentFilter | undefined,   collectionIds :std.Array<string> | undefined} & std.Pick<unsplash-js.unsplash-js/dist/types/request.PaginationParams, 'page' | 'perPage'> & unsplash-js.unsplash-js/dist/types/request.OrientationParam */
trait querystringorderBySearchO extends StObject {
  
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var color: js.UndefOr[ColorId] = js.undefined
  
  var contentFilter: js.UndefOr[ContentFilter] = js.undefined
  
  var lang: js.UndefOr[Language] = js.undefined
  
  var orderBy: js.UndefOr[SearchOrderBy] = js.undefined
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var perPage: js.UndefOr[Double] = js.undefined
  
  var query: String
}
object querystringorderBySearchO {
  
  inline def apply(query: String): querystringorderBySearchO = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[querystringorderBySearchO]
  }
  
  extension [Self <: querystringorderBySearchO](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setColor(value: ColorId): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentFilter(value: ContentFilter): Self = StObject.set(x, "contentFilter", value.asInstanceOf[js.Any])
    
    inline def setContentFilterUndefined: Self = StObject.set(x, "contentFilter", js.undefined)
    
    inline def setLang(value: Language): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOrderBy(value: SearchOrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
