package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundAccessStatus extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
@js.native
object BackgroundAccessStatus extends js.Object {
  @js.native
  sealed trait allowedMayUseActiveRealTimeConnectivity
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  @js.native
  sealed trait allowedWithAlwaysOnRealTimeConnectivity
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  @js.native
  sealed trait denied
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  @js.native
  sealed trait unspecified
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus
  
  /* 2 */ val allowedMayUseActiveRealTimeConnectivity: allowedMayUseActiveRealTimeConnectivity with scala.Double = js.native
  /* 1 */ val allowedWithAlwaysOnRealTimeConnectivity: allowedWithAlwaysOnRealTimeConnectivity with scala.Double = js.native
  /* 3 */ val denied: denied with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus with scala.Double
  ] = js.native
}

