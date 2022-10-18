package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestServerlessMod {
  
  @JSImport("twilio/lib/rest/Serverless", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Serverless {
    /**
      * Initialize serverless domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Serverless
    extends typings.twilio.libBaseDomainMod.^ {
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestServerlessV1Mod.^ = js.native
  }
}
