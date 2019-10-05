package typings.winrtDashUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an audio headset attached to a gamepad. */
@JSGlobal("Windows.Gaming.Input.Headset")
@js.native
abstract class Headset () extends js.Object {
  /** The XAudio endpoint ID for the headset's audio capture device. */
  var captureDeviceId: String = js.native
  /** The XAudio enpoint ID for the headset's audio render device. */
  var renderDeviceId: String = js.native
}

