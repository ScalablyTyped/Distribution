package typings.winrt.Windows.Media

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaControl extends StObject {
  
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
  implicit class IMediaControlMutableBuilder[Self <: IMediaControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbumArt(value: Uri): Self = StObject.set(x, "albumArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnchanneldownpressed(value: js.Any): Self = StObject.set(x, "onchanneldownpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnchanneluppressed(value: js.Any): Self = StObject.set(x, "onchanneluppressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfastforwardpressed(value: js.Any): Self = StObject.set(x, "onfastforwardpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnnexttrackpressed(value: js.Any): Self = StObject.set(x, "onnexttrackpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpausepressed(value: js.Any): Self = StObject.set(x, "onpausepressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplaypausetogglepressed(value: js.Any): Self = StObject.set(x, "onplaypausetogglepressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplaypressed(value: js.Any): Self = StObject.set(x, "onplaypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprevioustrackpressed(value: js.Any): Self = StObject.set(x, "onprevioustrackpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnrecordpressed(value: js.Any): Self = StObject.set(x, "onrecordpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnrewindpressed(value: js.Any): Self = StObject.set(x, "onrewindpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsoundlevelchanged(value: js.Any): Self = StObject.set(x, "onsoundlevelchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstoppressed(value: js.Any): Self = StObject.set(x, "onstoppressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundLevel(value: SoundLevel): Self = StObject.set(x, "soundLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackName(value: String): Self = StObject.set(x, "trackName", value.asInstanceOf[js.Any])
  }
}
