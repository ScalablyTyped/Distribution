package typings.whatwgUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLRecord extends js.Object {
  var cannotBeABaseURL: js.UndefOr[Boolean] = js.undefined
  var fragment: String | Null
  var host: String | Double | IPv6Address | Null
  var password: String
  var path: js.Array[String]
  var port: Double | Null
  var query: String | Null
  var scheme: String
  var username: String
}

object URLRecord {
  @scala.inline
  def apply(
    password: String,
    path: js.Array[String],
    scheme: String,
    username: String,
    cannotBeABaseURL: js.UndefOr[Boolean] = js.undefined,
    fragment: String = null,
    host: String | Double | IPv6Address = null,
    port: Int | Double = null,
    query: String = null
  ): URLRecord = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(cannotBeABaseURL)) __obj.updateDynamic("cannotBeABaseURL")(cannotBeABaseURL.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLRecord]
  }
}

