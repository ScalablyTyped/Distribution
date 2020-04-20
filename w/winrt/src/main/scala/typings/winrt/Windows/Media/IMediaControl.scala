package typings.winrt.Windows.Media

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaControl extends js.Object {
  var albumArt: Uri
  var artistName: String
  var isPlaying: Boolean
  var onchanneldownpressed: js.Any
  var onchanneluppressed: js.Any
  var onfastforwardpressed: js.Any
  var onnexttrackpressed: js.Any
  var onpausepressed: js.Any
  var onplaypausetogglepressed: js.Any
  var onplaypressed: js.Any
  var onprevioustrackpressed: js.Any
  var onrecordpressed: js.Any
  var onrewindpressed: js.Any
  var onsoundlevelchanged: js.Any
  var onstoppressed: js.Any
  var soundLevel: SoundLevel
  var trackName: String
}

object IMediaControl {
  @scala.inline
  def apply(
    albumArt: Uri,
    artistName: String,
    isPlaying: Boolean,
    onchanneldownpressed: js.Any,
    onchanneluppressed: js.Any,
    onfastforwardpressed: js.Any,
    onnexttrackpressed: js.Any,
    onpausepressed: js.Any,
    onplaypausetogglepressed: js.Any,
    onplaypressed: js.Any,
    onprevioustrackpressed: js.Any,
    onrecordpressed: js.Any,
    onrewindpressed: js.Any,
    onsoundlevelchanged: js.Any,
    onstoppressed: js.Any,
    soundLevel: SoundLevel,
    trackName: String
  ): IMediaControl = {
    val __obj = js.Dynamic.literal(albumArt = albumArt.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], onchanneldownpressed = onchanneldownpressed.asInstanceOf[js.Any], onchanneluppressed = onchanneluppressed.asInstanceOf[js.Any], onfastforwardpressed = onfastforwardpressed.asInstanceOf[js.Any], onnexttrackpressed = onnexttrackpressed.asInstanceOf[js.Any], onpausepressed = onpausepressed.asInstanceOf[js.Any], onplaypausetogglepressed = onplaypausetogglepressed.asInstanceOf[js.Any], onplaypressed = onplaypressed.asInstanceOf[js.Any], onprevioustrackpressed = onprevioustrackpressed.asInstanceOf[js.Any], onrecordpressed = onrecordpressed.asInstanceOf[js.Any], onrewindpressed = onrewindpressed.asInstanceOf[js.Any], onsoundlevelchanged = onsoundlevelchanged.asInstanceOf[js.Any], onstoppressed = onstoppressed.asInstanceOf[js.Any], soundLevel = soundLevel.asInstanceOf[js.Any], trackName = trackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaControl]
  }
}

