package typings.webrtc

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamTrack extends EventTarget {
  //id: string;
  //kind: string;
  //label: string;
  var enabled: Boolean = js.native
  def applyConstraints(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  def getCapabilities(): MediaTrackCapabilities = js.native
  def getConstraints(): MediaTrackConstraints = js.native
  def getSettings(): MediaTrackSettings = js.native
  def stop(): Unit = js.native
}

