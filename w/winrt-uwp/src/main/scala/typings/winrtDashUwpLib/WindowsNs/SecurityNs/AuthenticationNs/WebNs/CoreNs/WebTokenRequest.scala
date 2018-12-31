package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request to an online identity provider for an authentication token. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequest")
@js.native
class WebTokenRequest protected () extends js.Object {
  /**
    * Initializes a new instance of the WebTokenRequest class with one inputs.
    * @param provider The web account provider the request is for.
    */
  def this(provider: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider) = this()
  /**
    * Initializes a new instance of the WebTokenRequest class with two inputs.
    * @param provider The web account provider the request is for.
    * @param scope The scope of the request.
    */
  def this(provider: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider, scope: java.lang.String) = this()
  /**
    * Initializes a new instance of the WebTokenRequest class with three inputs.
    * @param provider The web account provider the request is for.
    * @param scope The scope of the request.
    * @param clientId The client Id.
    */
  def this(provider: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider, scope: java.lang.String, clientId: java.lang.String) = this()
  /**
    * Initializes a new instance of the WebTokenRequest class with four inputs.
    * @param provider The web account provider the request is for.
    * @param scope The scope of the request.
    * @param clientId The client Id.
    * @param promptType The request prompt type.
    */
  def this(provider: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider, scope: java.lang.String, clientId: java.lang.String, promptType: WebTokenRequestPromptType) = this()
  var appProperties: js.Any = js.native
   /* unmapped type */ /** Gets the Id of the client making the request. */
  var clientId: java.lang.String = js.native
  /** Gets the prompt type of the request. */
  var promptType: WebTokenRequestPromptType = js.native
  /** Gets the properties of the request. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets the scope of the request. */
  var scope: java.lang.String = js.native
  /** Gets the web account provider for the request. */
  var webAccountProvider: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider = js.native
}

