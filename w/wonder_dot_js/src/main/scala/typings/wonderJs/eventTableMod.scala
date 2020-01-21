package typings.wonderJs

import typings.wonderJs.eeventtypeMod.EEventType
import typings.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/EventTable", JSImport.Namespace)
@js.native
object eventTableMod extends js.Object {
  @js.native
  class EventTable () extends js.Object
  
  /* static members */
  @js.native
  object EventTable extends js.Object {
    def getEventType(eventName: EEventName): EEventType = js.native
  }
  
}

