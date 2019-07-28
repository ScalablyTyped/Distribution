package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.OnlineId.UserIdentity")
@js.native
class UserIdentity () extends IUserIdentity {
  /* CompleteClass */
  override var firstName: String = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var isBetaAccount: Boolean = js.native
  /* CompleteClass */
  override var isConfirmedPC: Boolean = js.native
  /* CompleteClass */
  override var lastName: String = js.native
  /* CompleteClass */
  override var safeCustomerId: String = js.native
  /* CompleteClass */
  override var signInName: String = js.native
  /* CompleteClass */
  override var tickets: IVectorView[OnlineIdServiceTicket] = js.native
}

