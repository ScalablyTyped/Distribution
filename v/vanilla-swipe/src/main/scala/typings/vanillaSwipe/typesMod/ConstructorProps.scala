package typings.vanillaSwipe.typesMod

import typings.std.Event
import typings.std.HTMLElement
import typings.vanillaSwipe.vanillaSwipeNumbers.`0`
import typings.vanillaSwipe.vanillaSwipeNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorProps extends js.Object {
  
  var delta: js.UndefOr[Double | `10`] = js.native
  
  var element: js.UndefOr[HTMLElement | Null] = js.native
  
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.native
  
  var onSwipeStart: js.UndefOr[EventHandler] = js.native
  
  var onSwiped: js.UndefOr[EventHandler] = js.native
  
  var onSwiping: js.UndefOr[EventHandler] = js.native
  
  var onTap: js.UndefOr[EventHandler] = js.native
  
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.native
  
  var preventTrackingOnMouseleave: js.UndefOr[Boolean] = js.native
  
  var rotationAngle: js.UndefOr[Double | `0`] = js.native
  
  var target: js.UndefOr[HTMLElement | Null] = js.native
  
  var touchTrackingEnabled: js.UndefOr[Boolean] = js.native
}
object ConstructorProps {
  
  @scala.inline
  def apply(): ConstructorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorProps]
  }
  
  @scala.inline
  implicit class ConstructorPropsOps[Self <: ConstructorProps] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Double | `10`): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    
    @scala.inline
    def setMouseTrackingEnabled(value: Boolean): Self = this.set("mouseTrackingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseTrackingEnabled: Self = this.set("mouseTrackingEnabled", js.undefined)
    
    @scala.inline
    def setOnSwipeStart(value: (/* e */ Event, /* data */ EventData) => Unit): Self = this.set("onSwipeStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSwipeStart: Self = this.set("onSwipeStart", js.undefined)
    
    @scala.inline
    def setOnSwiped(value: (/* e */ Event, /* data */ EventData) => Unit): Self = this.set("onSwiped", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSwiped: Self = this.set("onSwiped", js.undefined)
    
    @scala.inline
    def setOnSwiping(value: (/* e */ Event, /* data */ EventData) => Unit): Self = this.set("onSwiping", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSwiping: Self = this.set("onSwiping", js.undefined)
    
    @scala.inline
    def setOnTap(value: (/* e */ Event, /* data */ EventData) => Unit): Self = this.set("onTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    
    @scala.inline
    def setPreventDefaultTouchmoveEvent(value: Boolean): Self = this.set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultTouchmoveEvent: Self = this.set("preventDefaultTouchmoveEvent", js.undefined)
    
    @scala.inline
    def setPreventTrackingOnMouseleave(value: Boolean): Self = this.set("preventTrackingOnMouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventTrackingOnMouseleave: Self = this.set("preventTrackingOnMouseleave", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double | `0`): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTouchTrackingEnabled(value: Boolean): Self = this.set("touchTrackingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchTrackingEnabled: Self = this.set("touchTrackingEnabled", js.undefined)
  }
}
