package typings.urijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parts extends URIOptions {
  var duplicateQueryParameters: Boolean
  var escapeQuerySpace: Boolean
  var preventInvalidHostname: Boolean
}

object Parts {
  @scala.inline
  def apply(
    duplicateQueryParameters: Boolean,
    escapeQuerySpace: Boolean,
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
    val __obj = js.Dynamic.literal(duplicateQueryParameters = duplicateQueryParameters.asInstanceOf[js.Any], escapeQuerySpace = escapeQuerySpace.asInstanceOf[js.Any], preventInvalidHostname = preventInvalidHostname.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(urn)) __obj.updateDynamic("urn")(urn.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parts]
  }
}

