package typings.webpackDashServe.webpackDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  /** Name of the browser to open */
  var app: js.UndefOr[String] = js.undefined
  /** Path on the server to open */
  var path: js.UndefOr[String] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(app: String = null, path: String = null): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[OpenOptions]
  }
}

