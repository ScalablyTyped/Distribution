package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestEventsV1Mod {
  
  @JSImport("twilio/lib/rest/events/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Events
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestEventsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val eventTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTypeListInstance */ Any = js.native
    
    val schemas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchemaListInstance */ Any = js.native
    
    val sinks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SinkListInstance */ Any = js.native
    
    val subscriptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscriptionListInstance */ Any = js.native
  }
}
