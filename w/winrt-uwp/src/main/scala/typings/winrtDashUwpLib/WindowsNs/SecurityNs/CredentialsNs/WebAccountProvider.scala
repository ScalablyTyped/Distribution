package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a web account authentication provider. */
@JSGlobal("Windows.Security.Credentials.WebAccountProvider")
@js.native
class WebAccountProvider protected () extends js.Object {
  /**
                   * Creates an instance of the WebAccountProvider class.
                   * @param id The web account provider id.
                   * @param displayName The display name for the web account provider.
                   * @param iconUri The Uri of the icon image to display for the web account provider.
                   */
  def this(id: java.lang.String, displayName: java.lang.String, iconUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri) = this()
  /** Gets the authority of the web account provider. Use authority to disambiguate between a single provider with multiple identities (such as a Microsoft account versus Azure Active Directory). */
  var authority: java.lang.String = js.native
  /** Gets the display name for the web account provider. */
  var displayName: java.lang.String = js.native
  /** Gets the display purpose of the web account provider. */
  var displayPurpose: java.lang.String = js.native
  /** Gets the Uri of the icon image to display for the web account provider. */
  var iconUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the web account provider id. */
  var id: java.lang.String = js.native
  /** Gets the user associated with the provider. */
  var user: winrtDashUwpLib.WindowsNs.SystemNs.User = js.native
}

