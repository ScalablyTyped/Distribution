package typings
package winrtLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaControl extends js.Object {
  var albumArt: winrtLib.WindowsNs.FoundationNs.Uri
  var artistName: java.lang.String
  var isPlaying: scala.Boolean
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
  var trackName: java.lang.String
}

object IMediaControl {
  @scala.inline
  def apply(
    albumArt: winrtLib.WindowsNs.FoundationNs.Uri,
    artistName: java.lang.String,
    isPlaying: scala.Boolean,
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
    trackName: java.lang.String
  ): IMediaControl = {
    val __obj = js.Dynamic.literal(albumArt = albumArt, artistName = artistName, isPlaying = isPlaying, onchanneldownpressed = onchanneldownpressed, onchanneluppressed = onchanneluppressed, onfastforwardpressed = onfastforwardpressed, onnexttrackpressed = onnexttrackpressed, onpausepressed = onpausepressed, onplaypausetogglepressed = onplaypausetogglepressed, onplaypressed = onplaypressed, onprevioustrackpressed = onprevioustrackpressed, onrecordpressed = onrecordpressed, onrewindpressed = onrewindpressed, onsoundlevelchanged = onsoundlevelchanged, onstoppressed = onstoppressed, soundLevel = soundLevel, trackName = trackName)
  
    __obj.asInstanceOf[IMediaControl]
  }
}

