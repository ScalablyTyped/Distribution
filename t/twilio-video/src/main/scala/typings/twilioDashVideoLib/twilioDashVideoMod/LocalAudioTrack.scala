package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalAudioTrack")
@js.native
class LocalAudioTrack protected ()
  extends AudioTrack
     with LocalTrack {
  def this(mediaStreamTrack: stdLib.MediaStreamTrack) = this()
  def this(mediaStreamTrack: stdLib.MediaStreamTrack, options: LocalTrackOptions) = this()
  var id: twilioDashVideoLib.twilioDashVideoMod.TrackNs.ID = js.native
  var isStopped: scala.Boolean = js.native
  def disable(): LocalAudioTrack = js.native
  def enable(): LocalAudioTrack = js.native
  def enable(enabled: scala.Boolean): LocalAudioTrack = js.native
  def stop(): LocalAudioTrack = js.native
}

