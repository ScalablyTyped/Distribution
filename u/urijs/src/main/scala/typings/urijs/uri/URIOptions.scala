package typings.urijs.uri

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
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(urn)) __obj.updateDynamic("urn")(urn)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[URIOptions]
  }
}

