package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaptersTrackMenuItemOptions extends MenuItemOptions {
  
  var cue: TextTrackCue = js.native
  
  var track: TextTrack = js.native
}
object ChaptersTrackMenuItemOptions {
  
  @scala.inline
  def apply(cue: TextTrackCue, track: TextTrack): ChaptersTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaptersTrackMenuItemOptions]
  }
  
  @scala.inline
  implicit class ChaptersTrackMenuItemOptionsMutableBuilder[Self <: ChaptersTrackMenuItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCue(value: TextTrackCue): Self = StObject.set(x, "cue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: TextTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
