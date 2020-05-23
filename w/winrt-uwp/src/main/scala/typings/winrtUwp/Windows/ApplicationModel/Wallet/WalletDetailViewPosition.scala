package typings.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WalletDetailViewPosition extends js.Object

/** Describes the position in the detail view of a wallet item that a WalletItemCustomProperty record should be displayed at. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletDetailViewPosition")
@js.native
object WalletDetailViewPosition extends js.Object {
  /** If the value of the property at this position contains a URL ( http:// or https://), the data is displayed as a button that can navigate to that URL. */
  @js.native
  sealed trait centerField1 extends WalletDetailViewPosition
  
  /** The first footer slot in UI. */
  @js.native
  sealed trait footerField1 extends WalletDetailViewPosition
  
  /** The second footer slot in UI. */
  @js.native
  sealed trait footerField2 extends WalletDetailViewPosition
  
  /** The third footer slot in UI. */
  @js.native
  sealed trait footerField3 extends WalletDetailViewPosition
  
  /** The fourth footer slot in UI. */
  @js.native
  sealed trait footerField4 extends WalletDetailViewPosition
  
  /** The first header slot in UI. */
  @js.native
  sealed trait headerField1 extends WalletDetailViewPosition
  
  /** The second header slot in UI. */
  @js.native
  sealed trait headerField2 extends WalletDetailViewPosition
  
  /** This property is hidden from the detail view of the wallet item, but will be displayed on the back-of-card view of the item. */
  @js.native
  sealed trait hidden extends WalletDetailViewPosition
  
  /** The first content slot in UI. */
  @js.native
  sealed trait primaryField1 extends WalletDetailViewPosition
  
  /** The second content slot in UI. */
  @js.native
  sealed trait primaryField2 extends WalletDetailViewPosition
  
  /** The first content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField1 extends WalletDetailViewPosition
  
  /** The second content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField2 extends WalletDetailViewPosition
  
  /** The third content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField3 extends WalletDetailViewPosition
  
  /** The fourth content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField4 extends WalletDetailViewPosition
  
  /** The fifth content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField5 extends WalletDetailViewPosition
  
}

