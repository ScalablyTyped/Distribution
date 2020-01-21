package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the `TextToSpeechV1` constructor. */
trait Options extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var iam_access_token: js.UndefOr[String] = js.undefined
  var iam_apikey: js.UndefOr[String] = js.undefined
  var iam_url: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var use_unauthenticated: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    headers: js.Object = null,
    iam_access_token: String = null,
    iam_apikey: String = null,
    iam_url: String = null,
    password: String = null,
    url: String = null,
    use_unauthenticated: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (iam_access_token != null) __obj.updateDynamic("iam_access_token")(iam_access_token.asInstanceOf[js.Any])
    if (iam_apikey != null) __obj.updateDynamic("iam_apikey")(iam_apikey.asInstanceOf[js.Any])
    if (iam_url != null) __obj.updateDynamic("iam_url")(iam_url.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(use_unauthenticated)) __obj.updateDynamic("use_unauthenticated")(use_unauthenticated.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

