package typings.winrtDashUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithWakeupCapability
import typings.winrtDashUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithoutWakeupCapability
import typings.winrtDashUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.denied
import typings.winrtDashUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.unspecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlarmAccessStatus extends js.Object

/** Indicates whether the user has given permission for the app to set alarms. */
@JSGlobal("Windows.ApplicationModel.Background.AlarmAccessStatus")
@js.native
object AlarmAccessStatus extends js.Object {
  /** The user has given permission for the app to set alarms, and alarms can wake up the computer from standby. */
  @js.native
  sealed trait allowedWithWakeupCapability extends AlarmAccessStatus
  
  /** The user has given permission for the app to set alarms, but the alarms cannot wake up the computer from standby. */
  @js.native
  sealed trait allowedWithoutWakeupCapability extends AlarmAccessStatus
  
  /** The user has denied permission for the app to set alarms. */
  @js.native
  sealed trait denied extends AlarmAccessStatus
  
  /** The user has not responded to a permission request for the app to set alarms. */
  @js.native
  sealed trait unspecified extends AlarmAccessStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlarmAccessStatus with Double] = js.native
  /* 1 */ @js.native
  object allowedWithWakeupCapability extends TopLevel[allowedWithWakeupCapability with Double]
  
  /* 2 */ @js.native
  object allowedWithoutWakeupCapability extends TopLevel[allowedWithoutWakeupCapability with Double]
  
  /* 3 */ @js.native
  object denied extends TopLevel[denied with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

