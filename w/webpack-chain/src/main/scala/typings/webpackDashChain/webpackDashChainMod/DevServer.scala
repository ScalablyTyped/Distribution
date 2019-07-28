package typings.webpackDashChain.webpackDashChainMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpsMod.ServerOptions
import typings.webpack.webpackMod.OptionsNs.Stats
import typings.webpackDashChain.Anon_Errors
import typings.webpackDashChain.webpackDashChainStrings.error
import typings.webpackDashChain.webpackDashChainStrings.info
import typings.webpackDashChain.webpackDashChainStrings.none
import typings.webpackDashChain.webpackDashChainStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "DevServer")
@js.native
class DevServer () extends ChainedMap[Config] {
  var allowedHosts: TypedChainedSet[this.type, String] = js.native
  def apply(value: String): this.type = js.native
  def bonjour(value: Boolean): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_error(value: error): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_info(value: info): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_none(value: none): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_warning(value: warning): this.type = js.native
  def color(value: Boolean): this.type = js.native
  def compress(value: Boolean): this.type = js.native
  def contentBase(value: String): this.type = js.native
  def contentBase(value: js.Array[String]): this.type = js.native
  def contentBase(value: Boolean): this.type = js.native
  def disableHostCheck(value: Boolean): this.type = js.native
  def filename(value: String): this.type = js.native
  def headers(value: StringDictionary[String]): this.type = js.native
  def historyApiFallback(value: js.Any): this.type = js.native
  def historyApiFallback(value: Boolean): this.type = js.native
  def host(value: String): this.type = js.native
  def hot(value: Boolean): this.type = js.native
  def hotOnly(value: Boolean): this.type = js.native
  def https(value: Boolean): this.type = js.native
  def https(value: ServerOptions): this.type = js.native
  def info(value: Boolean): this.type = js.native
  def `inline`(value: Boolean): this.type = js.native
  def `lazy`(value: Boolean): this.type = js.native
  def noInfo(value: Boolean): this.type = js.native
  def open(value: Boolean): this.type = js.native
  def overlay(value: Boolean): this.type = js.native
  def overlay(value: Anon_Errors): this.type = js.native
  def pfx(value: String): this.type = js.native
  def pfxPassphrase(value: String): this.type = js.native
  def port(value: Double): this.type = js.native
  def progress(value: Boolean): this.type = js.native
  def proxy(value: js.Any): this.type = js.native
  def publicPath(publicPath: String): this.type = js.native
  def quiet(value: Boolean): this.type = js.native
  def setup(value: js.Function1[/* expressApp */ js.Any, Unit]): this.type = js.native
  def socket(value: String): this.type = js.native
  def staticOptions(value: js.Any): this.type = js.native
  def stats(value: Stats): this.type = js.native
  def stdin(value: Boolean): this.type = js.native
  def useLocalIp(value: Boolean): this.type = js.native
  def watchContentBase(value: Boolean): this.type = js.native
  def watchOptions(value: js.Any): this.type = js.native
}

