package typings.web3DashCore.web3DashCoreMod

import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.HttpProviderBase
import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.HttpProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core", "HttpProvider")
@js.native
class HttpProvider protected ()
  extends HttpProviderBase
     with _provider {
  def this(host: String) = this()
  def this(host: String, options: HttpProviderOptions) = this()
}

