package typings
package webpackDashServeLib.webpackDashServeMod.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var serve: js.UndefOr[webpackDashServeLib.webpackDashServeMod.WebpackServeNs.Options] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(serve: webpackDashServeLib.webpackDashServeMod.WebpackServeNs.Options = null): Configuration = {
    val __obj = js.Dynamic.literal()
    if (serve != null) __obj.updateDynamic("serve")(serve)
    __obj.asInstanceOf[Configuration]
  }
}

