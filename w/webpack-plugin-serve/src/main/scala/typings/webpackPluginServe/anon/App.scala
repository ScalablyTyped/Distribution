package typings.webpackPluginServe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var app: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("wait")
  var wait_FApp: js.UndefOr[Boolean] = js.undefined
}

object App {
  @scala.inline
  def apply(app: String | js.Array[String] = null, wait: js.UndefOr[Boolean] = js.undefined): App = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

