package typings.twilio

import typings.twilio.flowMod.FlowContext
import typings.twilio.flowMod.FlowListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object studioV1Mod {
  
  @JSImport("twilio/lib/rest/studio/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Studio
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.studioMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def flows(sid: String): FlowContext = js.native
    @JSName("flows")
    val flows_Original: FlowListInstance = js.native
  }
}
