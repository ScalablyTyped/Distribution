package typings.vimeo

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vimeo", "Vimeo")
  @js.native
  open class Vimeo protected () extends StObject {
    /**
      * This object is used to interface with the Vimeo API.
      *
      * @param clientId     OAuth 2 Client Identifier
      * @param clientSecret OAuth 2 Client Secret
      * @param accessToken  OAuth 2 Optional pre-authorized access token
      */
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, accessToken: String) = this()
    
    /**
      * Exchange a code for an access token. This code should exist on your `redirectUri`.
      *
      * @param code         The code provided on your `redirectUri`.
      * @param redirectUri  The exact `redirectUri` provided to `buildAuthorizationEndpoint`
      *                                and configured in your API app settings.
      * @param fn           Callback to execute on completion.
      */
    def accessToken(code: String, redirectUri: String, fn: CompleteCallback): Unit = js.native
    
    /**
      * The first step of the authorization process.
      *
      * This function returns a URL, which the user should be sent to (via redirect or link).
      *
      * The destination allows the user to accept or deny connecting with vimeo, and accept or deny each
      * of the scopes you requested. Scopes are passed through the second parameter as an array of
      * strings, or a space delimited list.
      *
      * Once accepted or denied, the user is redirected back to the `redirectUri`.
      *
      * @param redirectUri   The URI that will exchange a code for an access token. Must match
      *                                the URI in your API app settings.
      * @param scope  An array of scopes. See https://developer.vimeo.com/api/authentication#scopes
      *                                for more.
      * @param state         A unique state that will be returned to you on your redirect URI.
      */
    def buildAuthorizationEndpoint(redirectUri: String, scope: String, state: String): Unit = js.native
    def buildAuthorizationEndpoint(redirectUri: String, scope: js.Array[String], state: String): Unit = js.native
    
    /**
      * Generates an unauthenticated access token. This is necessary to make unauthenticated requests
      *
      * @param scope  An array of scopes. See https://developer.vimeo.com/api/authentication#scopes
      *                          for more.
      * @param fn    A function that is called when the request is complete. If an error
      *                          occured the first parameter will be that error, otherwise the first
      *                          parameter will be null.
      */
    def generateClientCredentials(scope: String, fn: CompleteCallback): Unit = js.native
    def generateClientCredentials(scope: js.Array[String], fn: CompleteCallback): Unit = js.native
    
    def replace(
      file: String,
      videoUri: String,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: Unit,
      errorCallback: ErrorCallback
    ): Unit = js.native
    /**
      * Replace the source of a single Vimeo video.
      *
      * https://developer.vimeo.com/api/reference/videos#create_video_version
      *
      * @param file              Path to the file or File you wish to upload.
      * @param videoUri          Video URI of the video file to replace.
      * @param params            Parameters to send when creating a new video (name,
      *                                      privacy restrictions, etc.). See the API documentation for
      *                                      supported parameters.
      * @param completeCallback  Callback to be executed when the upload completes.
      * @param progressCallback  Callback to be executed when upload progress is updated.
      * @param errorCallback     Callback to be executed when the upload returns an error.
      */
    def replace(
      file: String,
      videoUri: String,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: ProgressCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
    def replace(
      file: File,
      videoUri: String,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: Unit,
      errorCallback: ErrorCallback
    ): Unit = js.native
    def replace(
      file: File,
      videoUri: String,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: ProgressCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
    
    /**
      * Performs an API call.
      *
      * Can be called one of two ways:
      *
      * 1. Url + Callback
      *    If a url is provided, we fill in the rest of the request options with defaults
      *    (GET http://api.vimeo.com/{url}).
      *
      * 2. Options + callback
      *    If an object is provided, it should match the response of urlModule.parse. Path is the only
      *    required parameter.
      *
      *    - hostname
      *    - port
      *    - query (will be applied to the url if GET, request body if POST)
      *    - headers
      *    - path (can include a querystring)
      *    - method
      *
      * The callback takes two parameters, `err` and `json`.
      * If an error has occured, your callback will be called as `callback(err)`;
      * If an error has not occured, your callback will be called as `callback(null, json)`;
      *
      * @param options   String path (default GET), or object with `method`, path`,
      *                                  `host`, `port`, `query` or `headers`.
      * @param callback  Called when complete, `function (err, json)`.
      */
    def request(url: String, callback: CompleteCallback): Unit = js.native
    def request(url: RequestOptions, callback: CompleteCallback): Unit = js.native
    
    /**
      * Set a user access token to be used with library requests.
      *
      * @param accessToken
      */
    def setAccessToken(accessToken: String): Unit = js.native
    
    def upload(file: String, completeCallback: UriCallback, progressCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
    def upload(
      file: String,
      completeCallback: UriCallback,
      progressCallback: ProgressCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
    def upload(
      file: String,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: Unit,
      errorCallback: ErrorCallback
    ): Unit = js.native
    /**
      * Upload a file.
      *
      * This should be used to upload a local file. If you want a form for your site to upload direct to
      * Vimeo, you should look at the `POST /me/videos` endpoint.
      *
      * https://developer.vimeo.com/api/reference/videos#upload_video
      *
      * @param file              Path to the file or File you wish to upload.
      * @param params            Parameters to send when creating a new video (name,
      *                                      privacy restrictions, etc.). See the API documentation for
      *                                      supported parameters.
      * @param completeCallback  Callback to be executed when the upload completes.
      * @param progressCallback  Callback to be executed when upload progress is updated.
      * @param errorCallback     Callback to be executed when the upload returns an error.
      */
    def upload(
      file: String,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: ProgressCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
    def upload(file: File, completeCallback: UriCallback, progressCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
    def upload(
      file: File,
      completeCallback: UriCallback,
      progressCallback: ProgressCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
    def upload(
      file: File,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: Unit,
      errorCallback: ErrorCallback
    ): Unit = js.native
    def upload(
      file: File,
      params: js.Object,
      completeCallback: UriCallback,
      progressCallback: ProgressCallback,
      errorCallback: ErrorCallback
    ): Unit = js.native
  }
  
  type CompleteCallback = js.Function4[
    /* err */ js.Error | Null, 
    /* result */ Any, 
    /* statusCode */ js.UndefOr[Double], 
    /* headers */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type ErrorCallback = js.Function1[/* err */ String, Unit]
  
  type ProgressCallback = js.Function2[/* bytesUploaded */ Double, /* bytesTotal */ Double, Unit]
  
  trait RequestOptions extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: String
    
    var path: String
    
    var query: js.UndefOr[js.Object] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(method: String, path: String): RequestOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type UriCallback = js.Function1[/* uri */ String, Unit]
}
