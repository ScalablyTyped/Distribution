package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackButtonOptions
  extends StObject
     with MenuButtonOptions {
  
  var track: js.Array[Track]
}
object TrackButtonOptions {
  
  inline def apply(track: js.Array[Track]): TrackButtonOptions = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setTrack(value: js.Array[Track]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackVarargs(value: Track*): Self = StObject.set(x, "track", js.Array(value*))
  }
}
