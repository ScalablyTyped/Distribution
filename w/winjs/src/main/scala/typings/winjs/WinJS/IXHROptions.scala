package typings.winjs.WinJS

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
trait IXHROptions extends js.Object {
  var customRequestInitializer: js.UndefOr[js.Function1[/* request */ XMLHttpRequest, Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: String
  var user: js.UndefOr[String] = js.undefined
}

object IXHROptions {
  @scala.inline
  def apply(
    url: String,
    customRequestInitializer: /* request */ XMLHttpRequest => Unit = null,
    data: js.Any = null,
    headers: js.Any = null,
    password: String = null,
    responseType: String = null,
    `type`: String = null,
    user: String = null
  ): IXHROptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (customRequestInitializer != null) __obj.updateDynamic("customRequestInitializer")(js.Any.fromFunction1(customRequestInitializer))
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (password != null) __obj.updateDynamic("password")(password)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IXHROptions]
  }
}

