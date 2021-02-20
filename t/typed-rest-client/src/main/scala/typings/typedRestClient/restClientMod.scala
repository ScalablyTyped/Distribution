package typings.typedRestClient

import typings.node.NodeJS.ReadableStream
import typings.typedRestClient.httpClientMod.HttpClient
import typings.typedRestClient.httpClientMod.HttpClientResponse
import typings.typedRestClient.interfacesMod.IHeaders
import typings.typedRestClient.interfacesMod.IRequestHandler
import typings.typedRestClient.interfacesMod.IRequestQueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restClientMod {
  
  @JSImport("typed-rest-client/RestClient", "RestClient")
  @js.native
  /**
    * Creates an instance of the RestClient
    * @constructor
    * @param {string} userAgent - userAgent for requests
    * @param {string} baseUrl - (Optional) If not specified, use full urls per request.  If supplied and a function passes a relative url, it will be appended to this
    * @param {ifm.IRequestHandler[]} handlers - handlers are typically auth handlers (basic, bearer, ntlm supplied)
    * @param {ifm.IRequestOptions} requestOptions - options for each http requests (http proxy setting, socket timeout)
    */
  class RestClient () extends StObject {
    def this(userAgent: String) = this()
    def this(userAgent: js.UndefOr[scala.Nothing], baseUrl: String) = this()
    def this(userAgent: String, baseUrl: String) = this()
    def this(userAgent: Null, baseUrl: String) = this()
    def this(
      userAgent: js.UndefOr[scala.Nothing],
      baseUrl: js.UndefOr[scala.Nothing],
      handlers: js.Array[IRequestHandler]
    ) = this()
    def this(userAgent: js.UndefOr[scala.Nothing], baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: String, baseUrl: js.UndefOr[scala.Nothing], handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: String, baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Null, baseUrl: js.UndefOr[scala.Nothing], handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Null, baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(
      userAgent: js.UndefOr[scala.Nothing],
      baseUrl: js.UndefOr[scala.Nothing],
      handlers: js.UndefOr[scala.Nothing],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: js.UndefOr[scala.Nothing],
      baseUrl: js.UndefOr[scala.Nothing],
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: js.UndefOr[scala.Nothing],
      baseUrl: String,
      handlers: js.UndefOr[scala.Nothing],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: js.UndefOr[scala.Nothing],
      baseUrl: String,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: String,
      baseUrl: js.UndefOr[scala.Nothing],
      handlers: js.UndefOr[scala.Nothing],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: String,
      baseUrl: js.UndefOr[scala.Nothing],
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: String,
      baseUrl: String,
      handlers: js.UndefOr[scala.Nothing],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: String,
      baseUrl: String,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: js.UndefOr[scala.Nothing],
      handlers: js.UndefOr[scala.Nothing],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: js.UndefOr[scala.Nothing],
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: String,
      handlers: js.UndefOr[scala.Nothing],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: String,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    
    var _baseUrl: js.Any = js.native
    
    var _headersFromOptions: js.Any = js.native
    
    var client: HttpClient = js.native
    
    /**
      * Creates resource(s) from an endpoint
      * T type of object returned.
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} resource - fully qualified or relative url
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def create[T](resource: String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
    def create[T](resource: String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    /**
      * Deletes a resource from an endpoint
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} resource - fully qualified or relative url
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def del[T](resource: String): js.Promise[IRestResponse[T]] = js.native
    def del[T](resource: String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    /**
      * Gets a resource from an endpoint
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} resource - fully qualified url or relative path
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def get[T](resource: String): js.Promise[IRestResponse[T]] = js.native
    def get[T](resource: String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    /**
      * Gets a resource from an endpoint
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} requestUrl - fully qualified or relative url
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def options[T](requestUrl: String): js.Promise[IRestResponse[T]] = js.native
    def options[T](requestUrl: String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    /* protected */ def processResponse[T](res: HttpClientResponse, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    /**
      * Replaces resource(s) from an endpoint
      * T type of object returned.
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} resource - fully qualified or relative url
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def replace[T](resource: String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
    def replace[T](resource: String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    /**
      * Updates resource(s) from an endpoint
      * T type of object returned.
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} resource - fully qualified or relative url
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def update[T](resource: String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
    def update[T](resource: String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    def uploadStream[T](verb: String, requestUrl: String, stream: ReadableStream): js.Promise[IRestResponse[T]] = js.native
    def uploadStream[T](verb: String, requestUrl: String, stream: ReadableStream, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    var versionParam: String = js.native
  }
  /* static members */
  object RestClient {
    
    @JSImport("typed-rest-client/RestClient", "RestClient")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typed-rest-client/RestClient", "RestClient.dateTimeDeserializer")
    @js.native
    def dateTimeDeserializer: js.Any = js.native
    @scala.inline
    def dateTimeDeserializer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTimeDeserializer")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IRequestOptions extends StObject {
    
    var acceptHeader: js.UndefOr[String] = js.native
    
    var additionalHeaders: js.UndefOr[IHeaders] = js.native
    
    var deserializeDates: js.UndefOr[Boolean] = js.native
    
    var queryParameters: js.UndefOr[IRequestQueryParams] = js.native
    
    var responseProcessor: js.UndefOr[js.Function] = js.native
  }
  object IRequestOptions {
    
    @scala.inline
    def apply(): IRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestOptions]
    }
    
    @scala.inline
    implicit class IRequestOptionsMutableBuilder[Self <: IRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptHeader(value: String): Self = StObject.set(x, "acceptHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptHeaderUndefined: Self = StObject.set(x, "acceptHeader", js.undefined)
      
      @scala.inline
      def setAdditionalHeaders(value: IHeaders): Self = StObject.set(x, "additionalHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalHeadersUndefined: Self = StObject.set(x, "additionalHeaders", js.undefined)
      
      @scala.inline
      def setDeserializeDates(value: Boolean): Self = StObject.set(x, "deserializeDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeserializeDatesUndefined: Self = StObject.set(x, "deserializeDates", js.undefined)
      
      @scala.inline
      def setQueryParameters(value: IRequestQueryParams): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      @scala.inline
      def setResponseProcessor(value: js.Function): Self = StObject.set(x, "responseProcessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseProcessorUndefined: Self = StObject.set(x, "responseProcessor", js.undefined)
    }
  }
  
  @js.native
  trait IRestResponse[T] extends StObject {
    
    var headers: js.Object = js.native
    
    var result: T | Null = js.native
    
    var statusCode: Double = js.native
  }
  object IRestResponse {
    
    @scala.inline
    def apply[T](headers: js.Object, statusCode: Double): IRestResponse[T] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRestResponse[T]]
    }
    
    @scala.inline
    implicit class IRestResponseMutableBuilder[Self <: IRestResponse[_], T] (val x: Self with IRestResponse[T]) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultNull: Self = StObject.set(x, "result", null)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
