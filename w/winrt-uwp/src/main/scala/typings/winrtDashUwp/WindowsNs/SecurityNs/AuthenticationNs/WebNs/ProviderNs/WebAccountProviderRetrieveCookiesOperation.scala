package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError
import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a retrieve cookies operation made by a web account provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation")
@js.native
abstract class WebAccountProviderRetrieveCookiesOperation () extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the context of the retrieve cookies operation. */
  var context: Uri = js.native
  /** Gets the cookies. */
  var cookies: IVector[HttpCookie] = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets or sets the Uri to retrieve cookies from. */
  var uri: Uri = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
}

