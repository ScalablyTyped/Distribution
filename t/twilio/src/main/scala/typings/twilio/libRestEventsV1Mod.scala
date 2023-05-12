package typings.twilio

import typings.twilio.libRestEventsBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestEventsV1Mod {
  
  @JSImport("twilio/lib/rest/events/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Events
      *
      * @param domain - The Twilio (Twilio.Events) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** eventTypes - { Twilio.Events.V1.EventTypeListInstance } resource */
    /* protected */ var _eventTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTypeListInstance */ Any
      ] = js.native
    
    /** schemas - { Twilio.Events.V1.SchemaListInstance } resource */
    /* protected */ var _schemas: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchemaListInstance */ Any
      ] = js.native
    
    /** sinks - { Twilio.Events.V1.SinkListInstance } resource */
    /* protected */ var _sinks: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SinkListInstance */ Any
      ] = js.native
    
    /** subscriptions - { Twilio.Events.V1.SubscriptionListInstance } resource */
    /* protected */ var _subscriptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscriptionListInstance */ Any
      ] = js.native
    
    /** Getter for eventTypes resource */
    def eventTypes: Any = js.native
    
    /** Getter for schemas resource */
    def schemas: Any = js.native
    
    /** Getter for sinks resource */
    def sinks: Any = js.native
    
    /** Getter for subscriptions resource */
    def subscriptions: Any = js.native
  }
}
