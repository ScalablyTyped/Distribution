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
  
  val allowedMayUseActiveRealTimeConnectivity: allowedMayUseActiveRealTimeConnectivity with java.lang.String = js.native
  val allowedWithAlwaysOnRealTimeConnectivity: allowedWithAlwaysOnRealTimeConnectivity with java.lang.String = js.native
  val denied: denied with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundAccessStatus with java.lang.String
  ] = js.native
}

