package typings.unsplashJs

import typings.unsplashJs.anon.ResponseResponse
import typings.unsplashJs.anon.ResultsArray
import typings.unsplashJs.anon.ResultsTotal
import typings.unsplashJs.anon.statsbooleanundefinedOrie
import typings.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typings.unsplashJs.distHelpersRequestMod.CompleteRequestParams
import typings.unsplashJs.distHelpersResponseMod.HandleResponse
import typings.unsplashJs.distMethodsUsersTypesMod.Full
import typings.unsplashJs.distTypesRequestMod.OrientationParam
import typings.unsplashJs.distTypesRequestMod.PaginationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsUsersMod {
  
  object get {
    
    @JSImport("unsplash-js/dist/methods/users", "get")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: Username): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: Username, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/users", "get.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Full] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Full]]
    inline def handleResponse_=(x: HandleResponse[Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getCollections {
    
    @JSImport("unsplash-js/dist/methods/users", "getCollections")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/users", "getCollections.handleResponse")
    @js.native
    def handleResponse: HandleResponse[ResultsArray] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[ResultsArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsArray]]
    inline def handleResponse_=(x: HandleResponse[ResultsArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getLikes {
    
    @JSImport("unsplash-js/dist/methods/users", "getLikes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: OrientationParam & Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: OrientationParam & Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/users", "getLikes.handleResponse")
    @js.native
    def handleResponse: HandleResponse[ResultsTotal] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
    inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getPhotos {
    
    @JSImport("unsplash-js/dist/methods/users", "getPhotos")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: statsbooleanundefinedOrie): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: statsbooleanundefinedOrie, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/users", "getPhotos.handleResponse")
    @js.native
    def handleResponse: HandleResponse[ResultsTotal] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
    inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  trait Username extends StObject {
    
    var username: String
  }
  object Username {
    
    inline def apply(username: String): Username = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Username]
    }
    
    extension [Self <: Username](x: Self) {
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
