package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the `VisualRecognitionV3` constructor. */
trait Options extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var iam_access_token: js.UndefOr[String] = js.undefined
  var iam_apikey: js.UndefOr[String] = js.undefined
  var iam_url: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var use_unauthenticated: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var version: String
}

object Options {
  @scala.inline
  def apply(
    version: String,
    headers: js.Object = null,
    iam_access_token: String = null,
    iam_apikey: String = null,
    iam_url: String = null,
    password: String = null,
    url: String = null,
    use_unauthenticated: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(version = version)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (iam_access_token != null) __obj.updateDynamic("iam_access_token")(iam_access_token)
    if (iam_apikey != null) __obj.updateDynamic("iam_apikey")(iam_apikey)
    if (iam_url != null) __obj.updateDynamic("iam_url")(iam_url)
    if (password != null) __obj.updateDynamic("password")(password)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(use_unauthenticated)) __obj.updateDynamic("use_unauthenticated")(use_unauthenticated)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Options]
  }
}

