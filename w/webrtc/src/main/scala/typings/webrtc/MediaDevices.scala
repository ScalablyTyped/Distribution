package typings.webrtc

import typings.std.MediaDeviceInfo
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
    enumerateDevices: () => js.Promise[js.Array[MediaDeviceInfo]],
    getSupportedConstraints: () => MediaTrackSupportedConstraints,
    getUserMedia: MediaStreamConstraints => js.Promise[MediaStream]
  ): MediaDevices = {
    val __obj = js.Dynamic.literal(enumerateDevices = js.Any.fromFunction0(enumerateDevices), getSupportedConstraints = js.Any.fromFunction0(getSupportedConstraints), getUserMedia = js.Any.fromFunction1(getUserMedia))
  
    __obj.asInstanceOf[MediaDevices]
  }
}

