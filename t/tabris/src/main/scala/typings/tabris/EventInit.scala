package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInit extends StObject {
  
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
}
object EventInit {
  
  @scala.inline
  def apply(): EventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInit]
  }
  
  @scala.inline
  implicit class EventInitMutableBuilder[Self <: EventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
  }
}
