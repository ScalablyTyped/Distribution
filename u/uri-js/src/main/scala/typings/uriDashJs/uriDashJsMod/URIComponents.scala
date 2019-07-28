package typings.uriDashJs.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIComponents extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var fragment: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double | String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var reference: js.UndefOr[String] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
  var userinfo: js.UndefOr[String] = js.undefined
}

object URIComponents {
  @scala.inline
  def apply(
    error: String = null,
    fragment: String = null,
    host: String = null,
    path: String = null,
    port: Double | String = null,
    query: String = null,
    reference: String = null,
    scheme: String = null,
    userinfo: String = null
  ): URIComponents = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (userinfo != null) __obj.updateDynamic("userinfo")(userinfo)
    __obj.asInstanceOf[URIComponents]
  }
}

