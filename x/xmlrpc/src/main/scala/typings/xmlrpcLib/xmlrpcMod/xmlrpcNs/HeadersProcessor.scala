package typings
package xmlrpcLib.xmlrpcMod.xmlrpcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersProcessor extends js.Object {
  def composeRequest(headers: Headers): scala.Unit
  def parseResponse(headers: Headers): scala.Unit
}

object HeadersProcessor {
  @scala.inline
  def apply(
    composeRequest: js.Function1[Headers, scala.Unit],
    parseResponse: js.Function1[Headers, scala.Unit]
  ): HeadersProcessor = {
    val __obj = js.Dynamic.literal(composeRequest = composeRequest, parseResponse = parseResponse)
  
    __obj.asInstanceOf[HeadersProcessor]
  }
}

