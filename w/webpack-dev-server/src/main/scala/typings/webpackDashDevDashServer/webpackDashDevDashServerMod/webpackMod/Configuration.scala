package typings.webpackDashDevDashServer.webpackDashDevDashServerMod.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Can be used to configure the behaviour of webpack-dev-server when the webpack config is passed to webpack-dev-server CLI. */
  var devServer: js.UndefOr[
    typings.webpackDashDevDashServer.webpackDashDevDashServerMod.webpackMod.Configuration
  ] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    devServer: typings.webpackDashDevDashServer.webpackDashDevDashServerMod.webpackMod.Configuration = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (devServer != null) __obj.updateDynamic("devServer")(devServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

