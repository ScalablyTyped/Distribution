package typings
package xhrDashMockLib.libMockURLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockURL extends js.Object {
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object MockURL {
  @scala.inline
  def apply(
    toString: js.Function0[java.lang.String],
    hash: java.lang.String = null,
    host: java.lang.String = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    query: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    username: java.lang.String = null
  ): MockURL = {
    val __obj = js.Dynamic.literal(toString = toString)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[MockURL]
  }
}

