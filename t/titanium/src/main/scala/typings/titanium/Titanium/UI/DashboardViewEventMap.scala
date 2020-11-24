package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardViewEventMap extends ProxyEventMap {
  
  var click: DashboardViewClickEvent = js.native
  
  var commit: DashboardViewCommitEvent = js.native
  
  var dblclick: DashboardViewDblclickEvent = js.native
  
  var delete: DashboardViewDeleteEvent = js.native
  
  var doubletap: DashboardViewDoubletapEvent = js.native
  
  var dragend: DashboardViewDragendEvent = js.native
  
  var dragstart: DashboardViewDragstartEvent = js.native
  
  var edit: DashboardViewEditEvent = js.native
  
  var keypressed: DashboardViewKeypressedEvent = js.native
  
  var longpress: DashboardViewLongpressEvent = js.native
  
  var move: DashboardViewMoveEvent = js.native
  
  var pagechanged: DashboardViewPagechangedEvent = js.native
  
  var pinch: DashboardViewPinchEvent = js.native
  
  var postlayout: DashboardViewPostlayoutEvent = js.native
  
  var singletap: DashboardViewSingletapEvent = js.native
  
  var swipe: DashboardViewSwipeEvent = js.native
  
  var touchcancel: DashboardViewTouchcancelEvent = js.native
  
  var touchend: DashboardViewTouchendEvent = js.native
  
  var touchmove: DashboardViewTouchmoveEvent = js.native
  
  var touchstart: DashboardViewTouchstartEvent = js.native
  
  var twofingertap: DashboardViewTwofingertapEvent = js.native
}
object DashboardViewEventMap {
  
  @scala.inline
  def apply(
    click: DashboardViewClickEvent,
    commit: DashboardViewCommitEvent,
    dblclick: DashboardViewDblclickEvent,
    delete: DashboardViewDeleteEvent,
    doubletap: DashboardViewDoubletapEvent,
    dragend: DashboardViewDragendEvent,
    dragstart: DashboardViewDragstartEvent,
    edit: DashboardViewEditEvent,
    keypressed: DashboardViewKeypressedEvent,
    longpress: DashboardViewLongpressEvent,
    move: DashboardViewMoveEvent,
    pagechanged: DashboardViewPagechangedEvent,
    pinch: DashboardViewPinchEvent,
    postlayout: DashboardViewPostlayoutEvent,
    singletap: DashboardViewSingletapEvent,
    swipe: DashboardViewSwipeEvent,
    touchcancel: DashboardViewTouchcancelEvent,
    touchend: DashboardViewTouchendEvent,
    touchmove: DashboardViewTouchmoveEvent,
    touchstart: DashboardViewTouchstartEvent,
    twofingertap: DashboardViewTwofingertapEvent
  ): DashboardViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], pagechanged = pagechanged.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewEventMap]
  }
  
  @scala.inline
  implicit class DashboardViewEventMapOps[Self <: DashboardViewEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: DashboardViewClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: DashboardViewCommitEvent): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: DashboardViewDblclickEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: DashboardViewDeleteEvent): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: DashboardViewDoubletapEvent): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragend(value: DashboardViewDragendEvent): Self = this.set("dragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragstart(value: DashboardViewDragstartEvent): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: DashboardViewEditEvent): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: DashboardViewKeypressedEvent): Self = this.set("keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: DashboardViewLongpressEvent): Self = this.set("longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: DashboardViewMoveEvent): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagechanged(value: DashboardViewPagechangedEvent): Self = this.set("pagechanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: DashboardViewPinchEvent): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: DashboardViewPostlayoutEvent): Self = this.set("postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: DashboardViewSingletapEvent): Self = this.set("singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: DashboardViewSwipeEvent): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: DashboardViewTouchcancelEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: DashboardViewTouchendEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: DashboardViewTouchmoveEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: DashboardViewTouchstartEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: DashboardViewTwofingertapEvent): Self = this.set("twofingertap", value.asInstanceOf[js.Any])
  }
}
