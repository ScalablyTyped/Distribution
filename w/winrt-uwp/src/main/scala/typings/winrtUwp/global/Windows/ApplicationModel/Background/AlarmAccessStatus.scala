package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates whether the user has given permission for the app to set alarms. */
@JSGlobal("Windows.ApplicationModel.Background.AlarmAccessStatus")
@js.native
object AlarmAccessStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus with Double
  ] = js.native
  
  /* 1 */ val allowedWithWakeupCapability: typings.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithWakeupCapability with Double = js.native
  
  /* 2 */ val allowedWithoutWakeupCapability: typings.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.allowedWithoutWakeupCapability with Double = js.native
  
  /* 3 */ val denied: typings.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.denied with Double = js.native
  
  /* 0 */ val unspecified: typings.winrtUwp.Windows.ApplicationModel.Background.AlarmAccessStatus.unspecified with Double = js.native
}
