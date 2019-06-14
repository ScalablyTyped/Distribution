package typings
package winrtLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionStatus extends js.Object

@JSGlobal("Windows.Devices.Geolocation.PositionStatus")
@js.native
object PositionStatus extends js.Object {
  @js.native
  sealed trait disabled
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  @js.native
  sealed trait initializing
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  @js.native
  sealed trait noData
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  @js.native
  sealed trait notInitialized
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  @js.native
  sealed trait ready
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  /* 3 */ val disabled: disabled with scala.Double = js.native
  /* 1 */ val initializing: initializing with scala.Double = js.native
  /* 2 */ val noData: noData with scala.Double = js.native
  /* 5 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 4 */ val notInitialized: notInitialized with scala.Double = js.native
  /* 0 */ val ready: ready with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus with scala.Double] = js.native
}

