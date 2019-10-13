package typings.twilioDashVideo.twilioDashVideoMod

import typings.std.MediaStreamTrack
import typings.twilioDashVideo.twilioDashVideoMod.Track.ID
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
  def stop(): LocalAudioTrack = js.native
}

