package typings.twilio

import typings.twilio.eventTypeMod.EventTypeContext
import typings.twilio.eventTypeMod.EventTypeListInstance
import typings.twilio.schemaMod.SchemaContext
import typings.twilio.schemaMod.SchemaListInstance
import typings.twilio.sinkMod.SinkContext
import typings.twilio.sinkMod.SinkListInstance
import typings.twilio.subscriptionMod.SubscriptionContext
import typings.twilio.subscriptionMod.SubscriptionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsV1Mod {
  
  @JSImport("twilio/lib/rest/events/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Events
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.eventsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def eventTypes(sid: String): EventTypeContext = js.native
    @JSName("eventTypes")
    val eventTypes_Original: EventTypeListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def schemas(sid: String): SchemaContext = js.native
    @JSName("schemas")
    val schemas_Original: SchemaListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sinks(sid: String): SinkContext = js.native
    @JSName("sinks")
    val sinks_Original: SinkListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def subscriptions(sid: String): SubscriptionContext = js.native
    @JSName("subscriptions")
    val subscriptions_Original: SubscriptionListInstance = js.native
  }
}
