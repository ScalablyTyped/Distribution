package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a web account authentication provider. */
@js.native
trait WebAccountProvider extends StObject {
  
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
  implicit class WebAccountProviderMutableBuilder[Self <: WebAccountProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPurpose(value: String): Self = StObject.set(x, "displayPurpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUri(value: Uri): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
