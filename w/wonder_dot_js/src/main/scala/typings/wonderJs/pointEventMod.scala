package typings.wonderJs

import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IPointEventData
import typings.wonderJs.mouseEventMod.MouseEvent
import typings.wonderJs.pointMod.Point
import typings.wonderJs.touchEventMod.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/PointEvent", "PointEvent")
  @js.native
  abstract class PointEvent protected () extends DomEvent {
    def this(event: Any, eventName: EEventName) = this()
    
    var button: Double | Null = js.native
    
    /* protected */ def cloneHelper(eventObj: PointEvent): PointEvent = js.native
    
    var eventObj: MouseEvent | TouchEvent = js.native
    
    @JSName("event")
    var event_PointEvent: IPointEventData = js.native
    
    def getDataFromEventObj(eventObj: MouseEvent): Unit = js.native
    def getDataFromEventObj(eventObj: TouchEvent): Unit = js.native
    
    var lastX: Double = js.native
    
    var lastY: Double = js.native
    
    var location: Point = js.native
    
    var locationInView: Point = js.native
    
    val movementDelta: Point = js.native
    
    val wheel: Double | Null = js.native
  }
}
