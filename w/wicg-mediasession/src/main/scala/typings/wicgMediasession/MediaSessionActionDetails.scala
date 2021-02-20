package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSessionActionDetails extends StObject {
  
  // The action that the handler is associated with
  var action: MediaSessionAction = js.native
  
  // MAY be provided when action is seekto. Stores true if the action is being called multiple times as part of a sequence and this is not the last call in that sequence.
  var fastSeek: js.UndefOr[Boolean] = js.native
  
  // This MAY be provided when the action is seekbackward or seekforward. Stores number of seconds to move the playback time by.
  var seekOffset: js.UndefOr[Double] = js.native
  
  // MUST be provided when action is seekto. Stores the time in seconds to move the playback time to.
  var seekTime: js.UndefOr[Double] = js.native
}
object MediaSessionActionDetails {
  
  @scala.inline
  def apply(action: MediaSessionAction): MediaSessionActionDetails = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionActionDetails]
  }
  
  @scala.inline
  implicit class MediaSessionActionDetailsMutableBuilder[Self <: MediaSessionActionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: MediaSessionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSeek(value: Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
    
    @scala.inline
    def setSeekOffset(value: Double): Self = StObject.set(x, "seekOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekOffsetUndefined: Self = StObject.set(x, "seekOffset", js.undefined)
    
    @scala.inline
    def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTimeUndefined: Self = StObject.set(x, "seekTime", js.undefined)
  }
}
