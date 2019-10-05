package typings.twilioDashMcsDashClient

import typings.node.Buffer
import typings.std.FormData
import typings.twilioDashMcsDashClient.libConfigurationMod.Configuration
import typings.twilioDashMcsDashClient.libServicesTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-mcs-client/lib/services/network", JSImport.Namespace)
@js.native
object libServicesNetworkMod extends js.Object {
  @js.native
  class Network protected () extends js.Object {
    def this(config: Configuration, transport: Transport) = this()
    var backoffConfig: js.Any = js.native
    val config: js.Any = js.native
    var executeWithRetry: js.Any = js.native
    var retryWhenThrottled: js.Any = js.native
    val transport: js.Any = js.native
    def get(url: String): js.Promise[_] = js.native
    def post(url: String, media: String): js.Promise[_] = js.native
    def post(url: String, media: String, contentType: String): js.Promise[_] = js.native
    def post(url: String, media: Buffer): js.Promise[_] = js.native
    def post(url: String, media: Buffer, contentType: String): js.Promise[_] = js.native
    def post(url: String, media: FormData): js.Promise[_] = js.native
    def post(url: String, media: FormData, contentType: String): js.Promise[_] = js.native
  }
  
}

