package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackMenuItemOptions
  extends StObject
     with MenuItemOptions {
  
  var track: TextTrack
}
object TextTrackMenuItemOptions {
  
  inline def apply(track: TextTrack): TextTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackMenuItemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextTrackMenuItemOptions] (val x: Self) extends AnyVal {
    
    inline def setTrack(value: TextTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
