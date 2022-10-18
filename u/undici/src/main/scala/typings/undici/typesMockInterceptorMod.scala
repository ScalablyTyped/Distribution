package typings.undici

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.std.Record
import typings.undici.anon.Data
import typings.undici.typesDispatcherMod.^
import typings.undici.typesFetchMod.BodyInit
import typings.undici.typesFetchMod.Headers
import typings.undici.typesFormdataMod.FormData
import typings.undici.typesMockInterceptorMod.MockInterceptor.MockDispatch
import typings.undici.typesMockInterceptorMod.MockInterceptor.MockReplyOptionsCallback
import typings.undici.typesMockInterceptorMod.MockInterceptor.MockResponseDataHandler
import typings.undici.typesMockInterceptorMod.MockInterceptor.MockResponseOptions
import typings.undici.typesMockInterceptorMod.MockInterceptor.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMockInterceptorMod {
  
  /** The scope associated with a mock dispatch. */
  @JSImport("undici/types/mock-interceptor", "MockScope")
  @js.native
  open class MockScope[TData /* <: js.Object */] protected () extends StObject {
    def this(mockDispatch: MockDispatch[TData, js.Error]) = this()
    
    /** Delay a reply by a set amount of time in ms. */
    def delay(waitInMs: Double): MockScope[TData] = js.native
    
    /** Persist the defined mock data for the associated reply. It will return the defined mock data indefinitely. */
    def persist(): MockScope[TData] = js.native
    
    /** Define a reply for a set amount of matching requests. */
    def times(repeatTimes: Double): MockScope[TData] = js.native
  }
  
  @js.native
  trait Interceptable extends ^ {
    
    /** Intercepts any matching requests that use the same origin as this mock client. */
    def intercept(options: Options): MockInterceptor = js.native
  }
  
  /** The interceptor for a Mock. */
  @js.native
  trait MockInterceptor extends StObject {
    
    /** Set default reply headers on the interceptor for subsequent mocked replies. */
    def defaultReplyHeaders(headers: IncomingHttpHeaders): MockInterceptor = js.native
    
    /** Set default reply trailers on the interceptor for subsequent mocked replies. */
    def defaultReplyTrailers(trailers: Record[String, String]): MockInterceptor = js.native
    
    /** Mock an undici request with the defined reply. */
    def reply[TData /* <: js.Object */](replyOptionsCallback: MockReplyOptionsCallback[TData]): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: TData): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: TData, responseOptions: MockResponseOptions): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: String): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: String, responseOptions: MockResponseOptions): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: Unit, responseOptions: MockResponseOptions): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: Buffer): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: Buffer, responseOptions: MockResponseOptions): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: MockResponseDataHandler[TData]): MockScope[TData] = js.native
    def reply[TData /* <: js.Object */](statusCode: Double, data: MockResponseDataHandler[TData], responseOptions: MockResponseOptions): MockScope[TData] = js.native
    
    /** Set automatically calculated content-length header on subsequent mocked replies. */
    def replyContentLength(): MockInterceptor = js.native
    
    /** Mock an undici request by throwing the defined reply error. */
    def replyWithError[TError /* <: js.Error */](error: TError): MockScope[js.Object] = js.native
  }
  object MockInterceptor {
    
    trait MockDispatch[TData /* <: js.Object */, TError /* <: js.Error */]
      extends StObject
         with Options {
      
      var consumed: Boolean
      
      var data: MockDispatchData[TData, TError]
      
      var persist: Boolean
      
      var times: Double | Null
    }
    object MockDispatch {
      
      inline def apply[TData /* <: js.Object */, TError /* <: js.Error */](
        consumed: Boolean,
        data: MockDispatchData[TData, TError],
        path: String | js.RegExp | (js.Function1[/* path */ String, Boolean]),
        persist: Boolean
      ): MockDispatch[TData, TError] = {
        val __obj = js.Dynamic.literal(consumed = consumed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], times = null)
        __obj.asInstanceOf[MockDispatch[TData, TError]]
      }
      
      extension [Self <: MockDispatch[?, ?], TData /* <: js.Object */, TError /* <: js.Error */](x: Self & (MockDispatch[TData, TError])) {
        
        inline def setConsumed(value: Boolean): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
        
        inline def setData(value: MockDispatchData[TData, TError]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
        
        inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
        
        inline def setTimesNull: Self = StObject.set(x, "times", null)
      }
    }
    
    trait MockDispatchData[TData /* <: js.Object */, TError /* <: js.Error */]
      extends StObject
         with MockResponseOptions {
      
      var data: js.UndefOr[TData | String] = js.undefined
      
      var error: TError | Null
      
      var statusCode: js.UndefOr[Double] = js.undefined
    }
    object MockDispatchData {
      
      inline def apply[TData /* <: js.Object */, TError /* <: js.Error */](): MockDispatchData[TData, TError] = {
        val __obj = js.Dynamic.literal(error = null)
        __obj.asInstanceOf[MockDispatchData[TData, TError]]
      }
      
      extension [Self <: MockDispatchData[?, ?], TData /* <: js.Object */, TError /* <: js.Error */](x: Self & (MockDispatchData[TData, TError])) {
        
        inline def setData(value: TData | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setError(value: TError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorNull: Self = StObject.set(x, "error", null)
        
        inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        
        inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      }
    }
    
    type MockReplyOptionsCallback[TData /* <: js.Object */] = js.Function1[/* opts */ MockResponseCallbackOptions, Data[TData]]
    
    trait MockResponseCallbackOptions extends StObject {
      
      var body: js.UndefOr[
            BodyInit | String | Buffer | js.typedarray.Uint8Array | Readable | Null | FormData
          ] = js.undefined
      
      var headers: Headers | (Record[String, String])
      
      var maxRedirections: Double
      
      var method: String
      
      var origin: String
      
      var path: String
    }
    object MockResponseCallbackOptions {
      
      inline def apply(
        headers: Headers | (Record[String, String]),
        maxRedirections: Double,
        method: String,
        origin: String,
        path: String
      ): MockResponseCallbackOptions = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], maxRedirections = maxRedirections.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[MockResponseCallbackOptions]
      }
      
      extension [Self <: MockResponseCallbackOptions](x: Self) {
        
        inline def setBody(value: BodyInit | String | Buffer | js.typedarray.Uint8Array | Readable | FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyNull: Self = StObject.set(x, "body", null)
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setHeaders(value: Headers | (Record[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
    
    type MockResponseDataHandler[TData /* <: js.Object */] = js.Function1[/* opts */ MockResponseCallbackOptions, TData | Buffer | String]
    
    trait MockResponseOptions extends StObject {
      
      var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
      
      var trailers: js.UndefOr[Record[String, String]] = js.undefined
    }
    object MockResponseOptions {
      
      inline def apply(): MockResponseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MockResponseOptions]
      }
      
      extension [Self <: MockResponseOptions](x: Self) {
        
        inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setTrailers(value: Record[String, String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
        
        inline def setTrailersUndefined: Self = StObject.set(x, "trailers", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      /** Body to intercept on. */
      var body: js.UndefOr[String | js.RegExp | (js.Function1[/* body */ String, Boolean])] = js.undefined
      
      /** Headers to intercept on. */
      var headers: js.UndefOr[
            (Record[String, String | js.RegExp | (js.Function1[/* body */ String, Boolean])]) | (js.Function1[/* headers */ Record[String, String], Boolean])
          ] = js.undefined
      
      /** Method to intercept on. Defaults to GET. */
      var method: js.UndefOr[String | js.RegExp | (js.Function1[/* method */ String, Boolean])] = js.undefined
      
      /** Path to intercept on. */
      var path: String | js.RegExp | (js.Function1[/* path */ String, Boolean])
      
      /** Query params to intercept on */
      var query: js.UndefOr[Record[String, Any]] = js.undefined
    }
    object Options {
      
      inline def apply(path: String | js.RegExp | (js.Function1[/* path */ String, Boolean])): Options = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBody(value: String | js.RegExp | (js.Function1[/* body */ String, Boolean])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyFunction1(value: /* body */ String => Boolean): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setHeaders(
          value: (Record[String, String | js.RegExp | (js.Function1[/* body */ String, Boolean])]) | (js.Function1[/* headers */ Record[String, String], Boolean])
        ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersFunction1(value: /* headers */ Record[String, String] => Boolean): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setMethod(value: String | js.RegExp | (js.Function1[/* method */ String, Boolean])): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodFunction1(value: /* method */ String => Boolean): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setPath(value: String | js.RegExp | (js.Function1[/* path */ String, Boolean])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
        
        inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      }
    }
  }
}
