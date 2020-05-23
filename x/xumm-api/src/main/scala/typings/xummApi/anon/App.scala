package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var app: js.UndefOr[String] = js.undefined
  var web: js.UndefOr[String] = js.undefined
}

object App {
  @scala.inline
  def apply(app: String = null, web: String = null): App = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

