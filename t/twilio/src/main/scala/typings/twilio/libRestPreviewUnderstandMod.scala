package typings.twilio

import typings.twilio.libRestPreviewBaseMod.^
import typings.twilio.libRestPreviewUnderstandAssistantMod.AssistantListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandMod {
  
  @JSImport("twilio/lib/rest/preview/Understand", JSImport.Default)
  @js.native
  open class default protected () extends Understand {
    /**
      * Initialize the Understand version of Preview
      *
      * @param domain - The Twilio (Twilio.Preview) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait Understand
    extends typings.twilio.libBaseVersionMod.default {
    
    /** assistants - { Twilio.Preview.Understand.AssistantListInstance } resource */
    /* protected */ var _assistants: js.UndefOr[AssistantListInstance] = js.native
    
    /** Getter for assistants resource */
    def assistants: AssistantListInstance = js.native
  }
}
