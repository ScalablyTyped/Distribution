package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
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
  implicit class ActivityEventMapOps[Self <: ActivityEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewintent(value: ActivityNewintentEvent): Self = this.set("newintent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIntent(value: ActivityOnIntentEvent): Self = this.set("onIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserinteraction(value: ActivityUserinteractionEvent): Self = this.set("userinteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserleavehint(value: ActivityUserleavehintEvent): Self = this.set("userleavehint", value.asInstanceOf[js.Any])
  }
}
