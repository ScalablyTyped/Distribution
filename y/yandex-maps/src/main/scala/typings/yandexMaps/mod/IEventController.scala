package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventController extends js.Object {
  
  var onStartListening: js.UndefOr[js.Function2[/* events */ IEventManager[js.Object], /* type */ String, Unit]] = js.native
  
  var onStopListening: js.UndefOr[js.Function2[/* events */ IEventManager[js.Object], /* type */ String, Unit]] = js.native
}
object IEventController {
  
  @scala.inline
  def apply(): IEventController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventController]
  }
  
  @scala.inline
  implicit class IEventControllerOps[Self <: IEventController] (val x: Self) extends AnyVal {
    
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
    def setOnStartListening(value: (/* events */ IEventManager[js.Object], /* type */ String) => Unit): Self = this.set("onStartListening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStartListening: Self = this.set("onStartListening", js.undefined)
    
    @scala.inline
    def setOnStopListening(value: (/* events */ IEventManager[js.Object], /* type */ String) => Unit): Self = this.set("onStopListening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStopListening: Self = this.set("onStopListening", js.undefined)
  }
}
