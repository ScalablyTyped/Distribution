package typings
package typedDashRestDashClientLib.restclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/RestClient", "RestClient")
@js.native
class RestClient protected () extends js.Object {
  /**
       * Creates an instance of the RestClient
       * @constructor
       * @param {string} userAgent - userAgent for requests
       * @param {string} baseUrl - (Optional) If not specified, use full urls per request.  If supplied and a function passes a relative url, it will be appended to this
       * @param {ifm.IRequestHandler[]} handlers - handlers are typically auth handlers (basic, bearer, ntlm supplied)
       * @param {ifm.IRequestOptions} requestOptions - options for each http requests (http proxy setting, socket timeout)
       */
  def this(userAgent: java.lang.String) = this()
  /**
       * Creates an instance of the RestClient
       * @constructor
       * @param {string} userAgent - userAgent for requests
       * @param {string} baseUrl - (Optional) If not specified, use full urls per request.  If supplied and a function passes a relative url, it will be appended to this
       * @param {ifm.IRequestHandler[]} handlers - handlers are typically auth handlers (basic, bearer, ntlm supplied)
       * @param {ifm.IRequestOptions} requestOptions - options for each http requests (http proxy setting, socket timeout)
       */
  def this(userAgent: java.lang.String, baseUrl: java.lang.String) = this()
  /**
       * Creates an instance of the RestClient
       * @constructor
       * @param {string} userAgent - userAgent for requests
       * @param {string} baseUrl - (Optional) If not specified, use full urls per request.  If supplied and a function passes a relative url, it will be appended to this
       * @param {ifm.IRequestHandler[]} handlers - handlers are typically auth handlers (basic, bearer, ntlm supplied)
       * @param {ifm.IRequestOptions} requestOptions - options for each http requests (http proxy setting, socket timeout)
       */
  def this(userAgent: java.lang.String, baseUrl: java.lang.String, handlers: js.Array[typedDashRestDashClientLib.interfacesMod.IRequestHandler]) = this()
  /**
       * Creates an instance of the RestClient
       * @constructor
       * @param {string} userAgent - userAgent for requests
       * @param {string} baseUrl - (Optional) If not specified, use full urls per request.  If supplied and a function passes a relative url, it will be appended to this
       * @param {ifm.IRequestHandler[]} handlers - handlers are typically auth handlers (basic, bearer, ntlm supplied)
       * @param {ifm.IRequestOptions} requestOptions - options for each http requests (http proxy setting, socket timeout)
       */
  def this(userAgent: java.lang.String, baseUrl: java.lang.String, handlers: js.Array[typedDashRestDashClientLib.interfacesMod.IRequestHandler], requestOptions: typedDashRestDashClientLib.interfacesMod.IRequestOptions) = this()
  var _baseUrl: js.Any = js.native
  var client: typedDashRestDashClientLib.httpclientMod.HttpClient = js.native
  var versionParam: java.lang.String = js.native
  /* private */ def _headersFromOptions(options: js.Any): js.Any = js.native
  /* private */ def _headersFromOptions(options: js.Any, contentType: js.Any): js.Any = js.native
  /* private */ def _processResponse[T](res: js.Any, options: js.Any): js.Any = js.native
  /**
       * Creates resource(s) from an endpoint
       * T type of object returned.
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def create[T](resource: java.lang.String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
  /**
       * Creates resource(s) from an endpoint
       * T type of object returned.
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def create[T](resource: java.lang.String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
       * Deletes a resource from an endpoint
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def del[T](resource: java.lang.String): js.Promise[IRestResponse[T]] = js.native
  /**
       * Deletes a resource from an endpoint
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def del[T](resource: java.lang.String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
       * Gets a resource from an endpoint
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified url or relative path
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def get[T](resource: java.lang.String): js.Promise[IRestResponse[T]] = js.native
  /**
       * Gets a resource from an endpoint
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified url or relative path
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def get[T](resource: java.lang.String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
       * Gets a resource from an endpoint
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} requestUrl - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def options[T](requestUrl: java.lang.String): js.Promise[IRestResponse[T]] = js.native
  /**
       * Gets a resource from an endpoint
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} requestUrl - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def options[T](requestUrl: java.lang.String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
       * Replaces resource(s) from an endpoint
       * T type of object returned.
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def replace[T](resource: java.lang.String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
  /**
       * Replaces resource(s) from an endpoint
       * T type of object returned.
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def replace[T](resource: java.lang.String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
       * Updates resource(s) from an endpoint
       * T type of object returned.
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def update[T](resource: java.lang.String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
  /**
       * Updates resource(s) from an endpoint
       * T type of object returned.
       * Be aware that not found returns a null.  Other error conditions reject the promise
       * @param {string} resource - fully qualified or relative url
       * @param {IRequestOptions} requestOptions - (optional) requestOptions object
       */
  def update[T](resource: java.lang.String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  def uploadStream[T](verb: java.lang.String, requestUrl: java.lang.String, stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[IRestResponse[T]] = js.native
  def uploadStream[T](
    verb: java.lang.String,
    requestUrl: java.lang.String,
    stream: nodeLib.NodeJSNs.ReadableStream,
    options: IRequestOptions
  ): js.Promise[IRestResponse[T]] = js.native
}

@JSImport("typed-rest-client/RestClient", "RestClient")
@js.native
object RestClient extends js.Object {
  /* private */ def dateTimeDeserializer(key: js.Any, value: js.Any): js.Any = js.native
}

