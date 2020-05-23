package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionStatus extends js.Object

@JSGlobal("Windows.Devices.Geolocation.PositionStatus")
@js.native
object PositionStatus extends js.Object {
  @js.native
  sealed trait disabled extends PositionStatus
  
  @js.native
  sealed trait initializing extends PositionStatus
  
  @js.native
  sealed trait noData extends PositionStatus
  
  @js.native
  sealed trait notAvailable extends PositionStatus
  
  @js.native
  sealed trait notInitialized extends PositionStatus
  
  @js.native
  sealed trait ready extends PositionStatus
  
}

