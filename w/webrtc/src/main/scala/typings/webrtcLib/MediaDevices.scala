package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDevices extends js.Object {
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]]
  def getSupportedConstraints(): MediaTrackSupportedConstraints
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream]
}

object MediaDevices {
  @scala.inline
  def apply(
    enumerateDevices: js.Function0[js.Promise[js.Array[MediaDeviceInfo]]],
    getSupportedConstraints: js.Function0[MediaTrackSupportedConstraints],
    getUserMedia: js.Function1[MediaStreamConstraints, js.Promise[MediaStream]]
  ): MediaDevices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enumerateDevices")(enumerateDevices)
    __obj.updateDynamic("getSupportedConstraints")(getSupportedConstraints)
    __obj.updateDynamic("getUserMedia")(getUserMedia)
    __obj.asInstanceOf[MediaDevices]
  }
}

