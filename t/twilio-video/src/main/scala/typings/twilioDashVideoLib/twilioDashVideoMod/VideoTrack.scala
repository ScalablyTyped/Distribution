package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "VideoTrack")
@js.native
class VideoTrack () extends Track {
  // Required for Safari if you want to detach without errors
  // See: https://github.com/twilio/twilio-video.js/issues/294#issuecomment-389708981
  var _attachments: js.UndefOr[js.Array[stdLib.HTMLMediaElement]] = js.native
  var dimensions: twilioDashVideoLib.twilioDashVideoMod.VideoTrackNs.Dimensions = js.native
  var isEnabled: scala.Boolean = js.native
  var isStarted: scala.Boolean = js.native
  @JSName("kind")
  var kind_VideoTrack: twilioDashVideoLib.twilioDashVideoLibStrings.video = js.native
  var mediaStreamTrack: stdLib.MediaStreamTrack = js.native
  def attach(): stdLib.HTMLVideoElement = js.native
  def attach(element: java.lang.String): stdLib.HTMLVideoElement = js.native
  def attach(element: stdLib.HTMLMediaElement): stdLib.HTMLVideoElement = js.native
  def detach(): js.Array[stdLib.HTMLMediaElement] = js.native
  def detach(element: java.lang.String): js.Array[stdLib.HTMLMediaElement] = js.native
  def detach(element: stdLib.HTMLMediaElement): js.Array[stdLib.HTMLMediaElement] = js.native
}

