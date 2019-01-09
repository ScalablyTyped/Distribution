package typings
package wonderDotJsLib.distEs2015EventStructureCustomEventListenerMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/structure/CustomEventListenerMap", "CustomEventListenerMap")
@js.native
class CustomEventListenerMap ()
  extends wonderDotJsLib.distEs2015EventStructureEventListenerMapMod.EventListenerMap {
  def appendChild(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName, data: js.Any): js.Any = js.native
  def appendChild(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    data: js.Any
  ): js.Any = js.native
  /* protected */ def buildFirstLevelKey(uid: scala.Double): js.Any = js.native
  def getChild(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): js.Any = js.native
  def getChild(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): js.Any = js.native
  def getChild(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def hasChild(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Boolean = js.native
  def removeChild(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): scala.Unit = js.native
  def removeChild(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def removeChild(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Unit = js.native
  def removeChild(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Unit = js.native
  def removeChild(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def removeChild(uid: scala.Double, eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/event/structure/CustomEventListenerMap", "CustomEventListenerMap")
@js.native
object CustomEventListenerMap extends js.Object {
  def create(): wonderDotJsLib.distEs2015EventStructureCustomEventListenerMapMod.CustomEventListenerMap = js.native
}

