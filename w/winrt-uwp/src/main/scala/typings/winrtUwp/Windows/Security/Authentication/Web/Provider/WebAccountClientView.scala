package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
@js.native
trait WebAccountClientView extends StObject {
  
  /** Gets the account pairwise Id. */
  var accountPairwiseId: String = js.native
  
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  
  /** Gets the type of web account client view. */
  var `type`: WebAccountClientViewType = js.native
}
object WebAccountClientView {
  
  @scala.inline
  def apply(accountPairwiseId: String, applicationCallbackUri: Uri, `type`: WebAccountClientViewType): WebAccountClientView = {
    val __obj = js.Dynamic.literal(accountPairwiseId = accountPairwiseId.asInstanceOf[js.Any], applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountClientView]
  }
  
  @scala.inline
  implicit class WebAccountClientViewMutableBuilder[Self <: WebAccountClientView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPairwiseId(value: String): Self = StObject.set(x, "accountPairwiseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCallbackUri(value: Uri): Self = StObject.set(x, "applicationCallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WebAccountClientViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
