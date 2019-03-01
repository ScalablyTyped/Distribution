package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalVideoTrack")
@js.native
class LocalVideoTrack protected ()
  extends VideoTrack
     with LocalTrack {
  def this(mediaStreamTrack: stdLib.MediaStreamTrack) = this()
  def this(mediaStreamTrack: stdLib.MediaStreamTrack, options: LocalTrackOptions) = this()
  var id: twilioDashVideoLib.twilioDashVideoMod.TrackNs.ID = js.native
  var isStopped: scala.Boolean = js.native
  def disable(): LocalVideoTrack = js.native
  def enable(): LocalVideoTrack = js.native
  def enable(enabled: scala.Boolean): LocalVideoTrack = js.native
  def stop(): LocalVideoTrack = js.native
}

