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
  
  val centerField1: centerField1 with java.lang.String = js.native
  val footerField1: footerField1 with java.lang.String = js.native
  val footerField2: footerField2 with java.lang.String = js.native
  val footerField3: footerField3 with java.lang.String = js.native
  val footerField4: footerField4 with java.lang.String = js.native
  val headerField1: headerField1 with java.lang.String = js.native
  val headerField2: headerField2 with java.lang.String = js.native
  val hidden: hidden with java.lang.String = js.native
  val primaryField1: primaryField1 with java.lang.String = js.native
  val primaryField2: primaryField2 with java.lang.String = js.native
  val secondaryField1: secondaryField1 with java.lang.String = js.native
  val secondaryField2: secondaryField2 with java.lang.String = js.native
  val secondaryField3: secondaryField3 with java.lang.String = js.native
  val secondaryField4: secondaryField4 with java.lang.String = js.native
  val secondaryField5: secondaryField5 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletDetailViewPosition with java.lang.String
  ] = js.native
}

