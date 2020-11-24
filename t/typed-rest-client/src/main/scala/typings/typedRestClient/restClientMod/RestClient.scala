package typings.typedRestClient.restClientMod

import typings.node.NodeJS.ReadableStream
import typings.typedRestClient.httpClientMod.HttpClient
import typings.typedRestClient.httpClientMod.HttpClientResponse
import typings.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class RestClient () extends js.Object {
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
@JSImport("typed-rest-client/RestClient", "RestClient")
@js.native
object RestClient extends js.Object {
  
  var dateTimeDeserializer: js.Any = js.native
}
