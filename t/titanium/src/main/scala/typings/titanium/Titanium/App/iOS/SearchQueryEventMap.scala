package typings.titanium.Titanium.App.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchQueryEventMap extends ProxyEventMap {
  
  var completed: SearchQueryCompletedEvent = js.native
  
  var founditems: SearchQueryFounditemsEvent = js.native
}
object SearchQueryEventMap {
  
  @scala.inline
  def apply(completed: SearchQueryCompletedEvent, founditems: SearchQueryFounditemsEvent): SearchQueryEventMap = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], founditems = founditems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryEventMap]
  }
  
  @scala.inline
  implicit class SearchQueryEventMapOps[Self <: SearchQueryEventMap] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: SearchQueryCompletedEvent): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFounditems(value: SearchQueryFounditemsEvent): Self = this.set("founditems", value.asInstanceOf[js.Any])
  }
}
