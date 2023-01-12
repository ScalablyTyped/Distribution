package typings.unsplashJs

import typings.unsplashJs.anon.ResponseResponse
import typings.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typings.unsplashJs.distHelpersRequestMod.CompleteRequestParams
import typings.unsplashJs.distHelpersResponseMod.HandleResponse
import typings.unsplashJs.distMethodsSearchTypesRequestMod.ColorId
import typings.unsplashJs.distMethodsSearchTypesRequestMod.ContentFilter
import typings.unsplashJs.distMethodsSearchTypesRequestMod.Language
import typings.unsplashJs.distMethodsSearchTypesRequestMod.SearchOrderBy
import typings.unsplashJs.distMethodsSearchTypesResponseMod.Collections
import typings.unsplashJs.distMethodsSearchTypesResponseMod.Photos
import typings.unsplashJs.distMethodsSearchTypesResponseMod.Users
import typings.unsplashJs.distTypesRequestMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsSearchMod {
  
  object getCollections {
    
    @JSImport("unsplash-js/dist/methods/search", "getCollections")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
    inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/search", "getCollections.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Collections] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Collections] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Collections]]
    inline def handleResponse_=(x: HandleResponse[Collections]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getPhotos {
    
    @JSImport("unsplash-js/dist/methods/search", "getPhotos")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
    inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: SearchPhotosParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: SearchPhotosParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/search", "getPhotos.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Photos] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Photos] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Photos]]
    inline def handleResponse_=(x: HandleResponse[Photos]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getUsers {
    
    @JSImport("unsplash-js/dist/methods/search", "getUsers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
    inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/search", "getUsers.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Users] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Users] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Users]]
    inline def handleResponse_=(x: HandleResponse[Users]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  query :string} & std.Pick<unsplash-js.unsplash-js/dist/types/request.PaginationParams, 'page' | 'perPage'> */
  trait SearchParams extends StObject {
    
    var page: js.UndefOr[Double] = js.undefined
    
    var perPage: js.UndefOr[Double] = js.undefined
    
    var query: String
  }
  object SearchParams {
    
    inline def apply(query: String): SearchParams = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchParams] (val x: Self) extends AnyVal {
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined unsplash-js.unsplash-js/dist/methods/search.SearchParams & unsplash-js.unsplash-js/dist/types/request.OrientationParam & {  orderBy :unsplash-js.unsplash-js/dist/methods/search/types/request.SearchOrderBy | undefined,   color :unsplash-js.unsplash-js/dist/methods/search/types/request.ColorId | undefined,   lang :unsplash-js.unsplash-js/dist/methods/search/types/request.Language | undefined,   contentFilter :unsplash-js.unsplash-js/dist/methods/search/types/request.ContentFilter | undefined,   collectionIds :std.Array<string> | undefined} */
  trait SearchPhotosParams extends StObject {
    
    var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var color: js.UndefOr[ColorId] = js.undefined
    
    /**
      * API defaults to `"low"` if no value is provided
      */
    var contentFilter: js.UndefOr[ContentFilter] = js.undefined
    
    /**
      * API defaults to `en` (English) if no value is provided
      */
    var lang: js.UndefOr[Language] = js.undefined
    
    /**
      * API defaults to `"relevant"` if no value is provided
      */
    var orderBy: js.UndefOr[SearchOrderBy] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var perPage: js.UndefOr[Double] = js.undefined
    
    var query: String
  }
  object SearchPhotosParams {
    
    inline def apply(query: String): SearchPhotosParams = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchPhotosParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchPhotosParams] (val x: Self) extends AnyVal {
      
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
}
