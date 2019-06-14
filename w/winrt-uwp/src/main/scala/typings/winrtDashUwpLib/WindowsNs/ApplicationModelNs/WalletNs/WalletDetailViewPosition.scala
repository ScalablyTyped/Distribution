package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

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
  sealed trait centerField1
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The first footer slot in UI. */
  @js.native
  sealed trait footerField1
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The second footer slot in UI. */
  @js.native
  sealed trait footerField2
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The third footer slot in UI. */
  @js.native
  sealed trait footerField3
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The fourth footer slot in UI. */
  @js.native
  sealed trait footerField4
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The first header slot in UI. */
  @js.native
  sealed trait headerField1
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The second header slot in UI. */
  @js.native
  sealed trait headerField2
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** This property is hidden from the detail view of the wallet item, but will be displayed on the back-of-card view of the item. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The first content slot in UI. */
  @js.native
  sealed trait primaryField1
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The second content slot in UI. */
  @js.native
  sealed trait primaryField2
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The first content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField1
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The second content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField2
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The third content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField3
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The fourth content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField4
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /** The fifth content slot in UI under Header2. */
  @js.native
  sealed trait secondaryField5
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition
  
  /* 10 */ val centerField1: centerField1 with scala.Double = js.native
  /* 11 */ val footerField1: footerField1 with scala.Double = js.native
  /* 12 */ val footerField2: footerField2 with scala.Double = js.native
  /* 13 */ val footerField3: footerField3 with scala.Double = js.native
  /* 14 */ val footerField4: footerField4 with scala.Double = js.native
  /* 1 */ val headerField1: headerField1 with scala.Double = js.native
  /* 2 */ val headerField2: headerField2 with scala.Double = js.native
  /* 0 */ val hidden: hidden with scala.Double = js.native
  /* 3 */ val primaryField1: primaryField1 with scala.Double = js.native
  /* 4 */ val primaryField2: primaryField2 with scala.Double = js.native
  /* 5 */ val secondaryField1: secondaryField1 with scala.Double = js.native
  /* 6 */ val secondaryField2: secondaryField2 with scala.Double = js.native
  /* 7 */ val secondaryField3: secondaryField3 with scala.Double = js.native
  /* 8 */ val secondaryField4: secondaryField4 with scala.Double = js.native
  /* 9 */ val secondaryField5: secondaryField5 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition with scala.Double
  ] = js.native
}

