package typings.typedRestClient

import typings.node.NodeJS.ReadableStream
import typings.typedRestClient.httpClientMod.HttpClient
import typings.typedRestClient.httpClientMod.HttpClientResponse
import typings.typedRestClient.interfacesMod.IHeaders
import typings.typedRestClient.interfacesMod.IRequestHandler
import typings.typedRestClient.interfacesMod.IRequestQueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  open class RestClient () extends StObject {
    def this(userAgent: String) = this()
    def this(userAgent: String, baseUrl: String) = this()
    def this(userAgent: Null, baseUrl: String) = this()
    def this(userAgent: Unit, baseUrl: String) = this()
    def this(userAgent: String, baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: String, baseUrl: Unit, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Null, baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Null, baseUrl: Unit, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Unit, baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Unit, baseUrl: Unit, handlers: js.Array[IRequestHandler]) = this()
    def this(
      userAgent: String,
      baseUrl: String,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: String,
      baseUrl: String,
      handlers: Unit,
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: String,
      baseUrl: Unit,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: String,
      baseUrl: Unit,
      handlers: Unit,
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: String,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: String,
      handlers: Unit,
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: Unit,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Null,
      baseUrl: Unit,
      handlers: Unit,
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Unit,
      baseUrl: String,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Unit,
      baseUrl: String,
      handlers: Unit,
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Unit,
      baseUrl: Unit,
      handlers: js.Array[IRequestHandler],
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    def this(
      userAgent: Unit,
      baseUrl: Unit,
      handlers: Unit,
      requestOptions: typings.typedRestClient.interfacesMod.IRequestOptions
    ) = this()
    
    /* private */ var _baseUrl: Any = js.native
    
    /* private */ var _headersFromOptions: Any = js.native
    
    var client: HttpClient = js.native
    
    /**
      * Creates resource(s) from an endpoint
      * T type of object returned.
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} resource - fully qualified or relative url
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def create[T](resource: String, resources: Any): js.Promise[IRestResponse[T]] = js.native
    def create[T](resource: String, resources: Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
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
    def replace[T](resource: String, resources: Any): js.Promise[IRestResponse[T]] = js.native
    def replace[T](resource: String, resources: Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
    /**
      * Updates resource(s) from an endpoint
      * T type of object returned.
      * Be aware that not found returns a null.  Other error conditions reject the promise
      * @param {string} resource - fully qualified or relative url
      * @param {IRequestOptions} requestOptions - (optional) requestOptions object
      */
    def update[T](resource: String, resources: Any): js.Promise[IRestResponse[T]] = js.native
    def update[T](resource: String, resources: Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
    
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
    def dateTimeDeserializer: Any = js.native
    inline def dateTimeDeserializer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTimeDeserializer")(x.asInstanceOf[js.Any])
  }
  
  trait IRequestOptions extends StObject {
    
    var acceptHeader: js.UndefOr[String] = js.undefined
    
    var additionalHeaders: js.UndefOr[IHeaders] = js.undefined
    
    var deserializeDates: js.UndefOr[Boolean] = js.undefined
    
    var queryParameters: js.UndefOr[IRequestQueryParams] = js.undefined
    
    var responseProcessor: js.UndefOr[js.Function] = js.undefined
  }
  object IRequestOptions {
    
    inline def apply(): IRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setAcceptHeader(value: String): Self = StObject.set(x, "acceptHeader", value.asInstanceOf[js.Any])
      
      inline def setAcceptHeaderUndefined: Self = StObject.set(x, "acceptHeader", js.undefined)
      
      inline def setAdditionalHeaders(value: IHeaders): Self = StObject.set(x, "additionalHeaders", value.asInstanceOf[js.Any])
      
      inline def setAdditionalHeadersUndefined: Self = StObject.set(x, "additionalHeaders", js.undefined)
      
      inline def setDeserializeDates(value: Boolean): Self = StObject.set(x, "deserializeDates", value.asInstanceOf[js.Any])
      
      inline def setDeserializeDatesUndefined: Self = StObject.set(x, "deserializeDates", js.undefined)
      
      inline def setQueryParameters(value: IRequestQueryParams): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setResponseProcessor(value: js.Function): Self = StObject.set(x, "responseProcessor", value.asInstanceOf[js.Any])
      
      inline def setResponseProcessorUndefined: Self = StObject.set(x, "responseProcessor", js.undefined)
    }
  }
  
  trait IRestResponse[T] extends StObject {
    
    var headers: js.Object
    
    var result: T | Null
    
    var statusCode: Double
  }
  object IRestResponse {
    
    inline def apply[T](headers: js.Object, statusCode: Double): IRestResponse[T] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], result = null)
      __obj.asInstanceOf[IRestResponse[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRestResponse[?], T] (val x: Self & IRestResponse[T]) extends AnyVal {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultNull: Self = StObject.set(x, "result", null)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
