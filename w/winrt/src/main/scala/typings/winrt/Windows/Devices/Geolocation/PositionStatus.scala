package typings.winrt.Windows.Devices.Geolocation

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionStatus with Double] = js.native
  /* 3 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 1 */ @js.native
  object initializing extends TopLevel[initializing with Double]
  
  /* 2 */ @js.native
  object noData extends TopLevel[noData with Double]
  
  /* 5 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 4 */ @js.native
  object notInitialized extends TopLevel[notInitialized with Double]
  
  /* 0 */ @js.native
  object ready extends TopLevel[ready with Double]
  
}

