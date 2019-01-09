package typings
package webpackDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-stream", JSImport.Namespace)
@js.native
object webpackDashStreamMod extends js.Object {
  /**
    * Run webpack with the specified configuration and webpack instance
    *
    * @param config - Webpack configuration
    * @param wp - A webpack object
    * @param callback - A callback with the webpack stats and error objects.
    */
  def apply(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(config: webpackLib.webpackMod.webpackNs.Configuration): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(
    config: webpackLib.webpackMod.webpackNs.Configuration,
    wp: webpackDashStreamLib.Anon_BannerPluginCompilation
  ): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(
    config: webpackLib.webpackMod.webpackNs.Configuration,
    wp: webpackDashStreamLib.Anon_BannerPluginCompilation,
    callback: webpackLib.webpackMod.webpackNs.CompilerNs.Handler
  ): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

