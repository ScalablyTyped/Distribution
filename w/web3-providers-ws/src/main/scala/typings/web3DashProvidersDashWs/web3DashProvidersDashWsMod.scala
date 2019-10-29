package typings.web3DashProvidersDashWs

import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.WebsocketProviderBase
import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.WebsocketProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-providers-ws", JSImport.Namespace)
@js.native
object web3DashProvidersDashWsMod extends js.Object {
  @js.native
  class WebsocketProvider protected () extends WebsocketProviderBase {
    def this(host: String) = this()
    def this(host: String, options: WebsocketProviderOptions) = this()
  }
  
}

