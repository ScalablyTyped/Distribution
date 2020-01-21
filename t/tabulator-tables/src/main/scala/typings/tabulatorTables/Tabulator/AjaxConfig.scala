package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxConfig extends js.Object {
  var credentials: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[JSONRecord] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object AjaxConfig {
  @scala.inline
  def apply(
    credentials: String = null,
    headers: JSONRecord = null,
    method: HttpMethod = null,
    mode: String = null
  ): AjaxConfig = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxConfig]
  }
}

