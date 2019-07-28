package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

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
  
  /* 2 */ val allowedMayUseActiveRealTimeConnectivity: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus.allowedMayUseActiveRealTimeConnectivity with Double = js.native
  /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus.allowedWithAlwaysOnRealTimeConnectivity with Double = js.native
  /* 3 */ val denied: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus.denied with Double = js.native
  /* 0 */ val unspecified: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundAccessStatus with Double] = js.native
}

