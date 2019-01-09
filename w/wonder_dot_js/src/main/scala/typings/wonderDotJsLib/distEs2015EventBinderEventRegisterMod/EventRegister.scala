package typings
package wonderDotJsLib.distEs2015EventBinderEventRegisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/EventRegister", "EventRegister")
@js.native
abstract class EventRegister () extends js.Object {
  var listenerMap: wonderDotJsLib.distEs2015EventStructureEventListenerMapMod.EventListenerMap = js.native
  def clear(): scala.Unit = js.native
  def forEachAll(
    func: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<any> */ /* list */ js.Any, 
      /* eventName */ wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEachEventName(
    func: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<EventRegisterData> */ /* list */ js.Any, 
      /* eventName */ wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getChild(dom: stdLib.HTMLElement): js.Any = js.native
  def getChild(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def getChild(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): js.Any = js.native
  def getChild(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def getEventRegisterDataList(
    currentTarget: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def getEventRegisterDataList(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def getEventRegisterDataList(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): js.Any = js.native
  def register(args: js.Any*): scala.Unit = js.native
  def remove(args: js.Any*): js.Any = js.native
}

