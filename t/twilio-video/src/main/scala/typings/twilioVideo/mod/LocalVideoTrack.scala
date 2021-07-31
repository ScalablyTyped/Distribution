package typings.twilioVideo.mod

import typings.std.MediaStreamTrack
import typings.std.MediaTrackConstraints
import typings.twilioVideo.mod.Track.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalVideoTrack")
@js.native
class LocalVideoTrack protected ()
  extends VideoTrack
     with LocalTrack {
  def this(mediaStreamTrack: MediaStreamTrack) = this()
  def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  
  def disable(): LocalVideoTrack = js.native
  
  def enable(): LocalVideoTrack = js.native
  def enable(enabled: Boolean): LocalVideoTrack = js.native
  
  var id: ID = js.native
  
  var isStopped: Boolean = js.native
  
  def restart(): js.Promise[Unit] = js.native
  def restart(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  
  def stop(): LocalVideoTrack = js.native
}
