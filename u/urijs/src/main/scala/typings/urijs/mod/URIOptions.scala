package typings.urijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIOptions extends js.Object {
  var fragment: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var urn: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object URIOptions {
  @scala.inline
  def apply(
    fragment: String = null,
    hostname: String = null,
    password: String = null,
    path: String = null,
    port: String = null,
    protocol: String = null,
    query: String = null,
    urn: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): URIOptions = {
    val __obj = js.Dynamic.literal()
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(urn)) __obj.updateDynamic("urn")(urn.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[URIOptions]
  }
}

