package typings
package unsplashDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiUrl extends js.Object {
  var apiUrl: js.UndefOr[java.lang.String] = js.undefined
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var applicationId: java.lang.String
  var bearerToken: js.UndefOr[java.lang.String] = js.undefined
  var callbackUrl: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var secret: java.lang.String
}

object Anon_ApiUrl {
  @scala.inline
  def apply(
    applicationId: java.lang.String,
    secret: java.lang.String,
    apiUrl: java.lang.String = null,
    apiVersion: java.lang.String = null,
    bearerToken: java.lang.String = null,
    callbackUrl: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_ApiUrl = {
    val __obj = js.Dynamic.literal(applicationId = applicationId, secret = secret)
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (bearerToken != null) __obj.updateDynamic("bearerToken")(bearerToken)
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_ApiUrl]
  }
}

