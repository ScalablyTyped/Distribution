package typings
package whatwgDashUrlLib.whatwgDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLRecord extends js.Object {
  var cannotBeABaseURL: js.UndefOr[scala.Boolean] = js.undefined
  var fragment: java.lang.String | scala.Null
  var host: java.lang.String | scala.Double | IPv6Address | scala.Null
  var password: java.lang.String
  var path: js.Array[java.lang.String]
  var port: scala.Double | scala.Null
  var query: java.lang.String | scala.Null
  var scheme: java.lang.String
  var username: java.lang.String
}

object URLRecord {
  @scala.inline
  def apply(
    password: java.lang.String,
    path: js.Array[java.lang.String],
    scheme: java.lang.String,
    username: java.lang.String,
    cannotBeABaseURL: js.UndefOr[scala.Boolean] = js.undefined,
    fragment: java.lang.String = null,
    host: java.lang.String | scala.Double | IPv6Address = null,
    port: scala.Int | scala.Double = null,
    query: java.lang.String = null
  ): URLRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("scheme")(scheme)
    __obj.updateDynamic("username")(username)
    if (!js.isUndefined(cannotBeABaseURL)) __obj.updateDynamic("cannotBeABaseURL")(cannotBeABaseURL)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[URLRecord]
  }
}

