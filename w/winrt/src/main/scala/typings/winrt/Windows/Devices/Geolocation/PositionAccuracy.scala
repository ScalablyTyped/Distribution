package typings.winrt.Windows.Devices.Geolocation

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Devices.Geolocation.PositionAccuracy.default
import typings.winrt.Windows.Devices.Geolocation.PositionAccuracy.high
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionAccuracy extends js.Object

@JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
@js.native
object PositionAccuracy extends js.Object {
  @js.native
  sealed trait default extends PositionAccuracy
  
  @js.native
  sealed trait high extends PositionAccuracy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionAccuracy with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object high extends TopLevel[high with Double]
  
}

