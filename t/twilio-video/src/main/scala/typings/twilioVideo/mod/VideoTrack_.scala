package typings.twilioVideo.mod

import typings.std.HTMLMediaElement
import typings.std.HTMLVideoElement
import typings.std.MediaStreamTrack
import typings.twilioVideo.mod.VideoTrack.Dimensions
import typings.twilioVideo.twilioVideoStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "VideoTrack")
@js.native
class VideoTrack_ () extends Track {
  // Required for Safari if you want to detach without errors
  // See: https://github.com/twilio/twilio-video.js/issues/294#issuecomment-389708981
  var _attachments: js.UndefOr[js.Array[HTMLMediaElement]] = js.native
  var dimensions: Dimensions = js.native
  var isEnabled: Boolean = js.native
  var isStarted: Boolean = js.native
  @JSName("kind")
  var kind_VideoTrack_ : video = js.native
  var mediaStreamTrack: MediaStreamTrack = js.native
  def attach(): HTMLVideoElement = js.native
  def attach(element: String): HTMLVideoElement = js.native
  def attach(element: HTMLMediaElement): HTMLVideoElement = js.native
  def detach(): js.Array[HTMLMediaElement] = js.native
  def detach(element: String): js.Array[HTMLMediaElement] = js.native
  def detach(element: HTMLMediaElement): js.Array[HTMLMediaElement] = js.native
}

