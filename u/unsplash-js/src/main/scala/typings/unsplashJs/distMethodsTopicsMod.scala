package typings.unsplashJs

import typings.unsplashJs.anon.OmitStrictPaginationParamOrderBy
import typings.unsplashJs.anon.ResponseResponse
import typings.unsplashJs.anon.Results
import typings.unsplashJs.anon.ResultsTotal
import typings.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typings.unsplashJs.distHelpersRequestMod.CompleteRequestParams
import typings.unsplashJs.distHelpersResponseMod.HandleResponse
import typings.unsplashJs.distMethodsTopicsTypesMod.Full
import typings.unsplashJs.distTypesRequestMod.OrientationParam
import typings.unsplashJs.distTypesRequestMod.PaginationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsTopicsMod {
  
  object get {
    
    @JSImport("unsplash-js/dist/methods/topics", "get")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: TopicIdOrSlug): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/topics", "get.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Full] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Full]]
    inline def handleResponse_=(x: HandleResponse[Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getPhotos {
    
    @JSImport("unsplash-js/dist/methods/topics", "getPhotos")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: TopicIdOrSlug & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(
      a: TopicIdOrSlug & PaginationParams & OrientationParam,
      additionalFetchOptions: AdditionalFetchOptions
    ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/topics", "getPhotos.handleResponse")
    @js.native
    def handleResponse: HandleResponse[ResultsTotal] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
    inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object list {
    
    @JSImport("unsplash-js/dist/methods/topics", "list")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: OmitStrictPaginationParamOrderBy): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: OmitStrictPaginationParamOrderBy, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/topics", "list.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Results] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
    inline def handleResponse_=(x: HandleResponse[Results]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  trait TopicIdOrSlug extends StObject {
    
    var topicIdOrSlug: String
  }
  object TopicIdOrSlug {
    
    inline def apply(topicIdOrSlug: String): TopicIdOrSlug = {
      val __obj = js.Dynamic.literal(topicIdOrSlug = topicIdOrSlug.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicIdOrSlug]
    }
    
    extension [Self <: TopicIdOrSlug](x: Self) {
      
      inline def setTopicIdOrSlug(value: String): Self = StObject.set(x, "topicIdOrSlug", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.latest
    - typings.unsplashJs.unsplashJsStrings.oldest
    - typings.unsplashJs.unsplashJsStrings.position
    - typings.unsplashJs.unsplashJsStrings.featured
  */
  trait TopicOrderBy extends StObject
  object TopicOrderBy {
    
    inline def featured: typings.unsplashJs.unsplashJsStrings.featured = "featured".asInstanceOf[typings.unsplashJs.unsplashJsStrings.featured]
    
    inline def latest: typings.unsplashJs.unsplashJsStrings.latest = "latest".asInstanceOf[typings.unsplashJs.unsplashJsStrings.latest]
    
    inline def oldest: typings.unsplashJs.unsplashJsStrings.oldest = "oldest".asInstanceOf[typings.unsplashJs.unsplashJsStrings.oldest]
    
    inline def position: typings.unsplashJs.unsplashJsStrings.position = "position".asInstanceOf[typings.unsplashJs.unsplashJsStrings.position]
  }
}
