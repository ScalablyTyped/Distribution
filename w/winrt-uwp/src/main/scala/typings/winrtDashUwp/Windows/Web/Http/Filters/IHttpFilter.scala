package typings.winrtDashUwp.Windows.Web.Http.Filters

import typings.winrtDashUwp.Windows.Foundation.IClosable
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Web.Http.HttpProgress
import typings.winrtDashUwp.Windows.Web.Http.HttpRequestMessage
import typings.winrtDashUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface used to implement custom filters for an HttpClient instance. */
trait IHttpFilter extends IClosable {
  /**
    * Send an HTTP request on the IHttpFilter instance as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
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
}

