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

