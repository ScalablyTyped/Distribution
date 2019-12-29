package typings.winrt.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferCostPolicy extends js.Object

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
@js.native
object BackgroundTransferCostPolicy extends js.Object {
  @js.native
  sealed trait always extends BackgroundTransferCostPolicy
  
  @js.native
  sealed trait default extends BackgroundTransferCostPolicy
  
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

