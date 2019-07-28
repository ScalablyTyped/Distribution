package typings.wonderDotJs.distEs2015EventStructureCustomEventListenerMapMod

import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventStructureEventListenerMapMod.EventListenerMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/structure/CustomEventListenerMap", "CustomEventListenerMap")
@js.native
class CustomEventListenerMap () extends EventListenerMap {
  def appendChild(eventName: EEventName, data: js.Any): js.Any = js.native
  def appendChild(target: EntityObject, eventName: EEventName, data: js.Any): js.Any = js.native
  /* protected */ def buildFirstLevelKey(uid: Double): js.Any = js.native
  def getChild(eventName: EEventName): js.Any = js.native
  def getChild(target: EntityObject): js.Any = js.native
  def getChild(target: EntityObject, eventName: EEventName): js.Any = js.native
  def hasChild(target: EntityObject): Boolean = js.native
  def removeChild(eventName: EEventName): Unit = js.native
  def removeChild(eventName: EEventName, handler: js.Function): Unit = js.native
  def removeChild(target: EntityObject): Unit = js.native
  def removeChild(target: EntityObject, eventName: EEventName): Unit = js.native
  def removeChild(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = js.native
  def removeChild(uid: Double, eventName: EEventName): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/structure/CustomEventListenerMap", "CustomEventListenerMap")
@js.native
object CustomEventListenerMap extends js.Object {
  def create(): CustomEventListenerMap = js.native
}

