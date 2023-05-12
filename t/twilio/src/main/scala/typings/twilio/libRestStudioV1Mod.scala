package typings.twilio

import typings.twilio.libRestStudioBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestStudioV1Mod {
  
  @JSImport("twilio/lib/rest/studio/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Studio
      *
      * @param domain - The Twilio (Twilio.Studio) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** flows - { Twilio.Studio.V1.FlowListInstance } resource */
    /* protected */ var _flows: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowListInstance */ Any
      ] = js.native
    
    /** Getter for flows resource */
    def flows: Any = js.native
  }
}
