package typings.twilio

import typings.twilio.flowValidateMod.FlowValidateListInstance
import typings.twilio.v2FlowMod.FlowContext
import typings.twilio.v2FlowMod.FlowListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object studioMod {
  
  @JSImport("twilio/lib/rest/Studio", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Studio {
    /**
      * Initialize studio domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Studio
    extends typings.twilio.domainMod.^ {
    
    val flowValidate: FlowValidateListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def flows(sid: String): FlowContext = js.native
    @JSName("flows")
    val flows_Original: FlowListInstance = js.native
    
    val v1: typings.twilio.studioV1Mod.^ = js.native
    
    val v2: typings.twilio.studioV2Mod.^ = js.native
  }
}
