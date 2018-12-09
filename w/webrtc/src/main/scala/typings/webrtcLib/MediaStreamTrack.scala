package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamTrack
  extends stdLib.EventTarget {
  //id: string;
  //kind: string;
  //label: string;
  var enabled: scala.Boolean = js.native
  def applyConstraints(constraints: MediaTrackConstraints): js.Promise[scala.Unit] = js.native
  def getCapabilities(): MediaTrackCapabilities = js.native
  def getConstraints(): MediaTrackConstraints = js.native
  def getSettings(): MediaTrackSettings = js.native
  def stop(): scala.Unit = js.native
}

