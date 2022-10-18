package typings.twilio

import typings.twilio.libRestPreviewUnderstandAssistantMod.AssistantContext
import typings.twilio.libRestPreviewUnderstandAssistantMod.AssistantListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandMod {
  
  @JSImport("twilio/lib/rest/preview/Understand", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Understand {
    /**
      * Initialize the Understand version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait Understand
    extends typings.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def assistants(sid: String): AssistantContext = js.native
    @JSName("assistants")
    val assistants_Original: AssistantListInstance = js.native
  }
}
