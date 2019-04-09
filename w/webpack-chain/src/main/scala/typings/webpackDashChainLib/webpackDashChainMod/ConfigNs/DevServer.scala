package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevServer
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[webpackDashChainLib.webpackDashChainMod.Config, js.Any] {
  var allowedHosts: TypedChainedSet[this.type, java.lang.String] = js.native
  def apply(value: java.lang.String): this.type = js.native
  def bonjour(value: scala.Boolean): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_error(value: webpackDashChainLib.webpackDashChainLibStrings.error): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_info(value: webpackDashChainLib.webpackDashChainLibStrings.info): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_none(value: webpackDashChainLib.webpackDashChainLibStrings.none): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_warning(value: webpackDashChainLib.webpackDashChainLibStrings.warning): this.type = js.native
  def color(value: scala.Boolean): this.type = js.native
  def compress(value: scala.Boolean): this.type = js.native
  def contentBase(value: java.lang.String): this.type = js.native
  def contentBase(value: js.Array[java.lang.String]): this.type = js.native
  def contentBase(value: scala.Boolean): this.type = js.native
  def disableHostCheck(value: scala.Boolean): this.type = js.native
  def filename(value: java.lang.String): this.type = js.native
  def headers(value: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def historyApiFallback(value: js.Any): this.type = js.native
  def historyApiFallback(value: scala.Boolean): this.type = js.native
  def host(value: java.lang.String): this.type = js.native
  def hot(value: scala.Boolean): this.type = js.native
  def hotOnly(value: scala.Boolean): this.type = js.native
  def https(value: nodeLib.httpsMod.ServerOptions): this.type = js.native
  def https(value: scala.Boolean): this.type = js.native
  def info(value: scala.Boolean): this.type = js.native
  def `inline`(value: scala.Boolean): this.type = js.native
  def `lazy`(value: scala.Boolean): this.type = js.native
  def noInfo(value: scala.Boolean): this.type = js.native
  def open(value: scala.Boolean): this.type = js.native
  def overlay(value: scala.Boolean): this.type = js.native
  def overlay(value: webpackDashChainLib.Anon_Errors): this.type = js.native
  def pfx(value: java.lang.String): this.type = js.native
  def pfxPassphrase(value: java.lang.String): this.type = js.native
  def port(value: scala.Double): this.type = js.native
  def progress(value: scala.Boolean): this.type = js.native
  def proxy(value: js.Any): this.type = js.native
  def publicPath(publicPath: java.lang.String): this.type = js.native
  def quiet(value: scala.Boolean): this.type = js.native
  def setup(value: js.Function1[/* expressApp */ js.Any, scala.Unit]): this.type = js.native
  def socket(value: java.lang.String): this.type = js.native
  def staticOptions(value: js.Any): this.type = js.native
  def stats(value: webpackLib.webpackMod.webpackNs.OptionsNs.Stats): this.type = js.native
  def stdin(value: scala.Boolean): this.type = js.native
  def useLocalIp(value: scala.Boolean): this.type = js.native
  def watchContentBase(value: scala.Boolean): this.type = js.native
  def watchOptions(value: js.Any): this.type = js.native
}

