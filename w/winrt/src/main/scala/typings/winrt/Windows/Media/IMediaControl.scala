package typings.winrt.Windows.Media

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaControl extends StObject {
  
  var albumArt: Uri
  
  var artistName: String
  
  var isPlaying: Boolean
  
  var onchanneldownpressed: Any
  
  var onchanneluppressed: Any
  
  var onfastforwardpressed: Any
  
  var onnexttrackpressed: Any
  
  var onpausepressed: Any
  
  var onplaypausetogglepressed: Any
  
  var onplaypressed: Any
  
  var onprevioustrackpressed: Any
  
  var onrecordpressed: Any
  
  var onrewindpressed: Any
  
  var onsoundlevelchanged: Any
  
  var onstoppressed: Any
  
  var soundLevel: SoundLevel
  
  var trackName: String
}
object IMediaControl {
  
  inline def apply(
    albumArt: Uri,
    artistName: String,
    isPlaying: Boolean,
    onchanneldownpressed: Any,
    onchanneluppressed: Any,
    onfastforwardpressed: Any,
    onnexttrackpressed: Any,
    onpausepressed: Any,
    onplaypausetogglepressed: Any,
    onplaypressed: Any,
    onprevioustrackpressed: Any,
    onrecordpressed: Any,
    onrewindpressed: Any,
    onsoundlevelchanged: Any,
    onstoppressed: Any,
    soundLevel: SoundLevel,
    trackName: String
  ): IMediaControl = {
    val __obj = js.Dynamic.literal(albumArt = albumArt.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], onchanneldownpressed = onchanneldownpressed.asInstanceOf[js.Any], onchanneluppressed = onchanneluppressed.asInstanceOf[js.Any], onfastforwardpressed = onfastforwardpressed.asInstanceOf[js.Any], onnexttrackpressed = onnexttrackpressed.asInstanceOf[js.Any], onpausepressed = onpausepressed.asInstanceOf[js.Any], onplaypausetogglepressed = onplaypausetogglepressed.asInstanceOf[js.Any], onplaypressed = onplaypressed.asInstanceOf[js.Any], onprevioustrackpressed = onprevioustrackpressed.asInstanceOf[js.Any], onrecordpressed = onrecordpressed.asInstanceOf[js.Any], onrewindpressed = onrewindpressed.asInstanceOf[js.Any], onsoundlevelchanged = onsoundlevelchanged.asInstanceOf[js.Any], onstoppressed = onstoppressed.asInstanceOf[js.Any], soundLevel = soundLevel.asInstanceOf[js.Any], trackName = trackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaControl]
  }
  
  extension [Self <: IMediaControl](x: Self) {
    
    inline def setAlbumArt(value: Uri): Self = StObject.set(x, "albumArt", value.asInstanceOf[js.Any])
    
    inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
    
    inline def setOnchanneldownpressed(value: Any): Self = StObject.set(x, "onchanneldownpressed", value.asInstanceOf[js.Any])
    
    inline def setOnchanneluppressed(value: Any): Self = StObject.set(x, "onchanneluppressed", value.asInstanceOf[js.Any])
    
    inline def setOnfastforwardpressed(value: Any): Self = StObject.set(x, "onfastforwardpressed", value.asInstanceOf[js.Any])
    
    inline def setOnnexttrackpressed(value: Any): Self = StObject.set(x, "onnexttrackpressed", value.asInstanceOf[js.Any])
    
    inline def setOnpausepressed(value: Any): Self = StObject.set(x, "onpausepressed", value.asInstanceOf[js.Any])
    
    inline def setOnplaypausetogglepressed(value: Any): Self = StObject.set(x, "onplaypausetogglepressed", value.asInstanceOf[js.Any])
    
    inline def setOnplaypressed(value: Any): Self = StObject.set(x, "onplaypressed", value.asInstanceOf[js.Any])
    
    inline def setOnprevioustrackpressed(value: Any): Self = StObject.set(x, "onprevioustrackpressed", value.asInstanceOf[js.Any])
    
    inline def setOnrecordpressed(value: Any): Self = StObject.set(x, "onrecordpressed", value.asInstanceOf[js.Any])
    
    inline def setOnrewindpressed(value: Any): Self = StObject.set(x, "onrewindpressed", value.asInstanceOf[js.Any])
    
    inline def setOnsoundlevelchanged(value: Any): Self = StObject.set(x, "onsoundlevelchanged", value.asInstanceOf[js.Any])
    
    inline def setOnstoppressed(value: Any): Self = StObject.set(x, "onstoppressed", value.asInstanceOf[js.Any])
    
    inline def setSoundLevel(value: SoundLevel): Self = StObject.set(x, "soundLevel", value.asInstanceOf[js.Any])
    
    inline def setTrackName(value: String): Self = StObject.set(x, "trackName", value.asInstanceOf[js.Any])
  }
}
