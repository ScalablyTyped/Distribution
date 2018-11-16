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
  
  val disabled: disabled with java.lang.String = js.native
  val initializing: initializing with java.lang.String = js.native
  val noData: noData with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val notInitialized: notInitialized with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus with java.lang.String] = js.native
}

