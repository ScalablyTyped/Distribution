package typings
package wonderDotJsLib.distEs2015EventObjectDomEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/DomEvent", "DomEvent")
@js.native
abstract class DomEvent protected ()
  extends wonderDotJsLib.distEs2015EventObjectEventMod.Event {
  def this(event: js.Any, eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName) = this()
  var event: js.Any = js.native
  def getDataFromCustomEvent(event: wonderDotJsLib.distEs2015EventObjectCustomEventMod.CustomEvent): scala.Unit = js.native
  def preventDefault(): scala.Unit = js.native
}

