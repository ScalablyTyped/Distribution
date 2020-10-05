package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventWorkflowController extends IEventController {
  var onAfterEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.native
  var onBeforeEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.native
}

object IEventWorkflowController {
  @scala.inline
  def apply(): IEventWorkflowController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventWorkflowController]
  }
  @scala.inline
  implicit class IEventWorkflowControllerOps[Self <: IEventWorkflowController] (val x: Self) extends AnyVal {
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
    def setOnAfterEventFiring(value: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Unit): Self = this.set("onAfterEventFiring", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnAfterEventFiring: Self = this.set("onAfterEventFiring", js.undefined)
    @scala.inline
    def setOnBeforeEventFiring(value: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Unit): Self = this.set("onBeforeEventFiring", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnBeforeEventFiring: Self = this.set("onBeforeEventFiring", js.undefined)
  }
  
}

