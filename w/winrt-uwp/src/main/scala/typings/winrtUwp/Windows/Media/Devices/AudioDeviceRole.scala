package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
