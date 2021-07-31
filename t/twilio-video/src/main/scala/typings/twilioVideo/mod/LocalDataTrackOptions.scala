package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalDataTrackOptions extends StObject {
  
  var maxPacketLifeTime: js.UndefOr[Double | Null] = js.undefined
  
  var maxRetransmits: js.UndefOr[Double | Null] = js.undefined
  
  var ordered: js.UndefOr[Boolean] = js.undefined
}
object LocalDataTrackOptions {
  
  @scala.inline
  def apply(): LocalDataTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDataTrackOptions]
  }
  
  @scala.inline
  implicit class LocalDataTrackOptionsMutableBuilder[Self <: LocalDataTrackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxPacketLifeTime(value: Double): Self = StObject.set(x, "maxPacketLifeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketLifeTimeNull: Self = StObject.set(x, "maxPacketLifeTime", null)
    
    @scala.inline
    def setMaxPacketLifeTimeUndefined: Self = StObject.set(x, "maxPacketLifeTime", js.undefined)
    
    @scala.inline
    def setMaxRetransmits(value: Double): Self = StObject.set(x, "maxRetransmits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetransmitsNull: Self = StObject.set(x, "maxRetransmits", null)
    
    @scala.inline
    def setMaxRetransmitsUndefined: Self = StObject.set(x, "maxRetransmits", js.undefined)
    
    @scala.inline
    def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
  }
}
