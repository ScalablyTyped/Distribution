package typings
package urijsLib.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parts extends URIOptions {
  var preventInvalidHostname: scala.Boolean
}

object Parts {
  @scala.inline
  def apply(
    preventInvalidHostname: scala.Boolean,
    fragment: java.lang.String = null,
    hostname: java.lang.String = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    port: java.lang.String = null,
    protocol: java.lang.String = null,
    query: java.lang.String = null,
    urn: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
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

