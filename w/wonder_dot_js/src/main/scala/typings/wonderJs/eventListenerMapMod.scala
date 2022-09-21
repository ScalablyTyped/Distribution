package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.eventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventListenerMapMod {
  
  @JSImport("wonder.js/dist/es2015/event/structure/EventListenerMap", "EventListenerMap")
  @js.native
  abstract class EventListenerMap () extends StObject {
    
    def appendChild(args: Any*): Unit = js.native
    
    /* protected */ def buildFirstLevelKey(target: HTMLElement): String = js.native
    /* protected */ def buildFirstLevelKey(target: EntityObject): String = js.native
    
    /* protected */ def buildSecondLevelKey(eventName: EEventName): String = js.native
    
    def clear(): Unit = js.native
    
    def forEachAll(
      func: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ /* list */ Any, 
          /* eventName */ EEventName, 
          Unit
        ]
    ): Unit = js.native
    
    def forEachEventName(
      func: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ /* list */ Any, 
          /* eventName */ EEventName, 
          Unit
        ]
    ): Unit = js.native
    
    def getChild(args: Any*): Any = js.native
    
    def hasChild(args: Any*): Boolean = js.native
    
    def removeChild(args: Any*): Any = js.native
  }
}
