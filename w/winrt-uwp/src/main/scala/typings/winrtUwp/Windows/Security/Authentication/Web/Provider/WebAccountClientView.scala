package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
trait WebAccountClientView extends js.Object {
  /** Gets the account pairwise Id. */
  var accountPairwiseId: String
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  /** Gets the type of web account client view. */
  var `type`: WebAccountClientViewType
}

object WebAccountClientView {
  @scala.inline
  def apply(accountPairwiseId: String, applicationCallbackUri: Uri, `type`: WebAccountClientViewType): WebAccountClientView = {
    val __obj = js.Dynamic.literal(accountPairwiseId = accountPairwiseId.asInstanceOf[js.Any], applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountClientView]
  }
}

