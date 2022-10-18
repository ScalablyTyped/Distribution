package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.tsdefLocalTrackOptionsMod.LocalTrackOptions
import typings.twilioVideo.tsdefTrackMod.Track.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackPublishOptions
  extends StObject
     with LocalTrackOptions {
  
  var priority: js.UndefOr[Priority] = js.undefined
}
object MediaStreamTrackPublishOptions {
  
  inline def apply(): MediaStreamTrackPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamTrackPublishOptions]
  }
  
  extension [Self <: MediaStreamTrackPublishOptions](x: Self) {
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
