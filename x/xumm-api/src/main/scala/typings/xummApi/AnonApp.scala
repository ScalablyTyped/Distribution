package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  var app: js.UndefOr[String] = js.undefined
  var web: js.UndefOr[String] = js.undefined
}

object AnonApp {
  @scala.inline
  def apply(app: String = null, web: String = null): AnonApp = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
}

