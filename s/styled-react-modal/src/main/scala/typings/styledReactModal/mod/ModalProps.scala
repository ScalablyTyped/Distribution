package typings.styledReactModal.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps extends js.Object {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var afterOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var allowScroll: js.UndefOr[Boolean] = js.native
  
  var backgroundProps: js.UndefOr[js.Object] = js.native
  
  var beforeClose: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.native
  
  var beforeOpen: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var isOpen: Boolean = js.native
  
  var onBackgroundClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  
  var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(isOpen: Boolean): ModalProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    
    @scala.inline
    def setAfterOpen(value: () => Unit): Self = this.set("afterOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterOpen: Self = this.set("afterOpen", js.undefined)
    
    @scala.inline
    def setAllowScroll(value: Boolean): Self = this.set("allowScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowScroll: Self = this.set("allowScroll", js.undefined)
    
    @scala.inline
    def setBackgroundProps(value: js.Object): Self = this.set("backgroundProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundProps: Self = this.set("backgroundProps", js.undefined)
    
    @scala.inline
    def setBeforeCloseFunction0(value: () => Unit): Self = this.set("beforeClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeClose(value: js.Promise[Unit] | js.Function0[Unit]): Self = this.set("beforeClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeOpenFunction0(value: () => Unit): Self = this.set("beforeOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeOpen(value: js.Promise[Unit] | js.Function0[Unit]): Self = this.set("beforeOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnBackgroundClick(value: /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onBackgroundClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBackgroundClick: Self = this.set("onBackgroundClick", js.undefined)
    
    @scala.inline
    def setOnEscapeKeydown(value: /* event */ Event => Unit): Self = this.set("onEscapeKeydown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEscapeKeydown: Self = this.set("onEscapeKeydown", js.undefined)
  }
}
