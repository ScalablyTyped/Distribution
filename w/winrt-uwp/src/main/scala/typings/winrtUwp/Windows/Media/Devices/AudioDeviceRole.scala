package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceRole extends js.Object

/** Indicates the role of an audio device. */
@JSGlobal("Windows.Media.Devices.AudioDeviceRole")
@js.native
object AudioDeviceRole extends js.Object {
  /** The audio device is used for communications. */
  @js.native
  sealed trait communications extends AudioDeviceRole
  
  /** The audio device is used in the default role. */
  @js.native
  sealed trait default extends AudioDeviceRole
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioDeviceRole with Double] = js.native
  /* 1 */ @js.native
  object communications extends TopLevel[communications with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
}

