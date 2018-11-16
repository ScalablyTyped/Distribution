package typings
package winrtDashUwpLib.WindowsNs.GamingNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an audio headset attached to a gamepad. */
@JSGlobal("Windows.Gaming.Input.Headset")
@js.native
abstract class Headset () extends js.Object {
  /** The XAudio endpoint ID for the headset's audio capture device. */
  var captureDeviceId: java.lang.String = js.native
  /** The XAudio enpoint ID for the headset's audio render device. */
  var renderDeviceId: java.lang.String = js.native
}

