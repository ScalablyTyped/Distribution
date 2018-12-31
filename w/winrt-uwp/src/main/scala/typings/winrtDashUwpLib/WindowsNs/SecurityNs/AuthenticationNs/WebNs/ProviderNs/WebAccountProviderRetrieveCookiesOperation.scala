package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a retrieve cookies operation made by a web account provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation")
@js.native
abstract class WebAccountProviderRetrieveCookiesOperation () extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the context of the retrieve cookies operation. */
  var context: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the cookies. */
  var cookies: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCookie] = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets or sets the Uri to retrieve cookies from. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): scala.Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError): scala.Unit = js.native
}

