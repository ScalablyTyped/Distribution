package typings.webpackChain.mod

import typings.webpackChain.webpackChainStrings.error
import typings.webpackChain.webpackChainStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Performance")
@js.native
class Performance ()
  extends typings.webpackChain.mod._Config.TypedChainedMap[Config, js.Any] {
  def assetFilter(value: js.Function1[/* assetFilename */ String, Boolean]): this.type = js.native
  def hints(value: Boolean): this.type = js.native
  @JSName("hints")
  def hints_error(value: error): this.type = js.native
  @JSName("hints")
  def hints_warning(value: warning): this.type = js.native
  def maxAssetSize(value: Double): this.type = js.native
  def maxEntrypointSize(value: Double): this.type = js.native
}

