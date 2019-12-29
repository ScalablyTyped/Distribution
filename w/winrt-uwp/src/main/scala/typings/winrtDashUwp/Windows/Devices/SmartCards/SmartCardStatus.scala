package typings.winrtDashUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmartCardStatus extends js.Object

/** Specifies the smart card's status. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardStatus")
@js.native
object SmartCardStatus extends js.Object {
  /** The smart card is disconnected. */
  @js.native
  sealed trait disconnected extends SmartCardStatus
  
  /** The smart card is allocated for exclusive use by another app. */
  @js.native
  sealed trait exclusive extends SmartCardStatus
  
  /** The smart card is ready. */
  @js.native
  sealed trait ready extends SmartCardStatus
  
  /** The smart card can be used by multiple apps. */
  @js.native
  sealed trait shared extends SmartCardStatus
  
  /** The smart card is unresponsive. */
  @js.native
  sealed trait unresponsive extends SmartCardStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmartCardStatus with Double] = js.native
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 3 */ @js.native
  object exclusive extends TopLevel[exclusive with Double]
  
  /* 1 */ @js.native
  object ready extends TopLevel[ready with Double]
  
  /* 2 */ @js.native
  object shared extends TopLevel[shared with Double]
  
  /* 4 */ @js.native
  object unresponsive extends TopLevel[unresponsive with Double]
  
}

