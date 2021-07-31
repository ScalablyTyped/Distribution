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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class WorkboxEventMapMutableBuilder[Self <: WorkboxEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivated(value: WorkboxUpdatableEvent): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlling(value: WorkboxEvent): Self = StObject.set(x, "controlling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalactivated(value: WorkboxExtendableEvent): Self = StObject.set(x, "externalactivated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalinstalled(value: WorkboxExtendableEvent): Self = StObject.set(x, "externalinstalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalwaiting(value: WorkboxExtendableEvent): Self = StObject.set(x, "externalwaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstalled(value: WorkboxUpdatableEvent): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: WorkboxMessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedundant(value: WorkboxEvent): Self = StObject.set(x, "redundant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaiting(value: WorkboxWaitingEvent): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkboxExtendableEvent
    extends StObject
       with WorkboxEvent {
    
    val sw: ServiceWorker
  }
  object WorkboxExtendableEvent {
    
    @scala.inline
    def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxExtendableEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxExtendableEvent]
    }
    
    @scala.inline
    implicit class WorkboxExtendableEventMutableBuilder[Self <: WorkboxExtendableEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSw(value: ServiceWorker): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkboxMessageEvent
    extends StObject
       with WorkboxEvent {
    
    val data: js.Any
  }
  object WorkboxMessageEvent {
    
    @scala.inline
    def apply(data: js.Any, originalEvent: Event, target: Workbox, `type`: String): WorkboxMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxMessageEvent]
    }
    
    @scala.inline
    implicit class WorkboxMessageEventMutableBuilder[Self <: WorkboxMessageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkboxUpdatableEvent
    extends StObject
       with WorkboxExtendableEvent {
    
    val isUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object WorkboxUpdatableEvent {
    
    @scala.inline
    def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxUpdatableEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxUpdatableEvent]
    }
    
    @scala.inline
    implicit class WorkboxUpdatableEventMutableBuilder[Self <: WorkboxUpdatableEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsUpdate(value: Boolean): Self = StObject.set(x, "isUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUpdateUndefined: Self = StObject.set(x, "isUpdate", js.undefined)
    }
  }
  
  trait WorkboxWaitingEvent
    extends StObject
       with WorkboxUpdatableEvent {
    
    val wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.undefined
  }
  object WorkboxWaitingEvent {
    
    @scala.inline
    def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxWaitingEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxWaitingEvent]
    }
    
    @scala.inline
    implicit class WorkboxWaitingEventMutableBuilder[Self <: WorkboxWaitingEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWasWaitingBeforeRegister(value: Boolean): Self = StObject.set(x, "wasWaitingBeforeRegister", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasWaitingBeforeRegisterUndefined: Self = StObject.set(x, "wasWaitingBeforeRegister", js.undefined)
    }
  }
}
