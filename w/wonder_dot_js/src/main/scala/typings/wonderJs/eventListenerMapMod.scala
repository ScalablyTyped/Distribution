package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/structure/EventListenerMap", JSImport.Namespace)
@js.native
object eventListenerMapMod extends js.Object {
  @js.native
  abstract class EventListenerMap () extends js.Object {
    def appendChild(args: js.Any*): Unit = js.native
    /* protected */ def buildFirstLevelKey(target: HTMLElement): String = js.native
    /* protected */ def buildFirstLevelKey(target: EntityObject): String = js.native
    /* protected */ def buildSecondLevelKey(eventName: EEventName): String = js.native
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ /* list */ js.Any, 
          /* eventName */ EEventName, 
          Unit
        ]
    ): Unit = js.native
    def getChild(args: js.Any*): js.Any = js.native
    def hasChild(args: js.Any*): Boolean = js.native
    def removeChild(args: js.Any*): js.Any = js.native
  }
  
}

