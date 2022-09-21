package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.anon.AppId
import typings.unsplashJs.anon.DownloadLocation_
import typings.unsplashJs.anon.OmitStrictPaginationParamOrderBy
import typings.unsplashJs.anon.PickPaginationParamspagep
import typings.unsplashJs.anon.ResponseResponse
import typings.unsplashJs.anon.Results
import typings.unsplashJs.anon.ResultsArray
import typings.unsplashJs.anon.ResultsTotal
import typings.unsplashJs.anon.Total
import typings.unsplashJs.anon.Url
import typings.unsplashJs.anon.statsbooleanundefinedOrie
import typings.unsplashJs.collectionsMod.CollectionId
import typings.unsplashJs.distTypesRequestMod.OrientationParam
import typings.unsplashJs.distTypesRequestMod.PaginationParams
import typings.unsplashJs.photosMod.PhotoId
import typings.unsplashJs.photosMod.RandomParams
import typings.unsplashJs.photosTypesMod.Full
import typings.unsplashJs.photosTypesMod.Random
import typings.unsplashJs.photosTypesMod.Stats
import typings.unsplashJs.requestMod.AdditionalFetchOptions
import typings.unsplashJs.requestMod.CompleteRequestParams
import typings.unsplashJs.responseMod.HandleResponse
import typings.unsplashJs.searchMod.SearchParams
import typings.unsplashJs.searchMod.SearchPhotosParams
import typings.unsplashJs.topicsMod.TopicIdOrSlug
import typings.unsplashJs.typesResponseMod.Collections
import typings.unsplashJs.typesResponseMod.Photos
import typings.unsplashJs.typesResponseMod.Users
import typings.unsplashJs.usersMod.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalsMod {
  
  @JSImport("unsplash-js/dist/internals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object collections {
    
    object get {
      
      @JSImport("unsplash-js/dist/internals", "collections.get")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: CollectionId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "collections.get.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Any] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      inline def handleResponse_=(x: HandleResponse[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getPhotos {
      
      @JSImport("unsplash-js/dist/internals", "collections.getPhotos")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: CollectionId & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(
        a: CollectionId & PaginationParams & OrientationParam,
        additionalFetchOptions: AdditionalFetchOptions
      ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "collections.getPhotos.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Total] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
      inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getRelated {
      
      @JSImport("unsplash-js/dist/internals", "collections.getRelated")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: CollectionId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "collections.getRelated.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Any] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      inline def handleResponse_=(x: HandleResponse[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object list {
      
      @JSImport("unsplash-js/dist/internals", "collections.list")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: PickPaginationParamspagep): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: PickPaginationParamspagep, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "collections.list.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Total] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
      inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
  }
  
  object photos {
    
    object get {
      
      @JSImport("unsplash-js/dist/internals", "photos.get")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "photos.get.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Full] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Full]]
      inline def handleResponse_=(x: HandleResponse[Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getRandom {
      
      @JSImport("unsplash-js/dist/internals", "photos.getRandom")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: RandomParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: RandomParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "photos.getRandom.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Random | js.Array[Random]] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Random | js.Array[Random]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Random | js.Array[Random]]]
      inline def handleResponse_=(x: HandleResponse[Random | js.Array[Random]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getStats {
      
      @JSImport("unsplash-js/dist/internals", "photos.getStats")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "photos.getStats.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Stats] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
      inline def handleResponse_=(x: HandleResponse[Stats]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object list {
      
      @JSImport("unsplash-js/dist/internals", "photos.list")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
      inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "photos.list.handleResponse")
      @js.native
      def handleResponse: HandleResponse[ResultsTotal] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
      inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object trackDownload {
      
      @JSImport("unsplash-js/dist/internals", "photos.trackDownload")
      @js.native
      val ^ : js.Any = js.native
      
      inline def handleRequest(a: DownloadLocation_): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: DownloadLocation_, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "photos.trackDownload.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Url] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Url]]
      inline def handleResponse_=(x: HandleResponse[Url]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
  }
  
  object search {
    
    object getCollections {
      
      @JSImport("unsplash-js/dist/internals", "search.getCollections")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
      inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "search.getCollections.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Collections] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Collections] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Collections]]
      inline def handleResponse_=(x: HandleResponse[Collections]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getPhotos {
      
      @JSImport("unsplash-js/dist/internals", "search.getPhotos")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
      inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: SearchPhotosParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: SearchPhotosParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "search.getPhotos.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Photos] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Photos] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Photos]]
      inline def handleResponse_=(x: HandleResponse[Photos]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getUsers {
      
      @JSImport("unsplash-js/dist/internals", "search.getUsers")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
      inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "search.getUsers.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Users] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Users] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Users]]
      inline def handleResponse_=(x: HandleResponse[Users]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
  }
  
  object topics {
    
    object get {
      
      @JSImport("unsplash-js/dist/internals", "topics.get")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: TopicIdOrSlug): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "topics.get.handleResponse")
      @js.native
      def handleResponse: HandleResponse[typings.unsplashJs.topicsTypesMod.Full] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[typings.unsplashJs.topicsTypesMod.Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.unsplashJs.topicsTypesMod.Full]]
      inline def handleResponse_=(x: HandleResponse[typings.unsplashJs.topicsTypesMod.Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getPhotos {
      
      @JSImport("unsplash-js/dist/internals", "topics.getPhotos")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: TopicIdOrSlug & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(
        a: TopicIdOrSlug & PaginationParams & OrientationParam,
        additionalFetchOptions: AdditionalFetchOptions
      ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "topics.getPhotos.handleResponse")
      @js.native
      def handleResponse: HandleResponse[ResultsTotal] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
      inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object list {
      
      @JSImport("unsplash-js/dist/internals", "topics.list")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: OmitStrictPaginationParamOrderBy): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: OmitStrictPaginationParamOrderBy, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "topics.list.handleResponse")
      @js.native
      def handleResponse: HandleResponse[Results] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
      inline def handleResponse_=(x: HandleResponse[Results]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def trackNonHotLinkedPhotoView(hasAppId: AppId): js.Function1[/* hasPhotoId */ typings.unsplashJs.anon.PhotoId, js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackNonHotLinkedPhotoView")(hasAppId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasPhotoId */ typings.unsplashJs.anon.PhotoId, js.Promise[Response]]]
  
  object users {
    
    object get {
      
      @JSImport("unsplash-js/dist/internals", "users.get")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: Username): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: Username, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "users.get.handleResponse")
      @js.native
      def handleResponse: HandleResponse[typings.unsplashJs.usersTypesMod.Full] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[typings.unsplashJs.usersTypesMod.Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.unsplashJs.usersTypesMod.Full]]
      inline def handleResponse_=(x: HandleResponse[typings.unsplashJs.usersTypesMod.Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getCollections {
      
      @JSImport("unsplash-js/dist/internals", "users.getCollections")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "users.getCollections.handleResponse")
      @js.native
      def handleResponse: HandleResponse[ResultsArray] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[ResultsArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsArray]]
      inline def handleResponse_=(x: HandleResponse[ResultsArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getLikes {
      
      @JSImport("unsplash-js/dist/internals", "users.getLikes")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: OrientationParam & Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: OrientationParam & Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "users.getLikes.handleResponse")
      @js.native
      def handleResponse: HandleResponse[ResultsTotal] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
      inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
    
    object getPhotos {
      
      @JSImport("unsplash-js/dist/internals", "users.getPhotos")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def handleRequest(a: statsbooleanundefinedOrie): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
      inline def handleRequest(a: statsbooleanundefinedOrie, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
      
      @JSImport("unsplash-js/dist/internals", "users.getPhotos.handleResponse")
      @js.native
      def handleResponse: HandleResponse[ResultsTotal] = js.native
      inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
      inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
    }
  }
}
