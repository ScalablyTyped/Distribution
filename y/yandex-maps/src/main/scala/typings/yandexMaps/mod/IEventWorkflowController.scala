package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventWorkflowController extends IEventController {
  
  var onAfterEventFiring: js.UndefOr[
    js.Function3[
      /* events */ IEventManager[js.Object], 
      /* type */ String, 
      /* event */ js.UndefOr[IEvent[js.Object, js.Object]], 
      Unit
    ]
  ] = js.native
  
  var onBeforeEventFiring: js.UndefOr[
    js.Function3[
      /* events */ IEventManager[js.Object], 
      /* type */ String, 
      /* event */ js.UndefOr[IEvent[js.Object, js.Object]], 
      Unit
    ]
  ] = js.native
}
object IEventWorkflowController {
  
  @scala.inline
  def apply(): IEventWorkflowController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventWorkflowController]
  }
  
  @scala.inline
  implicit class IEventWorkflowControllerMutableBuilder[Self <: IEventWorkflowController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAfterEventFiring(
      value: (/* events */ IEventManager[js.Object], /* type */ String, /* event */ js.UndefOr[IEvent[js.Object, js.Object]]) => Unit
    ): Self = StObject.set(x, "onAfterEventFiring", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnAfterEventFiringUndefined: Self = StObject.set(x, "onAfterEventFiring", js.undefined)
    
    @scala.inline
    def setOnBeforeEventFiring(
      value: (/* events */ IEventManager[js.Object], /* type */ String, /* event */ js.UndefOr[IEvent[js.Object, js.Object]]) => Unit
    ): Self = StObject.set(x, "onBeforeEventFiring", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnBeforeEventFiringUndefined: Self = StObject.set(x, "onBeforeEventFiring", js.undefined)
  }
}
