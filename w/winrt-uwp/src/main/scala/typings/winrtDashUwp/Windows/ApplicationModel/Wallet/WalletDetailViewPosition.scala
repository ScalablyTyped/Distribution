package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletDetailViewPosition with Double] = js.native
  /* 10 */ @js.native
  object centerField1 extends TopLevel[centerField1 with Double]
  
  /* 11 */ @js.native
  object footerField1 extends TopLevel[footerField1 with Double]
  
  /* 12 */ @js.native
  object footerField2 extends TopLevel[footerField2 with Double]
  
  /* 13 */ @js.native
  object footerField3 extends TopLevel[footerField3 with Double]
  
  /* 14 */ @js.native
  object footerField4 extends TopLevel[footerField4 with Double]
  
  /* 1 */ @js.native
  object headerField1 extends TopLevel[headerField1 with Double]
  
  /* 2 */ @js.native
  object headerField2 extends TopLevel[headerField2 with Double]
  
  /* 0 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 3 */ @js.native
  object primaryField1 extends TopLevel[primaryField1 with Double]
  
  /* 4 */ @js.native
  object primaryField2 extends TopLevel[primaryField2 with Double]
  
  /* 5 */ @js.native
  object secondaryField1 extends TopLevel[secondaryField1 with Double]
  
  /* 6 */ @js.native
  object secondaryField2 extends TopLevel[secondaryField2 with Double]
  
  /* 7 */ @js.native
  object secondaryField3 extends TopLevel[secondaryField3 with Double]
  
  /* 8 */ @js.native
  object secondaryField4 extends TopLevel[secondaryField4 with Double]
  
  /* 9 */ @js.native
  object secondaryField5 extends TopLevel[secondaryField5 with Double]
  
}

