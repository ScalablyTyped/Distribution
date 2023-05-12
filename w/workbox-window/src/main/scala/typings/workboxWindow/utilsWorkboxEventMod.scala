package typings.workboxWindow

import typings.std.Event
import typings.std.MessagePort
import typings.std.Omit
import typings.std.ServiceWorker
import typings.workboxWindow.utilsWorkboxEventTargetMod.WorkboxEventTarget
import typings.workboxWindow.workboxWindowStrings.activated
import typings.workboxWindow.workboxWindowStrings.activating
import typings.workboxWindow.workboxWindowStrings.controlling
import typings.workboxWindow.workboxWindowStrings.installed
import typings.workboxWindow.workboxWindowStrings.installing
import typings.workboxWindow.workboxWindowStrings.message
import typings.workboxWindow.workboxWindowStrings.redundant
import typings.workboxWindow.workboxWindowStrings.target
import typings.workboxWindow.workboxWindowStrings.waiting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsWorkboxEventMod {
  
  @JSImport("workbox-window/utils/WorkboxEvent", "WorkboxEvent")
  @js.native
  open class WorkboxEvent[K /* <: message */] protected () extends StObject {
    def this(
      `type`: K,
      props: Omit[
            /* import warning: importer.ImportType#apply Failed type conversion: workbox-window.workbox-window/utils/WorkboxEvent.WorkboxEventMap[K] */ js.Any, 
            target | typings.workboxWindow.workboxWindowStrings.`type`
          ]
    ) = this()
    
    var isExternal: js.UndefOr[Boolean] = js.native
    
    var originalEvent: js.UndefOr[Event] = js.native
    
    var sw: js.UndefOr[ServiceWorker] = js.native
    
    var target: js.UndefOr[WorkboxEventTarget] = js.native
    
    var `type`: K = js.native
  }
  
  trait WorkboxEventMap
    extends StObject
       with WorkboxLifecycleEventMap {
    
    var message: WorkboxMessageEvent
  }
  object WorkboxEventMap {
    
    inline def apply(
      activated: WorkboxLifecycleEvent,
      activating: WorkboxLifecycleEvent,
      controlling: WorkboxLifecycleEvent,
      installed: WorkboxLifecycleEvent,
      installing: WorkboxLifecycleEvent,
      message: WorkboxMessageEvent,
      redundant: WorkboxLifecycleEvent,
      waiting: WorkboxLifecycleWaitingEvent
    ): WorkboxEventMap = {
      val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], activating = activating.asInstanceOf[js.Any], controlling = controlling.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], installing = installing.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], redundant = redundant.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkboxEventMap] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: WorkboxMessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkboxLifecycleEvent extends WorkboxEvent[
          installing | installed | waiting | activating | activated | controlling | redundant
        ] {
    
    var isUpdate: js.UndefOr[Boolean] = js.native
  }
  
  trait WorkboxLifecycleEventMap extends StObject {
    
    var activated: WorkboxLifecycleEvent
    
    var activating: WorkboxLifecycleEvent
    
    var controlling: WorkboxLifecycleEvent
    
    var installed: WorkboxLifecycleEvent
    
    var installing: WorkboxLifecycleEvent
    
    var redundant: WorkboxLifecycleEvent
    
    var waiting: WorkboxLifecycleWaitingEvent
  }
  object WorkboxLifecycleEventMap {
    
    inline def apply(
      activated: WorkboxLifecycleEvent,
      activating: WorkboxLifecycleEvent,
      controlling: WorkboxLifecycleEvent,
      installed: WorkboxLifecycleEvent,
      installing: WorkboxLifecycleEvent,
      redundant: WorkboxLifecycleEvent,
      waiting: WorkboxLifecycleWaitingEvent
    ): WorkboxLifecycleEventMap = {
      val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], activating = activating.asInstanceOf[js.Any], controlling = controlling.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], installing = installing.asInstanceOf[js.Any], redundant = redundant.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxLifecycleEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkboxLifecycleEventMap] (val x: Self) extends AnyVal {
      
      inline def setActivated(value: WorkboxLifecycleEvent): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      inline def setActivating(value: WorkboxLifecycleEvent): Self = StObject.set(x, "activating", value.asInstanceOf[js.Any])
      
      inline def setControlling(value: WorkboxLifecycleEvent): Self = StObject.set(x, "controlling", value.asInstanceOf[js.Any])
      
      inline def setInstalled(value: WorkboxLifecycleEvent): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
      
      inline def setInstalling(value: WorkboxLifecycleEvent): Self = StObject.set(x, "installing", value.asInstanceOf[js.Any])
      
      inline def setRedundant(value: WorkboxLifecycleEvent): Self = StObject.set(x, "redundant", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: WorkboxLifecycleWaitingEvent): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkboxLifecycleWaitingEvent extends WorkboxLifecycleEvent {
    
    var wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait WorkboxMessageEvent extends WorkboxEvent[message] {
    
    var data: Any = js.native
    
    @JSName("originalEvent")
    var originalEvent_WorkboxMessageEvent: Event = js.native
    
    var ports: js.Array[MessagePort] = js.native
  }
}
