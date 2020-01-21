package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientView")
@js.native
class WebAccountClientView protected () extends js.Object {
  /**
    * Creates a new instance of the WebAccountClientView class.
    * @param viewType The client view type.
    * @param applicationCallbackUri The callback URI that indicates the completion of the operation.
    */
  def this(viewType: WebAccountClientViewType, applicationCallbackUri: Uri) = this()
  /**
    * Creates a new instance of the WebAccountClientView class.
    * @param viewType The client view type.
    * @param applicationCallbackUri The callback URI that indicates the completion of the operation.
    * @param accountPairwiseId The account pairwise Id.
    */
  def this(viewType: WebAccountClientViewType, applicationCallbackUri: Uri, accountPairwiseId: String) = this()
  /** Gets the account pairwise Id. */
  var accountPairwiseId: String = js.native
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the type of web account client view. */
  var `type`: WebAccountClientViewType = js.native
}

