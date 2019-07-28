package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IClosable
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpProgress
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpRequestMessage
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpResponseMessage
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

