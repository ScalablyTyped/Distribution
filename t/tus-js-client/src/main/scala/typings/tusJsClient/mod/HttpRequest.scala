package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRequest extends js.Object {
  def abort(): js.Promise[Unit] = js.native
  def getHeader(header: String): String = js.native
  def getMethod(): String = js.native
  def getURL(): String = js.native
  // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
  def getUnderlyingObject(): js.Any = js.native
  def send(body: js.Any): js.Promise[HttpResponse] = js.native
  def setHeader(header: String, value: String): Unit = js.native
  def setProgressHandler(handler: js.Function1[/* bytesSent */ Double, Unit]): Unit = js.native
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
  @scala.inline
  implicit class HttpRequestOps[Self <: HttpRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => js.Promise[Unit]): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeader(value: String => String): Self = this.set("getHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMethod(value: () => String): Self = this.set("getMethod", js.Any.fromFunction0(value))
    @scala.inline
    def setGetURL(value: () => String): Self = this.set("getURL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUnderlyingObject(value: () => js.Any): Self = this.set("getUnderlyingObject", js.Any.fromFunction0(value))
    @scala.inline
    def setSend(value: js.Any => js.Promise[HttpResponse]): Self = this.set("send", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = this.set("setHeader", js.Any.fromFunction2(value))
    @scala.inline
    def setSetProgressHandler(value: js.Function1[/* bytesSent */ Double, Unit] => Unit): Self = this.set("setProgressHandler", js.Any.fromFunction1(value))
  }
  
}

