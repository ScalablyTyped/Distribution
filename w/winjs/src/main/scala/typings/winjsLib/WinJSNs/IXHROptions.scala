package typings
package winjsLib.WinJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
trait IXHROptions extends js.Object {
  var customRequestInitializer: js.UndefOr[js.Function1[/* request */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object IXHROptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    customRequestInitializer: /* request */ stdLib.XMLHttpRequest => scala.Unit = null,
    data: js.Any = null,
    headers: js.Any = null,
    password: java.lang.String = null,
    responseType: java.lang.String = null,
    `type`: java.lang.String = null,
    user: java.lang.String = null
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

