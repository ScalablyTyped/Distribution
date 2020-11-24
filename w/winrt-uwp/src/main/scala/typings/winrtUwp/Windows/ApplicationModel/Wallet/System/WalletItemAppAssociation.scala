package typings.winrtUwp.Windows.ApplicationModel.Wallet.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
