package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends VisitorOptions {
  var cookieName: js.UndefOr[java.lang.String] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    cid: java.lang.String = null,
    cookieName: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    enableBatching: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    hostname: java.lang.String = null,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    requestOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    strictCidFormat: js.UndefOr[scala.Boolean] = js.undefined,
    tid: java.lang.String = null,
    uid: java.lang.String = null
  ): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(enableBatching)) __obj.updateDynamic("enableBatching")(enableBatching)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (path != null) __obj.updateDynamic("path")(path)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (!js.isUndefined(strictCidFormat)) __obj.updateDynamic("strictCidFormat")(strictCidFormat)
    if (tid != null) __obj.updateDynamic("tid")(tid)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

