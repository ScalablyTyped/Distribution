package typings.twilio

import typings.twilio.understandAssistantMod.AssistantContext
import typings.twilio.understandAssistantMod.AssistantListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object understandMod {
  
  @JSImport("twilio/lib/rest/preview/Understand", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Understand {
    /**
      * Initialize the Understand version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.previewMod.^) = this()
  }
  
  @js.native
  trait Understand
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def assistants(sid: String): AssistantContext = js.native
    @JSName("assistants")
    val assistants_Original: AssistantListInstance = js.native
  }
}
