package typings.twilioVideo

import typings.twilioVideo.tsdefLocalTrackOptionsMod.LocalTrackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalDataTrackOptionsMod {
  
  trait LocalDataTrackOptions
    extends StObject
       with LocalTrackOptions {
    
    var maxPacketLifeTime: js.UndefOr[Double | Null] = js.undefined
    
    var maxRetransmits: js.UndefOr[Double | Null] = js.undefined
    
    var ordered: js.UndefOr[Boolean] = js.undefined
  }
  object LocalDataTrackOptions {
    
    inline def apply(): LocalDataTrackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalDataTrackOptions]
    }
    
    extension [Self <: LocalDataTrackOptions](x: Self) {
      
      inline def setMaxPacketLifeTime(value: Double): Self = StObject.set(x, "maxPacketLifeTime", value.asInstanceOf[js.Any])
      
      inline def setMaxPacketLifeTimeNull: Self = StObject.set(x, "maxPacketLifeTime", null)
      
      inline def setMaxPacketLifeTimeUndefined: Self = StObject.set(x, "maxPacketLifeTime", js.undefined)
      
      inline def setMaxRetransmits(value: Double): Self = StObject.set(x, "maxRetransmits", value.asInstanceOf[js.Any])
      
      inline def setMaxRetransmitsNull: Self = StObject.set(x, "maxRetransmits", null)
      
      inline def setMaxRetransmitsUndefined: Self = StObject.set(x, "maxRetransmits", js.undefined)
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    }
  }
}
