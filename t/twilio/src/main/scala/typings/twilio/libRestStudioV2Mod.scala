package typings.twilio

import typings.twilio.libRestStudioBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestStudioV2Mod {
  
  @JSImport("twilio/lib/rest/studio/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of Studio
      *
      * @param domain - The Twilio (Twilio.Studio) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** flowValidate - { Twilio.Studio.V2.FlowValidateListInstance } resource */
    /* protected */ var _flowValidate: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowValidateListInstance */ Any
      ] = js.native
    
    /** flows - { Twilio.Studio.V2.FlowListInstance } resource */
    /* protected */ var _flows: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowListInstance */ Any
      ] = js.native
    
    /** Getter for flowValidate resource */
    def flowValidate: Any = js.native
    
    /** Getter for flows resource */
    def flows: Any = js.native
  }
}
