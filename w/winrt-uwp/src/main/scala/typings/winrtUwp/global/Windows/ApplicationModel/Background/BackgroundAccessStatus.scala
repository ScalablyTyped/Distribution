package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** On Windows, this enumeration specifies an app's ability to perform background activity and display a tile on the lock screen. For Windows Phone Store apps, it only indicates an app's ability to perform background activity. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
@js.native
object BackgroundAccessStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus & Double
  ] = js.native
  
  /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity & Double = js.native
  
  /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity & Double = js.native
  
  /* 3 */ val denied: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.denied & Double = js.native
  
  /* 0 */ val unspecified: typings.winrtUwp.Windows.ApplicationModel.Background.BackgroundAccessStatus.unspecified & Double = js.native
}
