package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioDeviceRole extends StObject
/** Indicates the role of an audio device. */
@JSGlobal("Windows.Media.Devices.AudioDeviceRole")
@js.native
object AudioDeviceRole extends StObject {
  
  /** The audio device is used in the default role. */
  @js.native
  sealed trait default extends AudioDeviceRole
  
  /** The audio device is used for communications. */
  @js.native
  sealed trait communications extends AudioDeviceRole
}
