package typings.twilio

import typings.twilio.flowValidateMod.FlowValidateListInstance
import typings.twilio.v2FlowMod.FlowContext
import typings.twilio.v2FlowMod.FlowListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object studioV2Mod {
  
  @JSImport("twilio/lib/rest/studio/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Studio
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.studioMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.versionMod.^ {
    
    val flowValidate: FlowValidateListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def flows(sid: String): FlowContext = js.native
    @JSName("flows")
    val flows_Original: FlowListInstance = js.native
  }
}
