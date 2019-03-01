package typings
package uriDashJsLib.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIComponents extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var reference: js.UndefOr[java.lang.String] = js.undefined
  var scheme: js.UndefOr[java.lang.String] = js.undefined
  var userinfo: js.UndefOr[java.lang.String] = js.undefined
}

object URIComponents {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    fragment: java.lang.String = null,
    host: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Double | java.lang.String = null,
    query: java.lang.String = null,
    reference: java.lang.String = null,
    scheme: java.lang.String = null,
    userinfo: java.lang.String = null
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

