package typings.webdriverio

import typings.std.Record
import typings.std.Set
import typings.webdriverio.anon.MockedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsMod {
  
  @JSImport("webdriverio/build/utils/interception/devtools", JSImport.Default)
  @js.native
  class default () extends DevtoolsInterception
  /* static members */
  object default {
    
    @JSImport("webdriverio/build/utils/interception/devtools", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def handleRequestInterception(client: Client, mocks: Set[typings.webdriverio.interceptionMod.default]): js.Function1[/* event */ Event, js.Promise[Unit | ClientResponse]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequestInterception")(client.asInstanceOf[js.Any], mocks.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Event, js.Promise[Unit | ClientResponse]]]
  }
  
  trait Client extends StObject {
    
    def send(requestName: String, requestOptions: RequestOptions): js.Promise[ClientResponse]
  }
  object Client {
    
    inline def apply(send: (String, RequestOptions) => js.Promise[ClientResponse]): Client = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setSend(value: (String, RequestOptions) => js.Promise[ClientResponse]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    }
  }
  
  trait ClientResponse extends StObject {
    
    var base64Encoded: js.UndefOr[Boolean] = js.undefined
    
    var body: String
  }
  object ClientResponse {
    
    inline def apply(body: String): ClientResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientResponse]
    }
    
    extension [Self <: ClientResponse](x: Self) {
      
      inline def setBase64Encoded(value: Boolean): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
      
      inline def setBase64EncodedUndefined: Self = StObject.set(x, "base64Encoded", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DevtoolsInterception
    extends typings.webdriverio.interceptionMod.default {
    
    def abort(errorReason: String): Unit = js.native
    def abort(errorReason: String, sticky: Boolean): Unit = js.native
    
    def abortOnce(errorReason: String): Unit = js.native
    
    @JSName("calls")
    def calls_MDevtoolsInterception: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webdriverio.Matches */ js.Any
      ] = js.native
    
    def clear(): Unit = js.native
    
    def respond(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any
    ): Unit = js.native
    def respond(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any,
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockResponseParams */ js.Any
    ): Unit = js.native
    
    def respondOnce(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any
    ): Unit = js.native
    def respondOnce(
      overwrite: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockOverwrite */ js.Any,
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MockResponseParams */ js.Any
    ): Unit = js.native
    
    def restore(): Unit = js.native
  }
  
  trait Event extends StObject {
    
    var request: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Matches */ js.Any) & MockedResponse
    
    var requestId: String
    
    var responseHeaders: js.Array[Record[String, String]]
    
    var responseStatusCode: js.UndefOr[Double] = js.undefined
  }
  object Event {
    
    inline def apply(
      request: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Matches */ js.Any) & MockedResponse,
      requestId: String,
      responseHeaders: js.Array[Record[String, String]]
    ): Event = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setRequest(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Matches */ js.Any) & MockedResponse
      ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaders(value: js.Array[Record[String, String]]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersVarargs(value: (Record[String, String])*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
      
      inline def setResponseStatusCode(value: Double): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
      
      inline def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
    }
  }
  
  trait RequestOptions extends StObject {
    
    var body: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.JsonCompatible */ js.Any)
      ] = js.undefined
    
    var errorReason: js.UndefOr[String] = js.undefined
    
    var requestId: String
    
    var responseCode: js.UndefOr[Double] = js.undefined
    
    var responseHeaders: js.UndefOr[js.Array[Record[String, String]]] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(requestId: String): RequestOptions = {
      val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setBody(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.JsonCompatible */ js.Any)
      ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setErrorReason(value: String): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
      
      inline def setErrorReasonUndefined: Self = StObject.set(x, "errorReason", js.undefined)
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
      
      inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
      
      inline def setResponseHeaders(value: js.Array[Record[String, String]]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      inline def setResponseHeadersVarargs(value: (Record[String, String])*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
    }
  }
}
