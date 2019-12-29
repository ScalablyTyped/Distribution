package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceRole extends js.Object

@JSGlobal("Windows.Media.Devices.AudioDeviceRole")
@js.native
object AudioDeviceRole extends js.Object {
  @js.native
  sealed trait communications extends AudioDeviceRole
  
  @js.native
  sealed trait default extends AudioDeviceRole
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioDeviceRole with Double] = js.native
  /* 1 */ @js.native
  object communications extends TopLevel[communications with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
}

