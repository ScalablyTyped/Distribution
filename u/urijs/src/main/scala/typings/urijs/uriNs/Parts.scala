package typings.urijs.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parts extends URIOptions {
  var preventInvalidHostname: Boolean
}

object Parts {
  @scala.inline
  def apply(
    preventInvalidHostname: Boolean,
    fragment: String = null,
    hostname: String = null,
    password: String = null,
    path: String = null,
    port: String = null,
    protocol: String = null,
    query: String = null,
    urn: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): Parts = {
    val __obj = js.Dynamic.literal(preventInvalidHostname = preventInvalidHostname)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(urn)) __obj.updateDynamic("urn")(urn)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Parts]
  }
}

