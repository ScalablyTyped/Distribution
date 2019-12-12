package typings.winrtDashUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.always
import typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.default
import typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.unrestrictedOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferCostPolicy extends js.Object

/** Defines values used to specify whether transfers can occur on metered networks. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
@js.native
object BackgroundTransferCostPolicy extends js.Object {
  /** Always download regardless of network cost. (e.g. even while a user is roaming) */
  @js.native
  sealed trait always extends BackgroundTransferCostPolicy
  
  /** Allow transfers on metered networks. */
  @js.native
  sealed trait default extends BackgroundTransferCostPolicy
  
  /** Do not allow transfers on metered networks. */
  @js.native
  sealed trait unrestrictedOnly extends BackgroundTransferCostPolicy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferCostPolicy with Double] = js.native
  /* 2 */ @js.native
  object always extends TopLevel[always with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object unrestrictedOnly extends TopLevel[unrestrictedOnly with Double]
  
}

