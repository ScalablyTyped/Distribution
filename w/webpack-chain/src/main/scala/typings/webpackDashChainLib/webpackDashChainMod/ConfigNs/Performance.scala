package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Performance
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[webpackDashChainLib.webpackDashChainMod.Config, js.Any] {
  def assetFilter(value: js.Function1[/* assetFilename */ java.lang.String, scala.Boolean]): this.type = js.native
  def hints(value: scala.Boolean): this.type = js.native
  @JSName("hints")
  def hints_error(value: webpackDashChainLib.webpackDashChainLibStrings.error): this.type = js.native
  @JSName("hints")
  def hints_warning(value: webpackDashChainLib.webpackDashChainLibStrings.warning): this.type = js.native
  def maxAssetSize(value: scala.Double): this.type = js.native
  def maxEntrypointSize(value: scala.Double): this.type = js.native
}

