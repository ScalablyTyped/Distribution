package typings.webrtc

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrack extends EventTarget {
  
  def applyConstraints(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  
  //id: string;
  //kind: string;
  //label: string;
  var enabled: Boolean = js.native
  
  def getCapabilities(): MediaTrackCapabilities = js.native
  
  def getConstraints(): MediaTrackConstraints = js.native
  
  def getSettings(): MediaTrackSettings = js.native
  
  def stop(): Unit = js.native
}
