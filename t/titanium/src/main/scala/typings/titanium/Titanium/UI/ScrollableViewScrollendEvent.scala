package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the view has stopped moving completely.
  */
@js.native
trait ScrollableViewScrollendEvent extends ScrollableViewBaseEvent {
  
  /**
    * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
    */
  var currentPage: Double = js.native
  
  /**
    * The currently visible view.
    */
  var view: View = js.native
}
object ScrollableViewScrollendEvent {
  
  @scala.inline
  def apply(currentPage: Double, source: ScrollableView, view: View): ScrollableViewScrollendEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewScrollendEvent]
  }
  
  @scala.inline
  implicit class ScrollableViewScrollendEventOps[Self <: ScrollableViewScrollendEvent] (val x: Self) extends AnyVal {
    
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
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
