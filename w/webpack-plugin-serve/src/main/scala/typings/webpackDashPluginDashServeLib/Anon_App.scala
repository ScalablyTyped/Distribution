package typings
package webpackDashPluginDashServeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  @JSName("wait")
  var wait_FAnon_App: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_App {
  @scala.inline
  def apply(
    app: java.lang.String | js.Array[java.lang.String] = null,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_App = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_App]
  }
}

