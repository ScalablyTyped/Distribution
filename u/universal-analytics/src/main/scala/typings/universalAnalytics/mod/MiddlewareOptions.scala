package typings.universalAnalytics.mod

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
    batchSize: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBatching)) __obj.updateDynamic("enableBatching")(enableBatching.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(strictCidFormat)) __obj.updateDynamic("strictCidFormat")(strictCidFormat.get.asInstanceOf[js.Any])
    if (tid != null) __obj.updateDynamic("tid")(tid.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

