package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceTriggerResult extends StObject
/** Indicates whether the device background task operation was allowed or denied, and if it was denied specifies the reason. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceTriggerResult")
@js.native
object DeviceTriggerResult extends StObject {
  
  /** The device background task was triggered. */
  @js.native
  sealed trait allowed extends DeviceTriggerResult
  
  /** The device background task was denied due to system policy. */
  @js.native
  sealed trait deniedBySystem extends DeviceTriggerResult
  
  /** The device background task was denied by the user. */
  @js.native
  sealed trait deniedByUser extends DeviceTriggerResult
  
  /** The device background task cannot run because the battery is low. */
  @js.native
  sealed trait lowBattery extends DeviceTriggerResult
}
