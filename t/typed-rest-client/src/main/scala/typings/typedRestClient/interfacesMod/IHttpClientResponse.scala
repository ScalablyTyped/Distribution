package typings.typedRestClient.interfacesMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpClientResponse extends js.Object {
  var message: IncomingMessage
  def readBody(): js.Promise[String]
}

object IHttpClientResponse {
  @scala.inline
  def apply(message: IncomingMessage, readBody: () => js.Promise[String]): IHttpClientResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], readBody = js.Any.fromFunction0(readBody))
    __obj.asInstanceOf[IHttpClientResponse]
  }
}

