package typings.webpack.webpackMod

import typings.webpack.webpackMod.BannerPluginNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugins
  */
@JSImport("webpack", "BannerPlugin")
@js.native
class BannerPlugin protected () extends Plugin {
  def this(options: String) = this()
  def this(options: Options) = this()
}

