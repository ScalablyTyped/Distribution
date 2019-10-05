package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundAccessStatus extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
@js.native
object BackgroundAccessStatus extends js.Object {
  @js.native
  sealed trait allowedMayUseActiveRealTimeConnectivity extends BackgroundAccessStatus
  
  @js.native
  sealed trait allowedWithAlwaysOnRealTimeConnectivity extends BackgroundAccessStatus
  
  @js.native
  sealed trait denied extends BackgroundAccessStatus
  
  @js.native
  sealed trait unspecified extends BackgroundAccessStatus
  
  /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity with Double = js.native
  /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity with Double = js.native
  /* 3 */ val denied: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.denied with Double = js.native
  /* 0 */ val unspecified: typings.winrt.Windows.ApplicationModel.Background.BackgroundAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundAccessStatus with Double] = js.native
}

