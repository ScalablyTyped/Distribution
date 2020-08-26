package typings.twilioVideo.mod

import typings.std.MediaStreamTrack
import typings.std.MediaTrackConstraints
import typings.twilioVideo.mod.Track.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalAudioTrack")
@js.native
class LocalAudioTrack protected ()
  extends AudioTrack
     with LocalTrack {
  def this(mediaStreamTrack: MediaStreamTrack) = this()
  def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  var id: ID = js.native
  var isStopped: Boolean = js.native
  def disable(): LocalAudioTrack = js.native
  def enable(): LocalAudioTrack = js.native
  def enable(enabled: Boolean): LocalAudioTrack = js.native
  def restart(): js.Promise[Unit] = js.native
  def restart(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  def stop(): LocalAudioTrack = js.native
}

