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
  def apply(composeRequest: Headers => scala.Unit, parseResponse: Headers => scala.Unit): HeadersProcessor = {
    val __obj = js.Dynamic.literal(composeRequest = js.Any.fromFunction1(composeRequest), parseResponse = js.Any.fromFunction1(parseResponse))
  
    __obj.asInstanceOf[HeadersProcessor]
  }
}

