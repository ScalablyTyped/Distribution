package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015EventBinderEventRegisterMod.EventRegister
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventStructureDomEventListenerMapMod.DomEventListenerMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventBinderDomEventRegisterMod {
  
  @JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
  @js.native
  open class DomEventRegister () extends EventRegister {
    
    def getDomHandler(dom: HTMLElement, eventName: EEventName): js.Function = js.native
    
    def isBinded(dom: HTMLElement, eventName: EEventName): Boolean = js.native
    
    /* protected */ @JSName("listenerMap")
    var listenerMap_DomEventRegister: DomEventListenerMap = js.native
    
    def register(
      dom: HTMLElement,
      eventName: EEventName,
      eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ Any,
      handler: js.Function,
      originHandler: js.Function,
      domHandler: js.Function,
      priority: Double
    ): Unit = js.native
    
    def remove(dom: HTMLElement, eventName: EEventName): Any = js.native
    def remove(dom: HTMLElement, eventName: EEventName, handler: js.Function): Any = js.native
    def remove(eventName: EEventName): Any = js.native
    def remove(eventName: EEventName, handler: js.Function): Any = js.native
  }
  /* static members */
  object DomEventRegister {
    
    @JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
  
  trait DomEventRegisterData extends StObject {
    
    var dom: js.UndefOr[HTMLElement] = js.undefined
    
    var domHandler: js.Function
    
    var eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ Any
    
    var handler: js.Function
    
    var originHandler: js.Function
    
    var priority: Double
    
    var target: js.UndefOr[EntityObject] = js.undefined
  }
  object DomEventRegisterData {
    
    inline def apply(
      domHandler: js.Function,
      eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ Any,
      handler: js.Function,
      originHandler: js.Function,
      priority: Double
    ): DomEventRegisterData = {
      val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], eventData = eventData.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventRegisterData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomEventRegisterData] (val x: Self) extends AnyVal {
      
      inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setDomHandler(value: js.Function): Self = StObject.set(x, "domHandler", value.asInstanceOf[js.Any])
      
      inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      inline def setEventData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ Any
      ): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setOriginHandler(value: js.Function): Self = StObject.set(x, "originHandler", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: EntityObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
