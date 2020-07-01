package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  def getBody(): String
  def getHeader(header: String): String
  def getStatus(): Double
  // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
  def getUnderlyingObject(): js.Any
}

object HttpResponse {
  @scala.inline
  def apply(
    getBody: () => String,
    getHeader: String => String,
    getStatus: () => Double,
    getUnderlyingObject: () => js.Any
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getHeader = js.Any.fromFunction1(getHeader), getStatus = js.Any.fromFunction0(getStatus), getUnderlyingObject = js.Any.fromFunction0(getUnderlyingObject))
    __obj.asInstanceOf[HttpResponse]
  }
}

