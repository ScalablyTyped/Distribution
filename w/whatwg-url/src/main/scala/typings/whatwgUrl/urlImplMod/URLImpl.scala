package typings.whatwgUrl.urlImplMod

import typings.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLImpl extends js.Object {
  var hash: String
  var host: String
  var hostname: String
  var href: String
  val origin: String
  var password: String
  var pathname: String
  var port: String
  var protocol: String
  var search: String
  val searchParams: URLSearchParams
  var username: String
  def toJSON(): String
}

object URLImpl {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    origin: String,
    password: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String,
    searchParams: URLSearchParams,
    toJSON: () => String,
    username: String
  ): URLImpl = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLImpl]
  }
}

