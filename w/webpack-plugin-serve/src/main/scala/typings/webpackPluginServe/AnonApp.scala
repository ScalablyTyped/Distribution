package typings.webpackPluginServe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  var app: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("wait")
  var wait_FAnonApp: js.UndefOr[Boolean] = js.undefined
}

object AnonApp {
  @scala.inline
  def apply(app: String | js.Array[String] = null, wait: js.UndefOr[Boolean] = js.undefined): AnonApp = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
}

