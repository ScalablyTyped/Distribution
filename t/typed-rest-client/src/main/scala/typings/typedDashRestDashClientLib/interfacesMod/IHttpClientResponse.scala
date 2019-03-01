package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpClientResponse extends js.Object {
  var message: nodeLib.httpMod.IncomingMessage
  def readBody(): js.Promise[java.lang.String]
}

object IHttpClientResponse {
  @scala.inline
  def apply(message: nodeLib.httpMod.IncomingMessage, readBody: js.Function0[js.Promise[java.lang.String]]): IHttpClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("readBody")(readBody)
    __obj.asInstanceOf[IHttpClientResponse]
  }
}

