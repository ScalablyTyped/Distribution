package typings.web3Core.mod

import typings.web3CoreHelpers.mod.WebsocketProviderBase
import typings.web3CoreHelpers.mod.WebsocketProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core", "WebsocketProvider")
@js.native
class WebsocketProvider protected ()
  extends WebsocketProviderBase
     with _provider {
  def this(host: String) = this()
  def this(host: String, options: WebsocketProviderOptions) = this()
}

