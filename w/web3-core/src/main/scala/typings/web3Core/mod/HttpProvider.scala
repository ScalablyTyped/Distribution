package typings.web3Core.mod

import typings.web3CoreHelpers.mod.HttpProviderBase
import typings.web3CoreHelpers.mod.HttpProviderOptions
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

