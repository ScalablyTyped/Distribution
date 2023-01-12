package typings.wicgMediasession

import typings.std.MediaSessionAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSessionActionDetails extends StObject {
  
  // The action that the handler is associated with
  var action: MediaSessionAction
  
  // MAY be provided when action is seekto. Stores true if the action is being called multiple times as part of a sequence and this is not the last call in that sequence.
  var fastSeek: js.UndefOr[Boolean] = js.undefined
  
  // This MAY be provided when the action is seekbackward or seekforward. Stores number of seconds to move the playback time by.
  var seekOffset: js.UndefOr[Double] = js.undefined
  
  // MUST be provided when action is seekto. Stores the time in seconds to move the playback time to.
  var seekTime: js.UndefOr[Double] = js.undefined
}
object MediaSessionActionDetails {
  
  inline def apply(action: MediaSessionAction): MediaSessionActionDetails = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionActionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaSessionActionDetails] (val x: Self) extends AnyVal {
    
    inline def setAction(value: MediaSessionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFastSeek(value: Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
    
    inline def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
    
    inline def setSeekOffset(value: Double): Self = StObject.set(x, "seekOffset", value.asInstanceOf[js.Any])
    
    inline def setSeekOffsetUndefined: Self = StObject.set(x, "seekOffset", js.undefined)
    
    inline def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    inline def setSeekTimeUndefined: Self = StObject.set(x, "seekTime", js.undefined)
  }
}
