package typings.wicgMediasession

import typings.std.MediaSessionAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<std.Pick<wicg-mediasession.MediaSessionActionDetails, 'seekTime'>> & wicg-mediasession.MediaSessionActionDetails */
  trait RequiredPickMediaSessionA extends StObject {
    
    // The action that the handler is associated with
    var action: MediaSessionAction
    
    // MAY be provided when action is seekto. Stores true if the action is being called multiple times as part of a sequence and this is not the last call in that sequence.
    var fastSeek: js.UndefOr[Boolean | Null] = js.undefined
    
    // This MAY be provided when the action is seekbackward or seekforward. Stores number of seconds to move the playback time by.
    var seekOffset: js.UndefOr[Double | Null] = js.undefined
    
    // MUST be provided when action is seekto. Stores the time in seconds to move the playback time to.
    var seekTime: Double & (js.UndefOr[Double | Null])
  }
  object RequiredPickMediaSessionA {
    
    inline def apply(action: MediaSessionAction, seekTime: Double & (js.UndefOr[Double | Null])): RequiredPickMediaSessionA = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], seekTime = seekTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredPickMediaSessionA]
    }
    
    extension [Self <: RequiredPickMediaSessionA](x: Self) {
      
      inline def setAction(value: MediaSessionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setFastSeek(value: Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
      
      inline def setFastSeekNull: Self = StObject.set(x, "fastSeek", null)
      
      inline def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
      
      inline def setSeekOffset(value: Double): Self = StObject.set(x, "seekOffset", value.asInstanceOf[js.Any])
      
      inline def setSeekOffsetNull: Self = StObject.set(x, "seekOffset", null)
      
      inline def setSeekOffsetUndefined: Self = StObject.set(x, "seekOffset", js.undefined)
      
      inline def setSeekTime(value: Double & (js.UndefOr[Double | Null])): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    }
  }
}
