package typings.winrtUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an audio headset attached to a gamepad. */
trait Headset extends js.Object {
  /** The XAudio endpoint ID for the headset's audio capture device. */
  var captureDeviceId: String
  /** The XAudio enpoint ID for the headset's audio render device. */
  var renderDeviceId: String
}

object Headset {
  @scala.inline
  def apply(captureDeviceId: String, renderDeviceId: String): Headset = {
    val __obj = js.Dynamic.literal(captureDeviceId = captureDeviceId.asInstanceOf[js.Any], renderDeviceId = renderDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headset]
  }
}

