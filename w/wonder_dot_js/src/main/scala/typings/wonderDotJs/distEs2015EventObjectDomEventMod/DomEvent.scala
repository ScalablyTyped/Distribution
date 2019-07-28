package typings.wonderDotJs.distEs2015EventObjectDomEventMod

import typings.wonderDotJs.distEs2015EventObjectCustomEventMod.CustomEvent
import typings.wonderDotJs.distEs2015EventObjectEventMod.Event
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/DomEvent", "DomEvent")
@js.native
abstract class DomEvent protected () extends Event {
  def this(event: js.Any, eventName: EEventName) = this()
  var event: js.Any = js.native
  def getDataFromCustomEvent(event: CustomEvent): Unit = js.native
  def preventDefault(): Unit = js.native
}

