package typings.twilioMcsClient

import typings.node.Buffer
import typings.std.FormData
import typings.twilioMcsClient.configurationMod.Configuration
import typings.twilioMcsClient.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("twilio-mcs-client/lib/services/network", "Network")
  @js.native
  class Network protected () extends StObject {
    def this(config: Configuration, transport: Transport) = this()
    
    /* private */ var backoffConfig: js.Any = js.native
    
    /* private */ val config: js.Any = js.native
    
    /* private */ var executeWithRetry: js.Any = js.native
    
    def get(url: String): js.Promise[js.Any] = js.native
    
    def post(url: String, media: String): js.Promise[js.Any] = js.native
    def post(url: String, media: String, contentType: String): js.Promise[js.Any] = js.native
    def post(url: String, media: Buffer): js.Promise[js.Any] = js.native
    def post(url: String, media: Buffer, contentType: String): js.Promise[js.Any] = js.native
    def post(url: String, media: FormData): js.Promise[js.Any] = js.native
    def post(url: String, media: FormData, contentType: String): js.Promise[js.Any] = js.native
    
    /* private */ var retryWhenThrottled: js.Any = js.native
    
    /* private */ val transport: js.Any = js.native
  }
}
