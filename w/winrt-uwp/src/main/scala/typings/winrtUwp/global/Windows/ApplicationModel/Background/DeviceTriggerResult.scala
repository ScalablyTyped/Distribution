package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates whether the device background task operation was allowed or denied, and if it was denied specifies the reason. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceTriggerResult")
@js.native
object DeviceTriggerResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult & Double
  ] = js.native
  
  /* 0 */ val allowed: typings.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.allowed & Double = js.native
  
  /* 2 */ val deniedBySystem: typings.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.deniedBySystem & Double = js.native
  
  /* 1 */ val deniedByUser: typings.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.deniedByUser & Double = js.native
  
  /* 3 */ val lowBattery: typings.winrtUwp.Windows.ApplicationModel.Background.DeviceTriggerResult.lowBattery & Double = js.native
}
