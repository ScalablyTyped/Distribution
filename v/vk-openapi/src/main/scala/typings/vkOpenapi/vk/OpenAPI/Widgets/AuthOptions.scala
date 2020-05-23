package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var authUrl: js.UndefOr[String] = js.undefined
  var onAuth: js.UndefOr[js.Function1[/* user */ AuthUserData, Unit]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    authUrl: String = null,
    onAuth: /* user */ AuthUserData => Unit = null,
    width: js.UndefOr[Double] = js.undefined
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (authUrl != null) __obj.updateDynamic("authUrl")(authUrl.asInstanceOf[js.Any])
    if (onAuth != null) __obj.updateDynamic("onAuth")(js.Any.fromFunction1(onAuth))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

