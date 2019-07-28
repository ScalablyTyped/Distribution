package typings.universalDashAnalytics.universalDashAnalyticsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends VisitorOptions {
  var cookieName: js.UndefOr[String] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    cid: String = null,
    cookieName: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    enableBatching: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    hostname: String = null,
    https: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    requestOptions: StringDictionary[js.Any] = null,
    strictCidFormat: js.UndefOr[Boolean] = js.undefined,
    tid: String = null,
    uid: String = null
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

