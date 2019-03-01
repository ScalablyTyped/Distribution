package typings
package xmlrpcLib.xmlrpcMod.xmlrpcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var cookies: js.UndefOr[xmlrpcLib.xmlrpcMod.Cookies] = js.undefined
  var headersProcessors: xmlrpcLib.Anon_Processors
  var isSecure: scala.Boolean
  var options: xmlrpcLib.xmlrpcMod.ClientOptions
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
    getCookie: js.Function1[java.lang.String, java.lang.String],
    headersProcessors: xmlrpcLib.Anon_Processors,
    isSecure: scala.Boolean,
    methodCall: js.Function3[
      java.lang.String, 
      js.Array[_], 
      js.Function2[/* error */ js.Object, /* value */ js.Any, scala.Unit], 
      scala.Unit
    ],
    options: xmlrpcLib.xmlrpcMod.ClientOptions,
    setCookie: js.Function2[java.lang.String, java.lang.String, Client],
    cookies: xmlrpcLib.xmlrpcMod.Cookies = null
  ): Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCookie")(getCookie)
    __obj.updateDynamic("headersProcessors")(headersProcessors)
    __obj.updateDynamic("isSecure")(isSecure)
    __obj.updateDynamic("methodCall")(methodCall)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("setCookie")(setCookie)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    __obj.asInstanceOf[Client]
  }
}

