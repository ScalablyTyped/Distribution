package typings.xhr2Cookies.xmlHttpRequestMod

import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XHRUrl extends Url {
  var method: js.UndefOr[String] = js.undefined
}

object XHRUrl {
  @scala.inline
  def apply(
    href: String,
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    query: String | ParsedUrlQuery = null,
    search: String = null,
    slashes: Boolean = null.asInstanceOf[Boolean]
  ): XHRUrl = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHRUrl]
  }
}

