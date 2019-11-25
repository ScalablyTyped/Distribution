package typings.unsplashDashJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiUrl extends js.Object {
  var apiUrl: js.UndefOr[String] = js.undefined
  var apiVersion: js.UndefOr[String] = js.undefined
  var applicationId: String
  var bearerToken: js.UndefOr[String] = js.undefined
  var callbackUrl: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var secret: String
}

object Anon_ApiUrl {
  @scala.inline
  def apply(
    applicationId: String,
    secret: String,
    apiUrl: String = null,
    apiVersion: String = null,
    bearerToken: String = null,
    callbackUrl: String = null,
    headers: StringDictionary[String] = null
  ): Anon_ApiUrl = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (bearerToken != null) __obj.updateDynamic("bearerToken")(bearerToken.asInstanceOf[js.Any])
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApiUrl]
  }
}

