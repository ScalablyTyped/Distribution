package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.tsdefTrackMod.Track.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalTrackPublishOptions extends StObject {
  
  var priority: js.UndefOr[Priority] = js.undefined
}
object LocalTrackPublishOptions {
  
  inline def apply(): LocalTrackPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalTrackPublishOptions]
  }
  
  extension [Self <: LocalTrackPublishOptions](x: Self) {
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
