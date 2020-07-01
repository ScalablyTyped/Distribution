package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequest extends js.Object {
  def abort(): js.Promise[Unit]
  def getHeader(header: String): String
  def getMethod(): String
  def getURL(): String
  // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
  def getUnderlyingObject(): js.Any
  def send(body: js.Any): js.Promise[HttpResponse]
  def setHeader(header: String, value: String): Unit
  def setProgressHandler(handler: js.Function1[/* bytesSent */ Double, Unit]): Unit
}

object HttpRequest {
  @scala.inline
  def apply(
    abort: () => js.Promise[Unit],
    getHeader: String => String,
    getMethod: () => String,
    getURL: () => String,
    getUnderlyingObject: () => js.Any,
    send: js.Any => js.Promise[HttpResponse],
    setHeader: (String, String) => Unit,
    setProgressHandler: js.Function1[/* bytesSent */ Double, Unit] => Unit
  ): HttpRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getHeader = js.Any.fromFunction1(getHeader), getMethod = js.Any.fromFunction0(getMethod), getURL = js.Any.fromFunction0(getURL), getUnderlyingObject = js.Any.fromFunction0(getUnderlyingObject), send = js.Any.fromFunction1(send), setHeader = js.Any.fromFunction2(setHeader), setProgressHandler = js.Any.fromFunction1(setProgressHandler))
    __obj.asInstanceOf[HttpRequest]
  }
}

