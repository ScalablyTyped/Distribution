package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a retrieve cookies operation made by a web account provider. */
trait WebAccountProviderRetrieveCookiesOperation extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  /** Gets the context of the retrieve cookies operation. */
  var context: Uri
  /** Gets the cookies. */
  var cookies: IVector[HttpCookie]
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  /** Gets or sets the Uri to retrieve cookies from. */
  var uri: Uri
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
}

object WebAccountProviderRetrieveCookiesOperation {
  @scala.inline
  def apply(
    applicationCallbackUri: Uri,
    context: Uri,
    cookies: IVector[HttpCookie],
    kind: WebAccountProviderOperationKind,
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    uri: Uri
  ): WebAccountProviderRetrieveCookiesOperation = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderRetrieveCookiesOperation]
  }
}

