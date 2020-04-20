package typings.xmlrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersProcessor extends js.Object {
  def composeRequest(headers: Headers): Unit
  def parseResponse(headers: Headers): Unit
}

object HeadersProcessor {
  @scala.inline
  def apply(composeRequest: Headers => Unit, parseResponse: Headers => Unit): HeadersProcessor = {
    val __obj = js.Dynamic.literal(composeRequest = js.Any.fromFunction1(composeRequest), parseResponse = js.Any.fromFunction1(parseResponse))
    __obj.asInstanceOf[HeadersProcessor]
  }
}

