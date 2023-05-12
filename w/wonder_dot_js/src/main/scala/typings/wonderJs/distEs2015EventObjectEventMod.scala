package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent
import typings.wonderJs.distEs2015EventObjectEeventphaseMod.EEventPhase
import typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectEventMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/event/object/Event", "Event")
  @js.native
  open class Event protected () extends StObject {
    /* protected */ def this(eventName: EEventName) = this()
    
    // eslint-disable-next-line no-single-element-tuple-type
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
