package typings.xhrDashMock.libMockURLMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockURL extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[StringDictionary[String]] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object MockURL {
  @scala.inline
  def apply(
    toString: () => String,
    hash: String = null,
    host: String = null,
    password: String = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    query: StringDictionary[String] = null,
    username: String = null
  ): MockURL = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
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

