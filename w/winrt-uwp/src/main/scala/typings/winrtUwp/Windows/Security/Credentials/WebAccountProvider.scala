package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a web account authentication provider. */
trait WebAccountProvider extends js.Object {
  /** Gets the authority of the web account provider. Use authority to disambiguate between a single provider with multiple identities (such as a Microsoft account versus Azure Active Directory). */
  var authority: String
  /** Gets the display name for the web account provider. */
  var displayName: String
  /** Gets the display purpose of the web account provider. */
  var displayPurpose: String
  /** Gets the Uri of the icon image to display for the web account provider. */
  var iconUri: Uri
  /** Gets the web account provider id. */
  var id: String
  /** Gets the user associated with the provider. */
  var user: User
}

object WebAccountProvider {
  @scala.inline
  def apply(
    authority: String,
    displayName: String,
    displayPurpose: String,
    iconUri: Uri,
    id: String,
    user: User
  ): WebAccountProvider = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayPurpose = displayPurpose.asInstanceOf[js.Any], iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProvider]
  }
}

