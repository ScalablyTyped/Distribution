package typings.winrt.Windows.Media

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaControl extends js.Object {
  var albumArt: Uri = js.native
  var artistName: String = js.native
  var isPlaying: Boolean = js.native
  var onchanneldownpressed: js.Any = js.native
  var onchanneluppressed: js.Any = js.native
  var onfastforwardpressed: js.Any = js.native
  var onnexttrackpressed: js.Any = js.native
  var onpausepressed: js.Any = js.native
  var onplaypausetogglepressed: js.Any = js.native
  var onplaypressed: js.Any = js.native
  var onprevioustrackpressed: js.Any = js.native
  var onrecordpressed: js.Any = js.native
  var onrewindpressed: js.Any = js.native
  var onsoundlevelchanged: js.Any = js.native
  var onstoppressed: js.Any = js.native
  var soundLevel: SoundLevel = js.native
  var trackName: String = js.native
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
  @scala.inline
  implicit class IMediaControlOps[Self <: IMediaControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlbumArt(value: Uri): Self = this.set("albumArt", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtistName(value: String): Self = this.set("artistName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPlaying(value: Boolean): Self = this.set("isPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnchanneldownpressed(value: js.Any): Self = this.set("onchanneldownpressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnchanneluppressed(value: js.Any): Self = this.set("onchanneluppressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnfastforwardpressed(value: js.Any): Self = this.set("onfastforwardpressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnnexttrackpressed(value: js.Any): Self = this.set("onnexttrackpressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpausepressed(value: js.Any): Self = this.set("onpausepressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnplaypausetogglepressed(value: js.Any): Self = this.set("onplaypausetogglepressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnplaypressed(value: js.Any): Self = this.set("onplaypressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnprevioustrackpressed(value: js.Any): Self = this.set("onprevioustrackpressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnrecordpressed(value: js.Any): Self = this.set("onrecordpressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnrewindpressed(value: js.Any): Self = this.set("onrewindpressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsoundlevelchanged(value: js.Any): Self = this.set("onsoundlevelchanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnstoppressed(value: js.Any): Self = this.set("onstoppressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoundLevel(value: SoundLevel): Self = this.set("soundLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackName(value: String): Self = this.set("trackName", value.asInstanceOf[js.Any])
  }
  
}

