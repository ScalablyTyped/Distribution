package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a system condition that must be in effect for a background task to run. If a background task with a system condition is triggered, the task will not run until the condition is met. */
@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType with Double
  ] = js.native
  
  /* 8 */ val backgroundWorkCostNotHigh: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.backgroundWorkCostNotHigh with Double = js.native
  
  /* 7 */ val freeNetworkAvailable: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.freeNetworkAvailable with Double = js.native
  
  /* 3 */ val internetAvailable: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.internetAvailable with Double = js.native
  
  /* 4 */ val internetNotAvailable: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.internetNotAvailable with Double = js.native
  
  /* 0 */ val invalid: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.invalid with Double = js.native
  
  /* 5 */ val sessionConnected: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.sessionConnected with Double = js.native
  
  /* 6 */ val sessionDisconnected: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.sessionDisconnected with Double = js.native
  
  /* 2 */ val userNotPresent: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.userNotPresent with Double = js.native
  
  /* 1 */ val userPresent: typings.winrtUwp.Windows.ApplicationModel.Background.SystemConditionType.userPresent with Double = js.native
}
