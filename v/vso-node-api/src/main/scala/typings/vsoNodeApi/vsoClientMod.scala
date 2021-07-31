package typings.vsoNodeApi

import typings.std.Error
import typings.typedRestClient.restClientMod.RestClient
import typings.vsoNodeApi.vsoBaseInterfacesMod.ApiResourceLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vsoClientMod {
  
  @JSImport("vso-node-api/VsoClient", "InvalidApiResourceVersionError")
  @js.native
  class InvalidApiResourceVersionError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("vso-node-api/VsoClient", "VsoClient")
  @js.native
  class VsoClient protected () extends StObject {
    def this(baseUrl: String, restClient: RestClient) = this()
    
    var _initializationPromise: js.Any = js.native
    
    var _locationsByAreaPromises: js.Any = js.native
    
    /**
      * Sets a promise that is waited on before any requests are issued. Can be used to asynchronously
      * set the request url and auth token manager.
      */
    def _setInitializationPromise(promise: js.Promise[js.Any]): Unit = js.native
    
    /* protected */ def autoNegotiateApiVersion(location: ApiResourceLocation, requestedVersion: String): String = js.native
    
    var basePath: String = js.native
    
    var baseUrl: String = js.native
    
    /* private */ def beginGetAreaLocations(area: js.Any): js.Any = js.native
    
    /**
      * Gets information about an API resource location (route template, supported versions, etc.)
      *
      * @param area resource area name
      * @param locationId Guid of the location to get
      */
    def beginGetLocation(area: String, locationId: String): js.Promise[ApiResourceLocation] = js.native
    
    /* protected */ def getRequestUrl(routeTemplate: String, area: String, resource: String, routeValues: js.Any): String = js.native
    /* protected */ def getRequestUrl(routeTemplate: String, area: String, resource: String, routeValues: js.Any, queryParams: js.Any): String = js.native
    
    /* private */ def getSerializedObject(`object`: js.Any): js.Any = js.native
    
    /**
      * Gets the route template for a resource based on its location ID and negotiates the api version
      */
    def getVersioningData(apiVersion: String, area: String, locationId: String, routeValues: js.Any): js.Promise[ClientVersioningData] = js.native
    def getVersioningData(apiVersion: String, area: String, locationId: String, routeValues: js.Any, queryParams: js.Any): js.Promise[ClientVersioningData] = js.native
    
    /* private */ def replaceRouteValues(routeTemplate: js.Any, routeValues: js.Any): js.Any = js.native
    
    def resolveUrl(relativeUrl: String): String = js.native
    
    var restClient: RestClient = js.native
  }
  /* static members */
  object VsoClient {
    
    @JSImport("vso-node-api/VsoClient", "VsoClient")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/VsoClient", "VsoClient.APIS_RELATIVE_PATH")
    @js.native
    def APIS_RELATIVE_PATH: js.Any = js.native
    @scala.inline
    def APIS_RELATIVE_PATH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APIS_RELATIVE_PATH")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/VsoClient", "VsoClient.PREVIEW_INDICATOR")
    @js.native
    def PREVIEW_INDICATOR: js.Any = js.native
    @scala.inline
    def PREVIEW_INDICATOR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREVIEW_INDICATOR")(x.asInstanceOf[js.Any])
  }
  
  trait ClientVersioningData extends StObject {
    
    /**
      * The api version string to send in the request (e.g. "1.0" or "2.0-preview.2")
      */
    var apiVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The request path string to send the request to.  Looked up via an options request with the location id.
      */
    var requestUrl: js.UndefOr[String] = js.undefined
  }
  object ClientVersioningData {
    
    @scala.inline
    def apply(): ClientVersioningData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientVersioningData]
    }
    
    @scala.inline
    implicit class ClientVersioningDataMutableBuilder[Self <: ClientVersioningData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
    }
  }
}
