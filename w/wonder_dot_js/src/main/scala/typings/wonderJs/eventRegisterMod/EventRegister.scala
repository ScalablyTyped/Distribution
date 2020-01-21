package typings.wonderJs.eventRegisterMod

import typings.std.HTMLElement
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.eventListenerMapMod.EventListenerMap
import typings.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/EventRegister", "EventRegister")
@js.native
abstract class EventRegister () extends js.Object {
  var listenerMap: EventListenerMap = js.native
  def clear(): Unit = js.native
  def forEachAll(
    func: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ /* list */ js.Any, 
      /* eventName */ EEventName, 
      Unit
    ]
  ): Unit = js.native
  def forEachEventName(
    func: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EventRegisterData> */ /* list */ js.Any, 
      /* eventName */ EEventName, 
      Unit
    ]
  ): Unit = js.native
  def getChild(dom: HTMLElement): js.Any = js.native
  def getChild(dom: HTMLElement, eventName: EEventName): js.Any = js.native
  def getChild(target: EntityObject): js.Any = js.native
  def getChild(target: EntityObject, eventName: EEventName): js.Any = js.native
  def getEventRegisterDataList(currentTarget: EntityObject, eventName: EEventName): js.Any = js.native
  def getEventRegisterDataList(dom: HTMLElement, eventName: EEventName): js.Any = js.native
  def getEventRegisterDataList(eventName: EEventName): js.Any = js.native
  def register(args: js.Any*): Unit = js.native
  def remove(args: js.Any*): js.Any = js.native
}

