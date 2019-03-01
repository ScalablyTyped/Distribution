package typings
package webpackDashServeLib.webpackDashServeMod.WebpackServeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  /** Name of the browser to open */
  var app: js.UndefOr[java.lang.String] = js.undefined
  /** Path on the server to open */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(app: java.lang.String = null, path: java.lang.String = null): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[OpenOptions]
  }
}

