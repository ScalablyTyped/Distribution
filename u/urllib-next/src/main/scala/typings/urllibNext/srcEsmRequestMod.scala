package typings.urllibNext

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Lowercase
import typings.std.Record
import typings.std.URL
import typings.undici.typesDispatcherMod.^
import typings.urllibNext.srcEsmResponseMod.HttpClientResponse
import typings.urllibNext.urllibNextStrings.buffer
import typings.urllibNext.urllibNextStrings.json
import typings.urllibNext.urllibNextStrings.stream
import typings.urllibNext.urllibNextStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEsmRequestMod {
  
  type FixJSONCtlChars = Boolean | FixJSONCtlCharsHandler
  
  type FixJSONCtlCharsHandler = js.Function1[/* data */ String, String]
  
  type HttpMethod = typings.undici.typesDispatcherMod.HttpMethod
  
  trait RequestOptions extends StObject {
    
    /**
      * username:password used in HTTP Basic Authorization.
      * Alias to `headers.authorization = xxx`
      **/
    var auth: js.UndefOr[String] = js.undefined
    
    /** Before request hook, you can change every thing here. */
    var beforeRequest: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /** Accept `gzip, br` response content and auto decode it, default is false. */
    var compressed: js.UndefOr[Boolean] = js.undefined
    
    /** Manually set the content of payload. If set, data will be ignored. */
    var content: js.UndefOr[String | Buffer | Readable] = js.undefined
    
    /** Type of request data, could be 'json'. If it's 'json', will auto set Content-Type: 'application/json' header. */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated
      * Maybe you should use opaque instead
      */
    var ctx: js.UndefOr[Any] = js.undefined
    
    /**
      * @deprecated
      * Alias to `dataType = 'stream'`
      */
    var customResponse: js.UndefOr[Boolean] = js.undefined
    
    /** Data to be sent. Will be stringify automatically. */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Type of response data. Could be text or json.
      * If it's text, the callbacked data would be a String.
      * If it's json, the data of callback would be a parsed JSON Object
      * and will auto set Accept: 'application/json' header.
      * Default is 'buffer'.
      */
    var dataType: js.UndefOr[text | json | buffer | stream] = js.undefined
    
    /**
      * username:password used in HTTP Digest Authorization.
      * */
    var digestAuth: js.UndefOr[String] = js.undefined
    
    /**
      * request dispatcher, default is getGlobalDispatcher()
      */
    var dispatcher: js.UndefOr[^] = js.undefined
    
    /**
      * The files will send with multipart/form-data format, base on formstream.
      * If method not set, will use POST method by default.
      */
    var files: js.UndefOr[
        (js.Array[Readable | Buffer | String]) | (Record[String, Readable | Buffer | String]) | Readable | Buffer | String
      ] = js.undefined
    
    /** Fix the control characters (U+0000 through U+001F) before JSON parse response. Default is false. */
    var fixJSONCtlChars: js.UndefOr[FixJSONCtlChars] = js.undefined
    
    /** follow HTTP 3xx responses as redirects. defaults to true. */
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    /** Format the redirect url by your self. Default is url.resolve(from, to). */
    var formatRedirectUrl: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Unit]] = js.undefined
    
    /**
      * @deprecated
      * Alias to compressed
      * */
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    /** Request headers. */
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    /**
      * Determine whether retry, a response object as the first argument.
      * It will retry when status >= 500 by default. Request error is not included.
      */
    var isRetry: js.UndefOr[js.Function1[/* response */ HttpClientResponse, Boolean]] = js.undefined
    
    /** The maximum number of redirects to follow, defaults to 10. */
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    /** Request method, defaults to GET. Could be GET, POST, DELETE or PUT. Alias 'type'. */
    var method: js.UndefOr[HttpMethod | Lowercase[HttpMethod]] = js.undefined
    
    /** Default: `null` */
    var opaque: js.UndefOr[Any] = js.undefined
    
    /**
      * Auto retry times on 5xx response, default is 0. Don't work on streaming request
      * It's not supported by using retry and writeStream, because the retry request can't stop the stream which is consuming.
      **/
    var retry: js.UndefOr[Double] = js.undefined
    
    /** Wait a delay(ms) between retries */
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * unix domain socket file path
      */
    var socketPath: js.UndefOr[String | Null] = js.undefined
    
    /**
      * @deprecated
      * Stream to be pipe to the remote. If set, data and content will be ignored.
      * Alias to `content = Readable`
      */
    var stream: js.UndefOr[Readable] = js.undefined
    
    /**
      * @deprecated
      * Let you get the res object when request connected, default false.
      * If set to true, `data` will be response readable stream.
      * Alias to `dataType = 'stream'`
      */
    var streaming: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Request timeout in milliseconds for connecting phase and response receiving phase.
      * Defaults to exports.
      * TIMEOUT, both are 5s. You can use timeout: 5000 to tell urllib use same timeout on two phase or set them seperately such as
      * timeout: [3000, 5000], which will set connecting timeout to 3s and response 5s.
      */
    var timeout: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Enable timing or not, default is false.
      * */
    var timing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A writable stream to be piped by the response stream.
      * Responding data will be write to this stream and callback
      * will be called with data set null after finished writing.
      */
    var writeStream: js.UndefOr[Writable] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBeforeRequest(value: /* repeated */ Any => Unit): Self = StObject.set(x, "beforeRequest", js.Any.fromFunction1(value))
      
      inline def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      inline def setContent(value: String | Buffer | Readable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
      
      inline def setCustomResponse(value: Boolean): Self = StObject.set(x, "customResponse", value.asInstanceOf[js.Any])
      
      inline def setCustomResponseUndefined: Self = StObject.set(x, "customResponse", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: text | json | buffer | stream): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDigestAuth(value: String): Self = StObject.set(x, "digestAuth", value.asInstanceOf[js.Any])
      
      inline def setDigestAuthUndefined: Self = StObject.set(x, "digestAuth", js.undefined)
      
      inline def setDispatcher(value: ^): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      inline def setFiles(
        value: (js.Array[Readable | Buffer | String]) | (Record[String, Readable | Buffer | String]) | Readable | Buffer | String
      ): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: (Readable | Buffer | String)*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFixJSONCtlChars(value: FixJSONCtlChars): Self = StObject.set(x, "fixJSONCtlChars", value.asInstanceOf[js.Any])
      
      inline def setFixJSONCtlCharsFunction1(value: /* data */ String => String): Self = StObject.set(x, "fixJSONCtlChars", js.Any.fromFunction1(value))
      
      inline def setFixJSONCtlCharsUndefined: Self = StObject.set(x, "fixJSONCtlChars", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setFormatRedirectUrl(value: (/* a */ Any, /* b */ Any) => Unit): Self = StObject.set(x, "formatRedirectUrl", js.Any.fromFunction2(value))
      
      inline def setFormatRedirectUrlUndefined: Self = StObject.set(x, "formatRedirectUrl", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIsRetry(value: /* response */ HttpClientResponse => Boolean): Self = StObject.set(x, "isRetry", js.Any.fromFunction1(value))
      
      inline def setIsRetryUndefined: Self = StObject.set(x, "isRetry", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMethod(value: HttpMethod | Lowercase[HttpMethod]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathNull: Self = StObject.set(x, "socketPath", null)
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStreaming(value: Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
      
      inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
      
      inline def setTimeout(value: Double | js.Array[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTimeoutVarargs(value: Double*): Self = StObject.set(x, "timeout", js.Array(value*))
      
      inline def setTiming(value: Boolean): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      
      inline def setWriteStream(value: Writable): Self = StObject.set(x, "writeStream", value.asInstanceOf[js.Any])
      
      inline def setWriteStreamUndefined: Self = StObject.set(x, "writeStream", js.undefined)
    }
  }
  
  type RequestURL = String | URL
}
