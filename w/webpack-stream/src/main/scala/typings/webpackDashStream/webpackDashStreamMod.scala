package typings.webpackDashStream

import typings.node.NodeJSNs.ReadWriteStream
import typings.webpack.webpackMod.CompilerNs.Handler
import typings.webpack.webpackMod.Configuration
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
  def apply(): ReadWriteStream = js.native
  def apply(config: Configuration): ReadWriteStream = js.native
  def apply(config: Configuration, wp: Anon_BannerPlugin): ReadWriteStream = js.native
  def apply(config: Configuration, wp: Anon_BannerPlugin, callback: Handler): ReadWriteStream = js.native
}

