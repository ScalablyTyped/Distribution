package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.domEventListenerMapMod.DomEventListenerMap
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.eventRegisterMod.EventRegister
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEventRegisterMod {
  
  @JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
  @js.native
  class DomEventRegister () extends EventRegister {
    
    def getDomHandler(dom: HTMLElement, eventName: EEventName): js.Function = js.native
    
    def isBinded(dom: HTMLElement, eventName: EEventName): Boolean = js.native
    
    @JSName("listenerMap")
    var listenerMap_DomEventRegister: DomEventListenerMap = js.native
    
    def register(
      dom: HTMLElement,
      eventName: EEventName,
      eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any,
      handler: js.Function,
      originHandler: js.Function,
      domHandler: js.Function,
      priority: Double
    ): Unit = js.native
    
    def remove(dom: HTMLElement, eventName: EEventName): js.Any = js.native
    def remove(dom: HTMLElement, eventName: EEventName, handler: js.Function): js.Any = js.native
    def remove(eventName: EEventName): js.Any = js.native
    def remove(eventName: EEventName, handler: js.Function): js.Any = js.native
  }
  /* static members */
  object DomEventRegister {
    
    @JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Any]
  }
  
  trait DomEventRegisterData extends StObject {
    
    var dom: js.UndefOr[HTMLElement] = js.undefined
    
    var domHandler: js.Function
    
    var eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any
    
    var handler: js.Function
    
    var originHandler: js.Function
    
    var priority: Double
    
    var target: js.UndefOr[EntityObject] = js.undefined
  }
  object DomEventRegisterData {
    
    @scala.inline
    def apply(
      domHandler: js.Function,
      eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any,
      handler: js.Function,
      originHandler: js.Function,
      priority: Double
    ): DomEventRegisterData = {
      val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], eventData = eventData.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventRegisterData]
    }
    
    @scala.inline
    implicit class DomEventRegisterDataMutableBuilder[Self <: DomEventRegisterData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomHandler(value: js.Function): Self = StObject.set(x, "domHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      @scala.inline
      def setEventData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any
      ): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginHandler(value: js.Function): Self = StObject.set(x, "originHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: EntityObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
