package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a web account authentication provider. */
@js.native
trait WebAccountProvider extends js.Object {
  /** Gets the authority of the web account provider. Use authority to disambiguate between a single provider with multiple identities (such as a Microsoft account versus Azure Active Directory). */
  var authority: String = js.native
  /** Gets the display name for the web account provider. */
  var displayName: String = js.native
  /** Gets the display purpose of the web account provider. */
  var displayPurpose: String = js.native
  /** Gets the Uri of the icon image to display for the web account provider. */
  var iconUri: Uri = js.native
  /** Gets the web account provider id. */
  var id: String = js.native
  /** Gets the user associated with the provider. */
  var user: User = js.native
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
  @scala.inline
  implicit class WebAccountProviderOps[Self <: WebAccountProvider] (val x: Self) extends AnyVal {
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayPurpose(value: String): Self = this.set("displayPurpose", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconUri(value: Uri): Self = this.set("iconUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

