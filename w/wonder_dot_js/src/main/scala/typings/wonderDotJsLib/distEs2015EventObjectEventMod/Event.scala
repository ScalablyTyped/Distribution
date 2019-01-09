package typings
package wonderDotJsLib.distEs2015EventObjectEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/Event", "Event")
@js.native
abstract class Event protected () extends js.Object {
  protected def this(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName) = this()
  var currentTarget: stdLib.HTMLElement | wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject = js.native
  var isStopPropagation: scala.Boolean = js.native
  var name: java.lang.String | wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName | wonderDotJsLib.distEs2015EventEEngineEventMod.EEngineEvent = js.native
  var phase: wonderDotJsLib.distEs2015EventObjectEEventPhaseMod.EEventPhase = js.native
  var target: stdLib.HTMLElement | wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject = js.native
  val `type`: wonderDotJsLib.distEs2015EventObjectEEventTypeMod.EEventType = js.native
  /* protected */ def copyMember(destination: Event, source: Event, memberArr: js.Array[_]): Event = js.native
  def stopPropagation(): scala.Unit = js.native
}

