package typings.web3DashProvidersDashHttp

import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.HttpProviderBase
import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.HttpProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-providers-http", JSImport.Namespace)
@js.native
object web3DashProvidersDashHttpMod extends js.Object {
  @js.native
  class HttpProvider protected () extends HttpProviderBase {
    def this(host: String) = this()
    def this(host: String, options: HttpProviderOptions) = this()
  }
  
}

