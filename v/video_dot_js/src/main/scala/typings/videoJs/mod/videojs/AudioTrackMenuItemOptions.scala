package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTrackMenuItemOptions
  extends StObject
     with MenuItemOptions {
  
  var track: js.UndefOr[VideojsAudioTrack] = js.undefined
}
object AudioTrackMenuItemOptions {
  
  inline def apply(): AudioTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTrackMenuItemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioTrackMenuItemOptions] (val x: Self) extends AnyVal {
    
    inline def setTrack(value: VideojsAudioTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
