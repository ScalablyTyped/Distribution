package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventListenerMapMod.EventListenerMap
import typings.wonderJs.eventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEventListenerMapMod {
  
  @JSImport("wonder.js/dist/es2015/event/structure/DomEventListenerMap", "DomEventListenerMap")
  @js.native
  class DomEventListenerMap () extends EventListenerMap {
    
    def appendChild(dom: HTMLElement, eventName: EEventName, data: js.Any): Unit = js.native
    
    def getChild(dom: HTMLElement): js.Any = js.native
    def getChild(dom: HTMLElement, eventName: EEventName): js.Any = js.native
    
    def hasChild(dom: HTMLElement, eventName: EEventName): Boolean = js.native
    
    def removeChild(dom: HTMLElement, eventName: EEventName): js.Any = js.native
    def removeChild(dom: HTMLElement, eventName: EEventName, handler: js.Function): js.Any = js.native
    def removeChild(eventName: EEventName): js.Any = js.native
    def removeChild(eventName: EEventName, handler: js.Function): js.Any = js.native
  }
  /* static members */
  object DomEventListenerMap {
    
    @JSImport("wonder.js/dist/es2015/event/structure/DomEventListenerMap", "DomEventListenerMap")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): DomEventListenerMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DomEventListenerMap]
  }
  
  trait DomEventOffData extends StObject {
    
    var dom: HTMLElement
    
    var domHandler: js.Function
    
    var eventName: EEventName
  }
  object DomEventOffData {
    
    @scala.inline
    def apply(dom: HTMLElement, domHandler: js.Function, eventName: EEventName): DomEventOffData = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], domHandler = domHandler.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventOffData]
    }
    
    @scala.inline
    implicit class DomEventOffDataMutableBuilder[Self <: DomEventOffData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomHandler(value: js.Function): Self = StObject.set(x, "domHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventName(value: EEventName): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
}
