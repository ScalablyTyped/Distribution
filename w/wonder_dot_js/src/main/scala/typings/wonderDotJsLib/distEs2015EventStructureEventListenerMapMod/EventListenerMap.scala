package typings
package wonderDotJsLib.distEs2015EventStructureEventListenerMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/structure/EventListenerMap", "EventListenerMap")
@js.native
abstract class EventListenerMap () extends js.Object {
  def appendChild(args: js.Any*): scala.Unit = js.native
  /* protected */ def buildFirstLevelKey(target: stdLib.HTMLElement): java.lang.String = js.native
  /* protected */ def buildFirstLevelKey(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): java.lang.String = js.native
  /* protected */ def buildSecondLevelKey(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): java.lang.String = js.native
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
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<any> */ /* list */ js.Any, 
      /* eventName */ wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getChild(args: js.Any*): js.Any = js.native
  def hasChild(args: js.Any*): scala.Boolean = js.native
  def removeChild(args: js.Any*): js.Any = js.native
}

