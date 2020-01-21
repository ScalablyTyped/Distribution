package typings.webpackDevServer.mod.webpackAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * Can be used to configure the behaviour of webpack-dev-server when
    * the webpack config is passed to webpack-dev-server CLI.
    */
  var devServer: js.UndefOr[Configuration] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(devServer: Configuration = null): Configuration = {
    val __obj = js.Dynamic.literal()
    if (devServer != null) __obj.updateDynamic("devServer")(devServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

