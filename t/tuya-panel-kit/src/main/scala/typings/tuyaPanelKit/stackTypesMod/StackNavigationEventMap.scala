package typings.tuyaPanelKit.stackTypesMod

import typings.tuyaPanelKit.anon.Data
import typings.tuyaPanelKit.anon.DataClosing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNavigationEventMap extends js.Object {
  
  /**
    * Event which fires when navigation gesture is canceled.
    */
  var gestureCancel: Data = js.native
  
  /**
    * Event which fires when navigation gesture is completed.
    */
  var gestureEnd: Data = js.native
  
  /**
    * Event which fires when navigation gesture starts.
    */
  var gestureStart: Data = js.native
  
  /**
    * Event which fires when a transition animation ends.
    */
  var transitionEnd: DataClosing = js.native
  
  /**
    * Event which fires when a transition animation starts.
    */
  var transitionStart: DataClosing = js.native
}
object StackNavigationEventMap {
  
  @scala.inline
  def apply(
    gestureCancel: Data,
    gestureEnd: Data,
    gestureStart: Data,
    transitionEnd: DataClosing,
    transitionStart: DataClosing
  ): StackNavigationEventMap = {
    val __obj = js.Dynamic.literal(gestureCancel = gestureCancel.asInstanceOf[js.Any], gestureEnd = gestureEnd.asInstanceOf[js.Any], gestureStart = gestureStart.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], transitionStart = transitionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationEventMap]
  }
  
  @scala.inline
  implicit class StackNavigationEventMapOps[Self <: StackNavigationEventMap] (val x: Self) extends AnyVal {
    
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
    def setGestureCancel(value: Data): Self = this.set("gestureCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureEnd(value: Data): Self = this.set("gestureEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureStart(value: Data): Self = this.set("gestureStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEnd(value: DataClosing): Self = this.set("transitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionStart(value: DataClosing): Self = this.set("transitionStart", value.asInstanceOf[js.Any])
  }
}
