package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband account and related information about the network provider for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
abstract class MobileBroadbandAccount ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount {
  
  /** Gets the mobile broadband device information associated with this account. */
  /* CompleteClass */
  var currentDeviceInformation: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation = js.native
  
  /** Gets the Mobile Broadband network object for this account. */
  /* CompleteClass */
  var currentNetwork: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetwork = js.native
  
  /**
    * Retrieves an array of ConnectionProfile objects that represent connections associated with the Mobile Broadband account.
    * @return An array of ConnectionProfile objects.
    */
  /* CompleteClass */
  override def getConnectionProfiles(): IVectorView[ConnectionProfile] = js.native
  
  /** Gets a unique identifier for the mobile broadband account. */
  /* CompleteClass */
  var networkAccountId: String = js.native
  
  /** A unique identifier for the network provider for the mobile broadband account. */
  /* CompleteClass */
  var serviceProviderGuid: String = js.native
  
  /** The name of the network provider for the mobile broadband account. */
  /* CompleteClass */
  var serviceProviderName: String = js.native
}
object MobileBroadbandAccount {
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
  @js.native
  val ^ : js.Any = js.native
  
  /** A list of all network account IDs for the network service provider. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount.availableNetworkAccountIds")
  @js.native
  def availableNetworkAccountIds: IVectorView[String] = js.native
  inline def availableNetworkAccountIds_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableNetworkAccountIds")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a mobile broadband account for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the account.
    * @return A mobile broadband account for the mobile device associated with the supplied network account ID.
    */
  /* static member */
  inline def createFromNetworkAccountId(networkAccountId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount]
}
