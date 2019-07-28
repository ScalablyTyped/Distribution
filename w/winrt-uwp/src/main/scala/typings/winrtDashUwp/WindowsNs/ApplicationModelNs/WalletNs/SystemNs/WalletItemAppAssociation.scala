package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WalletItemAppAssociation extends js.Object

/** Defines values used by the GetAppStatusForItem method indicating if an app is installed for the specified WalletItem . */
@JSGlobal("Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation")
@js.native
object WalletItemAppAssociation extends js.Object {
  /** The app for the wallet item is installed on this device. */
  @js.native
  sealed trait appInstalled extends WalletItemAppAssociation
  
  /** An app exists for the wallet item, but it is not installed on the device. */
  @js.native
  sealed trait appNotInstalled extends WalletItemAppAssociation
  
  /** There is no app associated with the wallet item. */
  @js.native
  sealed trait none extends WalletItemAppAssociation
  
  /* 1 */ val appInstalled: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemAppAssociation.appInstalled with Double = js.native
  /* 2 */ val appNotInstalled: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemAppAssociation.appNotInstalled with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemAppAssociation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletItemAppAssociation with Double] = js.native
}

