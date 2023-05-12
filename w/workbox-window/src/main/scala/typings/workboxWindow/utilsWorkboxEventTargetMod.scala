package typings.workboxWindow

import typings.workboxWindow.utilsWorkboxEventMod.WorkboxEvent
import typings.workboxWindow.utilsWorkboxEventMod.WorkboxLifecycleEvent
import typings.workboxWindow.utilsWorkboxEventMod.WorkboxLifecycleWaitingEvent
import typings.workboxWindow.utilsWorkboxEventMod.WorkboxMessageEvent
import typings.workboxWindow.workboxWindowStrings.activated
import typings.workboxWindow.workboxWindowStrings.activating
import typings.workboxWindow.workboxWindowStrings.controlling
import typings.workboxWindow.workboxWindowStrings.installed
import typings.workboxWindow.workboxWindowStrings.installing
import typings.workboxWindow.workboxWindowStrings.message
import typings.workboxWindow.workboxWindowStrings.redundant
import typings.workboxWindow.workboxWindowStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsWorkboxEventTargetMod {
  
  @JSImport("workbox-window/utils/WorkboxEventTarget", "WorkboxEventTarget")
  @js.native
  open class WorkboxEventTarget () extends StObject {
    
    /* private */ val _eventListenerRegistry: Any = js.native
    
    /**
      * Returns a Set of listeners associated with the passed event type.
      * If no handlers have been registered, an empty Set is returned.
      *
      * @param {string} type The event type.
      * @return {Set<ListenerCallback>} An array of handler functions.
      * @private
      */
    /* private */ var _getEventListenersByType: Any = js.native
    
    @JSName("addEventListener")
    def addEventListener_activated(`type`: activated, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_activating(`type`: activating, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_controlling(`type`: controlling, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_installed(`type`: installed, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_installing(`type`: installing, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    /**
      * @param {string} type
      * @param {Function} listener
      * @private
      */
    @JSName("addEventListener")
    def addEventListener_message(`type`: message, listener: js.Function1[/* event */ WorkboxMessageEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_redundant(`type`: redundant, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: js.Function1[/* event */ WorkboxLifecycleWaitingEvent, Any]): Unit = js.native
    
    /**
      * @param {Object} event
      * @private
      */
    def dispatchEvent(event: WorkboxEvent[Any]): Unit = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_activated(`type`: activated, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_activating(`type`: activating, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_controlling(`type`: controlling, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_installed(`type`: installed, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_installing(`type`: installing, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    /**
      * @param {string} type
      * @param {Function} listener
      * @private
      */
    @JSName("removeEventListener")
    def removeEventListener_message(`type`: message, listener: js.Function1[/* event */ WorkboxMessageEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_redundant(`type`: redundant, listener: js.Function1[/* event */ WorkboxLifecycleEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: js.Function1[/* event */ WorkboxLifecycleWaitingEvent, Any]): Unit = js.native
  }
  
  type ListenerCallback = js.Function1[/* event */ WorkboxEvent[Any], Any]
}
