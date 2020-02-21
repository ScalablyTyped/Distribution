package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppWeb extends js.Object {
  var app: String | Null
  var web: String | Null
}

object AnonAppWeb {
  @scala.inline
  def apply(app: String = null, web: String = null): AnonAppWeb = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppWeb]
  }
}

