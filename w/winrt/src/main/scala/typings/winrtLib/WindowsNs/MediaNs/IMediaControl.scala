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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("albumArt")(albumArt)
    __obj.updateDynamic("artistName")(artistName)
    __obj.updateDynamic("isPlaying")(isPlaying)
    __obj.updateDynamic("onchanneldownpressed")(onchanneldownpressed)
    __obj.updateDynamic("onchanneluppressed")(onchanneluppressed)
    __obj.updateDynamic("onfastforwardpressed")(onfastforwardpressed)
    __obj.updateDynamic("onnexttrackpressed")(onnexttrackpressed)
    __obj.updateDynamic("onpausepressed")(onpausepressed)
    __obj.updateDynamic("onplaypausetogglepressed")(onplaypausetogglepressed)
    __obj.updateDynamic("onplaypressed")(onplaypressed)
    __obj.updateDynamic("onprevioustrackpressed")(onprevioustrackpressed)
    __obj.updateDynamic("onrecordpressed")(onrecordpressed)
    __obj.updateDynamic("onrewindpressed")(onrewindpressed)
    __obj.updateDynamic("onsoundlevelchanged")(onsoundlevelchanged)
    __obj.updateDynamic("onstoppressed")(onstoppressed)
    __obj.updateDynamic("soundLevel")(soundLevel)
    __obj.updateDynamic("trackName")(trackName)
    __obj.asInstanceOf[IMediaControl]
  }
}

