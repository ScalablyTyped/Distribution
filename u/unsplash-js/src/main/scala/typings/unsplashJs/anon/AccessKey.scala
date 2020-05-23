package typings.unsplashJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKey extends js.Object {
  var accessKey: String
  var apiUrl: js.UndefOr[String] = js.undefined
  var apiVersion: js.UndefOr[String] = js.undefined
  var bearerToken: js.UndefOr[String] = js.undefined
  var callbackUrl: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AccessKey {
  @scala.inline
  def apply(
    accessKey: String,
    apiUrl: String = null,
    apiVersion: String = null,
    bearerToken: String = null,
    callbackUrl: String = null,
    headers: StringDictionary[String] = null,
    secret: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): AccessKey = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any])
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (bearerToken != null) __obj.updateDynamic("bearerToken")(bearerToken.asInstanceOf[js.Any])
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
}

