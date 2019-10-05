package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

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
  
  /* 10 */ val centerField1: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.centerField1 with Double = js.native
  /* 11 */ val footerField1: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField1 with Double = js.native
  /* 12 */ val footerField2: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField2 with Double = js.native
  /* 13 */ val footerField3: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField3 with Double = js.native
  /* 14 */ val footerField4: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField4 with Double = js.native
  /* 1 */ val headerField1: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.headerField1 with Double = js.native
  /* 2 */ val headerField2: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.headerField2 with Double = js.native
  /* 0 */ val hidden: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.hidden with Double = js.native
  /* 3 */ val primaryField1: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.primaryField1 with Double = js.native
  /* 4 */ val primaryField2: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.primaryField2 with Double = js.native
  /* 5 */ val secondaryField1: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField1 with Double = js.native
  /* 6 */ val secondaryField2: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField2 with Double = js.native
  /* 7 */ val secondaryField3: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField3 with Double = js.native
  /* 8 */ val secondaryField4: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField4 with Double = js.native
  /* 9 */ val secondaryField5: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField5 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletDetailViewPosition with Double] = js.native
}

