package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityEventMap extends ProxyEventMap {
  
  var newintent: ActivityNewintentEvent = js.native
  
  var onIntent: ActivityOnIntentEvent = js.native
  
  var userinteraction: ActivityUserinteractionEvent = js.native
  
  var userleavehint: ActivityUserleavehintEvent = js.native
}
object ActivityEventMap {
  
  @scala.inline
  def apply(
    newintent: ActivityNewintentEvent,
    onIntent: ActivityOnIntentEvent,
    userinteraction: ActivityUserinteractionEvent,
    userleavehint: ActivityUserleavehintEvent
  ): ActivityEventMap = {
    val __obj = js.Dynamic.literal(newintent = newintent.asInstanceOf[js.Any], onIntent = onIntent.asInstanceOf[js.Any], userinteraction = userinteraction.asInstanceOf[js.Any], userleavehint = userleavehint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityEventMap]
  }
  
  @scala.inline
  implicit class ActivityEventMapMutableBuilder[Self <: ActivityEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewintent(value: ActivityNewintentEvent): Self = StObject.set(x, "newintent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIntent(value: ActivityOnIntentEvent): Self = StObject.set(x, "onIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserinteraction(value: ActivityUserinteractionEvent): Self = StObject.set(x, "userinteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserleavehint(value: ActivityUserleavehintEvent): Self = StObject.set(x, "userleavehint", value.asInstanceOf[js.Any])
  }
}
