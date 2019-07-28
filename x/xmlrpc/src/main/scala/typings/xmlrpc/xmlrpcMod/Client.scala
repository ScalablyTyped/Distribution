package typings.xmlrpc.xmlrpcMod

import typings.xmlrpc.Anon_Processors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var cookies: js.UndefOr[Cookies] = js.undefined
  var headersProcessors: Anon_Processors
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
    headersProcessors: Anon_Processors,
    isSecure: Boolean,
    methodCall: (String, js.Array[_], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit,
    options: ClientOptions,
    setCookie: (String, String) => Client,
    cookies: Cookies = null
  ): Client = {
    val __obj = js.Dynamic.literal(getCookie = js.Any.fromFunction1(getCookie), headersProcessors = headersProcessors, isSecure = isSecure, methodCall = js.Any.fromFunction3(methodCall), options = options, setCookie = js.Any.fromFunction2(setCookie))
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    __obj.asInstanceOf[Client]
  }
}

