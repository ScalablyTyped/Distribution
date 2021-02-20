package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEventMap extends ProxyEventMap {
  
  var complete: AnimationCompleteEvent = js.native
  
  var start: AnimationStartEvent = js.native
}
object AnimationEventMap {
  
  @scala.inline
  def apply(complete: AnimationCompleteEvent, start: AnimationStartEvent): AnimationEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventMap]
  }
  
  @scala.inline
  implicit class AnimationEventMapMutableBuilder[Self <: AnimationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: AnimationCompleteEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: AnimationStartEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
