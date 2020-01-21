package typings.wonderJs

import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/CustomEvent", JSImport.Namespace)
@js.native
object customEventMod extends js.Object {
  @js.native
  class CustomEvent protected () extends Event {
    def this(eventName: String) = this()
    def this(eventName: String, userData: js.Any) = this()
    var userData: js.Any = js.native
    def copyPublicAttri(destination: js.Any, source: js.Any): js.Any = js.native
    def getDataFromDomEvent(event: DomEvent): Unit = js.native
  }
  
  /* static members */
  @js.native
  object CustomEvent extends js.Object {
    def create(eventName: String): js.Any = js.native
    def create(eventName: String, userData: js.Any): js.Any = js.native
  }
  
}

