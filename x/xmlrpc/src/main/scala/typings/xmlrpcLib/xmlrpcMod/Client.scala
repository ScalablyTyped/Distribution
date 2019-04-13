package typings
package xmlrpcLib.xmlrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var cookies: js.UndefOr[Cookies] = js.undefined
  var headersProcessors: xmlrpcLib.Anon_Processors
  var isSecure: scala.Boolean
  var options: ClientOptions
  def getCookie(name: java.lang.String): java.lang.String
  def methodCall(
    method: java.lang.String,
    params: js.Array[_],
    callback: js.Function2[/* error */ js.Object, /* value */ js.Any, scala.Unit]
  ): scala.Unit
  def setCookie(name: java.lang.String, value: java.lang.String): this.type
}

object Client {
  @scala.inline
  def apply(
    getCookie: java.lang.String => java.lang.String,
    headersProcessors: xmlrpcLib.Anon_Processors,
    isSecure: scala.Boolean,
    methodCall: (java.lang.String, js.Array[_], js.Function2[/* error */ js.Object, /* value */ js.Any, scala.Unit]) => scala.Unit,
    options: ClientOptions,
    setCookie: (java.lang.String, java.lang.String) => Client,
    cookies: Cookies = null
  ): Client = {
    val __obj = js.Dynamic.literal(getCookie = js.Any.fromFunction1(getCookie), headersProcessors = headersProcessors, isSecure = isSecure, methodCall = js.Any.fromFunction3(methodCall), options = options, setCookie = js.Any.fromFunction2(setCookie))
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    __obj.asInstanceOf[Client]
  }
}

