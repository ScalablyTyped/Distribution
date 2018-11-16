package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaDevices extends js.Object {
  def enumerateDevices(): stdLib.Promise[js.Array[MediaDeviceInfo]]
  def getSupportedConstraints(): MediaTrackSupportedConstraints
  def getUserMedia(constraints: MediaStreamConstraints): stdLib.Promise[MediaStream]
}

