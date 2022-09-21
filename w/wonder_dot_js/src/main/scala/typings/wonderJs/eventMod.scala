package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eengineeventMod.EEngineEvent
import typings.wonderJs.eeventphaseMod.EEventPhase
import typings.wonderJs.eeventtypeMod.EEventType
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.eventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/Event", "Event")
  @js.native
  abstract class Event protected () extends StObject {
    /* protected */ def this(eventName: EEventName) = this()
    
    /* protected */ def copyMember(destination: Event, source: Event, memberArr: js.Array[Any]): Event = js.native
    
    var currentTarget: HTMLElement | EntityObject = js.native
    
    var isStopPropagation: Boolean = js.native
    
    var name: String | EEventName | EEngineEvent = js.native
    
    var phase: EEventPhase = js.native
    
    def stopPropagation(): Unit = js.native
    
    var target: HTMLElement | EntityObject = js.native
    
    val `type`: EEventType = js.native
  }
}
