package typings.xmlrpc.mod

import typings.xmlrpc.AnonProcessors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var cookies: js.UndefOr[Cookies] = js.undefined
  var headersProcessors: AnonProcessors
  var isSecure: Boolean
  var options: ClientOptions
  def getCookie(name: String): String
  def methodCall(
    method: String,
    params: js.Array[_],
    callback: js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]
  ): Unit
  def setCookie(name: String, value: String): this.type
}

object Client {
  @scala.inline
  def apply(
    getCookie: String => String,
    headersProcessors: AnonProcessors,
    isSecure: Boolean,
    methodCall: (String, js.Array[_], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit,
    options: ClientOptions,
    setCookie: (String, String) => Client,
    cookies: Cookies = null
  ): Client = {
    val __obj = js.Dynamic.literal(getCookie = js.Any.fromFunction1(getCookie), headersProcessors = headersProcessors.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], methodCall = js.Any.fromFunction3(methodCall), options = options.asInstanceOf[js.Any], setCookie = js.Any.fromFunction2(setCookie))
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

