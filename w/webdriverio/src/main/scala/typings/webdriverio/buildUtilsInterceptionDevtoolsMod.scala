package typings.webdriverio

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typings.std.Set
import typings.webdriverio.anon.MatchesmockedResponsestri
import typings.webdriverio.buildUtilsInterceptionTypesMod.Matches
import typings.webdriverio.buildUtilsInterceptionTypesMod.MockOverwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsInterceptionDevtoolsMod {
  
  @JSImport("webdriverio/build/utils/interception/devtools", JSImport.Default)
  @js.native
  open class default () extends DevtoolsInterception
  /* static members */
  object default {
    
    @JSImport("webdriverio/build/utils/interception/devtools", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def handleRequestInterception(client: CDPSession, mocks: Set[typings.webdriverio.buildUtilsInterceptionMod.default]): js.Function1[/* event */ Event, js.Promise[Unit | ClientResponse]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequestInterception")(client.asInstanceOf[js.Any], mocks.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Event, js.Promise[Unit | ClientResponse]]]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientResponse] (val x: Self) extends AnyVal {
      
      inline def setBase64Encoded(value: Boolean): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
      
      inline def setBase64EncodedUndefined: Self = StObject.set(x, "base64Encoded", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DevtoolsInterception
    extends typings.webdriverio.buildUtilsInterceptionMod.default {
    
    /**
      * Abort the request with an error code
      * @param {string} errorCode  error code of the response
      */
    def abort(errorReason: ErrorReason): Unit = js.native
    
    /**
      * allows access to all requests made with given pattern
      */
    @JSName("calls")
    def calls_MDevtoolsInterception: js.Array[Matches] = js.native
    
    /**
      * Always respond with same overwrite
      * @param {*} overwrites  payload to overwrite the response
      * @param {*} params      additional respond parameters to overwrite
      */
    def respond(overwrite: MockOverwrite): Unit = js.native
    
    /**
      * Respond request once with given overwrite
      * @param {*} overwrites  payload to overwrite the response
      * @param {*} params      additional respond parameters to overwrite
      */
    def respondOnce(overwrite: MockOverwrite): Unit = js.native
  }
  
  trait Event extends StObject {
    
    var request: MatchesmockedResponsestri
    
    var requestId: String
    
    var responseHeaders: js.Array[HeaderEntry]
    
    var responseStatusCode: js.UndefOr[Double] = js.undefined
  }
  object Event {
    
    inline def apply(request: MatchesmockedResponsestri, requestId: String, responseHeaders: js.Array[HeaderEntry]): Event = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: MatchesmockedResponsestri): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaders(value: js.Array[HeaderEntry]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersVarargs(value: HeaderEntry*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
      
      inline def setResponseStatusCode(value: Double): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
      
      inline def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
    }
  }
  
  trait HeaderEntry extends StObject {
    
    var name: String
    
    var value: String
  }
  object HeaderEntry {
    
    inline def apply(name: String, value: String): HeaderEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderEntry] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
