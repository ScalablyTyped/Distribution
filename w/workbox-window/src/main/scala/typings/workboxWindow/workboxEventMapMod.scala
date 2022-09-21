package typings.workboxWindow

import typings.std.Event
import typings.std.ServiceWorker
import typings.workboxWindow.workboxEventMod.WorkboxEvent
import typings.workboxWindow.workboxMod.Workbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxEventMapMod {
  
  trait WorkboxEventMap extends StObject {
    
    var activated: WorkboxUpdatableEvent
    
    var controlling: WorkboxEvent
    
    var externalactivated: WorkboxExtendableEvent
    
    var externalinstalled: WorkboxExtendableEvent
    
    var externalwaiting: WorkboxExtendableEvent
    
    var installed: WorkboxUpdatableEvent
    
    var message: WorkboxMessageEvent
    
    var redundant: WorkboxEvent
    
    var waiting: WorkboxWaitingEvent
  }
  object WorkboxEventMap {
    
    inline def apply(
      activated: WorkboxUpdatableEvent,
      controlling: WorkboxEvent,
      externalactivated: WorkboxExtendableEvent,
      externalinstalled: WorkboxExtendableEvent,
      externalwaiting: WorkboxExtendableEvent,
      installed: WorkboxUpdatableEvent,
      message: WorkboxMessageEvent,
      redundant: WorkboxEvent,
      waiting: WorkboxWaitingEvent
    ): WorkboxEventMap = {
      val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], controlling = controlling.asInstanceOf[js.Any], externalactivated = externalactivated.asInstanceOf[js.Any], externalinstalled = externalinstalled.asInstanceOf[js.Any], externalwaiting = externalwaiting.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], redundant = redundant.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxEventMap]
    }
    
    extension [Self <: WorkboxEventMap](x: Self) {
      
      inline def setActivated(value: WorkboxUpdatableEvent): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      inline def setControlling(value: WorkboxEvent): Self = StObject.set(x, "controlling", value.asInstanceOf[js.Any])
      
      inline def setExternalactivated(value: WorkboxExtendableEvent): Self = StObject.set(x, "externalactivated", value.asInstanceOf[js.Any])
      
      inline def setExternalinstalled(value: WorkboxExtendableEvent): Self = StObject.set(x, "externalinstalled", value.asInstanceOf[js.Any])
      
      inline def setExternalwaiting(value: WorkboxExtendableEvent): Self = StObject.set(x, "externalwaiting", value.asInstanceOf[js.Any])
      
      inline def setInstalled(value: WorkboxUpdatableEvent): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: WorkboxMessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRedundant(value: WorkboxEvent): Self = StObject.set(x, "redundant", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: WorkboxWaitingEvent): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkboxExtendableEvent
    extends StObject
       with WorkboxEvent {
    
    val sw: ServiceWorker
  }
  object WorkboxExtendableEvent {
    
    inline def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxExtendableEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxExtendableEvent]
    }
    
    extension [Self <: WorkboxExtendableEvent](x: Self) {
      
      inline def setSw(value: ServiceWorker): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkboxMessageEvent
    extends StObject
       with WorkboxEvent {
    
    val data: Any
  }
  object WorkboxMessageEvent {
    
    inline def apply(data: Any, originalEvent: Event, target: Workbox, `type`: String): WorkboxMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxMessageEvent]
    }
    
    extension [Self <: WorkboxMessageEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkboxUpdatableEvent
    extends StObject
       with WorkboxExtendableEvent {
    
    val isUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object WorkboxUpdatableEvent {
    
    inline def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxUpdatableEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxUpdatableEvent]
    }
    
    extension [Self <: WorkboxUpdatableEvent](x: Self) {
      
      inline def setIsUpdate(value: Boolean): Self = StObject.set(x, "isUpdate", value.asInstanceOf[js.Any])
      
      inline def setIsUpdateUndefined: Self = StObject.set(x, "isUpdate", js.undefined)
    }
  }
  
  trait WorkboxWaitingEvent
    extends StObject
       with WorkboxUpdatableEvent {
    
    val wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.undefined
  }
  object WorkboxWaitingEvent {
    
    inline def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxWaitingEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxWaitingEvent]
    }
    
    extension [Self <: WorkboxWaitingEvent](x: Self) {
      
      inline def setWasWaitingBeforeRegister(value: Boolean): Self = StObject.set(x, "wasWaitingBeforeRegister", value.asInstanceOf[js.Any])
      
      inline def setWasWaitingBeforeRegisterUndefined: Self = StObject.set(x, "wasWaitingBeforeRegister", js.undefined)
    }
  }
}
