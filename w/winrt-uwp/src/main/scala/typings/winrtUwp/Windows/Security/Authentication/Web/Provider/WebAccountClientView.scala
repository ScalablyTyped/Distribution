package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
@js.native
trait WebAccountClientView extends js.Object {
  
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
  implicit class WebAccountClientViewOps[Self <: WebAccountClientView] (val x: Self) extends AnyVal {
    
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
    def setAccountPairwiseId(value: String): Self = this.set("accountPairwiseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCallbackUri(value: Uri): Self = this.set("applicationCallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WebAccountClientViewType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
