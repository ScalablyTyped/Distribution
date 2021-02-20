package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband account and related information about the network provider for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
abstract class MobileBroadbandAccount ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount
object MobileBroadbandAccount {
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
  @js.native
  val ^ : js.Any = js.native
  
  /** A list of all network account IDs for the network service provider. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount.availableNetworkAccountIds")
  @js.native
  def availableNetworkAccountIds: IVectorView[String] = js.native
  @scala.inline
  def availableNetworkAccountIds_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableNetworkAccountIds")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a mobile broadband account for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the account.
    * @return A mobile broadband account for the mobile device associated with the supplied network account ID.
    */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount.createFromNetworkAccountId")
  @js.native
  def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount = js.native
}
