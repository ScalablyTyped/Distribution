package typings.winrtUwp.Windows.Web.Http.Filters

import typings.winrtUwp.Windows.Foundation.IClosable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Web.Http.HttpProgress
import typings.winrtUwp.Windows.Web.Http.HttpRequestMessage
import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface used to implement custom filters for an HttpClient instance. */
@js.native
trait IHttpFilter extends IClosable {
  /**
    * Send an HTTP request on the IHttpFilter instance as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress] = js.native
}

object IHttpFilter {
  @scala.inline
  def apply(
    close: () => Unit,
    sendRequestAsync: HttpRequestMessage => IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
  ): IHttpFilter = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendRequestAsync = js.Any.fromFunction1(sendRequestAsync))
    __obj.asInstanceOf[IHttpFilter]
  }
  @scala.inline
  implicit class IHttpFilterOps[Self <: IHttpFilter] (val x: Self) extends AnyVal {
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
    def setSendRequestAsync(
      value: HttpRequestMessage => IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
    ): Self = this.set("sendRequestAsync", js.Any.fromFunction1(value))
  }
  
}

