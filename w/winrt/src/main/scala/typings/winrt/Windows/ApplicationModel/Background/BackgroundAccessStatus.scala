package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundAccessStatus with Double] = js.native
  /* 2 */ @js.native
  object allowedMayUseActiveRealTimeConnectivity extends TopLevel[allowedMayUseActiveRealTimeConnectivity with Double]
  
  /* 1 */ @js.native
  object allowedWithAlwaysOnRealTimeConnectivity extends TopLevel[allowedWithAlwaysOnRealTimeConnectivity with Double]
  
  /* 3 */ @js.native
  object denied extends TopLevel[denied with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

