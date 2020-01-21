package typings.wonderJs

import typings.wonderJs.eeventtypeMod.EEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/factory/EventHandlerFactory", JSImport.Namespace)
@js.native
object eventHandlerFactoryMod extends js.Object {
  @js.native
  class EventHandlerFactory () extends js.Object
  
  /* static members */
  @js.native
  object EventHandlerFactory extends js.Object {
    def createEventHandler(eventType: EEventType): js.Any = js.native
  }
  
}

